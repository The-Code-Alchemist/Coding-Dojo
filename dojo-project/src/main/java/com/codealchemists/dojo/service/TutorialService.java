package com.codealchemists.dojo.service;

import com.codealchemists.dojo.model.Tutorial;

import java.util.List;

public class TutorialService {

    public List<Tutorial> getTutorials() {
        return List.of(
                new Tutorial("Java Basics", "YouTube"),
                new Tutorial("Spring Boot Intro", "Udemy"),
                new Tutorial("Docker Fundamentals", "YouTube")
        );
    }
}
