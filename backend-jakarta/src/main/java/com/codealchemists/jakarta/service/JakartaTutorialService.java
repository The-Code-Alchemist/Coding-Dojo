package com.codealchemists.jakarta.service;

import com.codealchemists.dojo.model.Tutorial;
import com.codealchemists.service.TutorialService;

import java.util.List;

public class JakartaTutorialService implements TutorialService {

    @Override
    public List<Tutorial> getTutorials() {
        return List.of(
                new Tutorial("Java Basics", "YouTube"),
                new Tutorial("Jakarta EE Intro", "Udemy"),
                new Tutorial("Docker Fundamentals", "YouTube")
        );
    }
}
