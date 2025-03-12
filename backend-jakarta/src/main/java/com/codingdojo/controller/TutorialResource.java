package com.codingdojo.controller;

import com.codingdojo.model.Tutorial;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.List;
import java.util.ArrayList;

@Path("/api/tutorials") // Defines the base URL: /api/tutorials
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TutorialResource {

    private static List<Tutorial> tutorials = new ArrayList<>();

    static {
        tutorials.add(new Tutorial(1L, "Spring Boot Basics", "Intro to Spring Boot", "https://youtube.com/spring-boot", "YouTube"));
        tutorials.add(new Tutorial(2L, "Hibernate Guide", "JPA with Hibernate", "https://udemy.com/hibernate", "Udemy"));
    }

    @GET
    public Response getAllTutorials() {
        return Response.ok(tutorials).build();
    }

    @GET
    @Path("/{id}")
    public Response getTutorialById(@PathParam("id") Long id) {
        return tutorials.stream()
                .filter(t -> t.getId().equals(id))
                .findFirst()
                .map(t -> Response.ok(t).build())
                .orElse(Response.status(Response.Status.NOT_FOUND).build());
    }
}
