package com.codingdojo.controller;

import com.codingdojo.model.Tutorial;
import com.codingdojo.repositories.TutorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/tutorials")
@CrossOrigin(origins = "http://localhost:3000")  // Allow React frontend to access API
public class TutorialController {

    @Autowired
    private final TutorialRepository tutorialRepository;

    public TutorialController(TutorialRepository tutorialRepository) {
        this.tutorialRepository = tutorialRepository;
    }

    // ✅ GET all tutorials (with optional filtering by platform)
    @GetMapping
    public ResponseEntity<List<Tutorial>> getAllTutorials(@RequestParam(required = false) String source) {
        List<Tutorial> tutorials = (source != null) ?
                tutorialRepository.findByPlatform(source) :
                tutorialRepository.findAll();
        return ResponseEntity.ok(tutorials);
    }

    @GetMapping
    public ResponseEntity<Page<Tutorial>> getAllTutorials(
            @RequestParam(required = false) String source,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int size) {

        Pageable pageable = PageRequest.of(page, size);
        Page<Tutorial> tutorials;

        if (source != null) {
            tutorials = tutorialRepository.findByPlatform(source, pageable);
        } else {
            tutorials = tutorialRepository.findAll(pageable);
        }

        return ResponseEntity.ok(tutorials);
    }

    // ✅ GET a tutorial by ID
    @GetMapping("/{id}")
    public ResponseEntity<Tutorial> getTutorialById(@PathVariable Long id) {
        Optional<Tutorial> tutorial = tutorialRepository.findById(id);
        return tutorial.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // ✅ POST: Create a new tutorial
    @PostMapping
    public ResponseEntity<Tutorial> createTutorial(@RequestBody Tutorial tutorial) {
        Tutorial savedTutorial = tutorialRepository.save(tutorial);
        return ResponseEntity.status(201).body(savedTutorial);
    }

    // ✅ PUT: Update a tutorial by ID
    @PutMapping("/{id}")
    public ResponseEntity<Tutorial> updateTutorial(@PathVariable Long id, @RequestBody Tutorial tutorialDetails) {
        return tutorialRepository.findById(id)
                .map(tutorial -> {
                    tutorial.setTitle(tutorialDetails.getTitle());
                    tutorial.setDescription(tutorialDetails.getDescription());
                    tutorial.setLink(tutorialDetails.getLink());
                    tutorial.setPlatform(tutorialDetails.getPlatform());
                    tutorialRepository.save(tutorial);
                    return ResponseEntity.ok(tutorial);
                })
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // ✅ DELETE: Remove a tutorial by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTutorial(@PathVariable Long id) {
        if (!tutorialRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        tutorialRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
