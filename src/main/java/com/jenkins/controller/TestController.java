package com.jenkins.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class TestController {

    @GetMapping("/test")
    public String getTest() {
        return "GET request successful";
    }

    // To Create
    @PostMapping("/test")
    public String createTest() {
        return "POST request successful";
    }

    // To delete
    @DeleteMapping("/test")
    public String deleteTest() {
        return "DELETE request successful";
    }

    // To update
    @PutMapping("/test")
    public String updateTest() {
        return "PUT request successful";
    }

    
    @GetMapping("/all")
    public String getAll(){
        return "GET All request successful";
    }

}

