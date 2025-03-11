package com.codingdojo.controller;

import com.codingdojo.model.Tutorial;
import com.codingdojo.repository.TutorialRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/tutorials")
@CrossOrigin(origins = "http://localhost:3000")  // Allow React frontend to access API
public class TutorialController {

    private final TutorialRepository tutorialRepository;

    public TutorialController(TutorialRepository tutorialRepository) {
        this.tutorialRepository = tutorialRepository;
    }

    // Fetch tutorials by platform
    @GetMapping
    public List<Tutorial> getTutorials(@RequestParam String source) {
        return tutorialRepository.findByPlatform(source);
    }

    // Add new tutorial (for testing)
    @PostMapping
    public Tutorial addTutorial(@RequestBody Tutorial tutorial) {
        return tutorialRepository.save(tutorial);
    }
}
