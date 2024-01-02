package com.example.cicd_maven.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/welcome")
    public String Welcome() {
        return "Velkommen til det nye år";

    }
}