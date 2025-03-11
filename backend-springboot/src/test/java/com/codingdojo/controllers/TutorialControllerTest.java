package com.codingdojo.controllers;

import com.codingdojo.model.Tutorial;
import com.codingdojo.repository.TutorialRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class TutorialControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private TutorialRepository tutorialRepository;

    @Autowired
    private ObjectMapper objectMapper; // For converting Java objects to JSON

    @BeforeEach
    void setUp() {
        tutorialRepository.deleteAll(); // Clean database before each test
        tutorialRepository.saveAll(List.of(
                new Tutorial("Spring Boot Basics", "Intro to Spring Boot", "https://youtube.com/spring-boot", "YouTube"),
                new Tutorial("Hibernate Guide", "JPA with Hibernate", "https://udemy.com/hibernate", "Udemy")
        ));
    }

    @Test
    void testGetTutorialsBySource() throws Exception {
        mockMvc.perform(get("/api/tutorials")
                        .param("source", "YouTube"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.length()").value(1)) // Expect 1 YouTube tutorial
                .andExpect(jsonPath("$[0].title").value("Spring Boot Basics"));
    }

    @Test
    void testCreateTutorial() throws Exception {
        Tutorial newTutorial = new Tutorial("New Java Course", "A great Java course for beginners",
                "https://udemy.com/java-course", "Udemy");

        mockMvc.perform(post("/api/tutorials")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(newTutorial)))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.title").value("New Java Course"))
                .andExpect(jsonPath("$.platform").value("Udemy"));
    }
}
