package com.codealchemists.jakarta.controller;

import com.codealchemists.dojo.model.Tutorial;
import com.codealchemists.jakarta.service.JakartaTutorialService;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/tutorials")
public class TutorialResource {

    private final JakartaTutorialService service = new JakartaTutorialService();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Tutorial> getTutorials() {
        return service.getTutorials();
    }
}
