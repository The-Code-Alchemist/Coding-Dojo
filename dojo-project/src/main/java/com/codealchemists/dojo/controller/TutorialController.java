package com.codealchemists.dojo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TutorialController {

    @GetMapping("/tutorials")
    public List<String> getTutorials() {
        return List.of(
                "Java Basics",
                "Spring Boot Intro",
                "Docker Fundamentals"
        );
    }
}
