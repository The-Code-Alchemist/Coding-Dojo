package com.codealchemists.dojo.controller;

import com.codealchemists.dojo.model.Tutorial;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TutorialController {

    @GetMapping("/tutorials")
    public List<Tutorial> getTutorials() {
        return List.of(
                new Tutorial("Java Basics", "YouTube"),
                new Tutorial("Spring Boot Intro", "Udemy"),
                new Tutorial("Docker Fundamentals", "YouTube")
        );
    }
}
