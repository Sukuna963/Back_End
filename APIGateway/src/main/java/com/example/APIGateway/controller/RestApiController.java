package com.example.APIGateway.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class RestApiController {

    @GetMapping("/test")
    public ResponseEntity<String> getAnonymous() {
        return ResponseEntity.ok("Welcome");
    }
}
