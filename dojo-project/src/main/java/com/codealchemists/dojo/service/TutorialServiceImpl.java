package com.codealchemists.dojo.service;

import com.codealchemists.dojo.model.Tutorial;
import com.codealchemists.service.TutorialService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TutorialServiceImpl implements TutorialService {

    @Override
    public List<Tutorial> getTutorials() {
        return List.of(
                new Tutorial("Java Basics", "YouTube"),
                new Tutorial("Spring Boot Intro", "Udemy"),
                new Tutorial("Docker Fundamentals", "YouTube")
        );
    }
}
