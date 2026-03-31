package com.codealchemists.dojo.controller;

import com.codealchemists.dojo.model.Tutorial;
import com.codealchemists.dojo.service.TutorialService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TutorialController {

    private final TutorialService tutorialService = new TutorialService();

    @GetMapping("/tutorials")
    public List<Tutorial> getTutorials() {
        return tutorialService.getTutorials();
    }
}
