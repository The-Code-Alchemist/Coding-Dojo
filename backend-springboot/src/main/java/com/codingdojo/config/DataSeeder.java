package com.codingdojo.config;

import com.codingdojo.model.Tutorial;
import com.codingdojo.repositories.TutorialRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataSeeder implements CommandLineRunner {

    private final TutorialRepository tutorialRepository;

    public DataSeeder(TutorialRepository tutorialRepository) {
        this.tutorialRepository = tutorialRepository;
    }

    @Override
    public void run(String... args) {
        if (tutorialRepository.count() == 0) {
            tutorialRepository.saveAll(List.of(
                    new Tutorial(null, "Spring Boot Basics", "Learn Spring Boot in 30 minutes", "https://youtube.com/...", "YouTube"),
                    new Tutorial(null, "Java Full Course", "Master Java in 10 hours", "https://udemy.com/...", "Udemy"),
                    new Tutorial(null, "Microservices Architecture", "Deep dive into microservices", "https://platform.com/...", "Other")
            ));
        }
    }
}
