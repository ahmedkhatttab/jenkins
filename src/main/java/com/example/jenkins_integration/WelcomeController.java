package com.example.jenkins_integration;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/home")
public class WelcomeController {

    @GetMapping
    public ResponseEntity<String> welcome(){
        return ResponseEntity.ok("Welcome on Jenkins Integration");
    }
}
