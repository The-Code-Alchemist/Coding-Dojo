package com.codealchemists.dojo.controller;

import com.codealchemists.dojo.model.Tutorial;
import com.codealchemists.service.TutorialService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TutorialController {

    private final TutorialService tutorialService;

    public TutorialController(TutorialService tutorialService) {
        this.tutorialService = tutorialService;
    }

    @GetMapping("/tutorials")
    public List<Tutorial> getTutorials() {
        return tutorialService.getTutorials();
    }
}
