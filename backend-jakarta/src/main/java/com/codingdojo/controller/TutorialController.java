package com.codingdojo.controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/tutorials")
public class TutorialController {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getTutorials() {
        return "Hello from Jakarta EE!";
    }
}
