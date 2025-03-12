package com.codingdojo;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

@ApplicationPath("/api") // Base path for all REST endpoints
public class ApplicationConfig extends Application {
}
