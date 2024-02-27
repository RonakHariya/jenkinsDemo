package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("jenkins")
public class TestController {

    @GetMapping("test")
    public ResponseEntity<String> getTest() {
        return new ResponseEntity<>("GET request successful",HttpStatus.OK);
    }

    @PostMapping("test")
    public String createTest() {
        return "POST request successful";
    }

    @DeleteMapping("test")
    public String deleteTest() {
        return "DELETE request successful";
    }

    @PutMapping("test")
    public String updateTest() {
        return "PUT request successful";
    }
    
    @GetMapping("all")
    public String getAll() {
    	return "GET all request successful";
    }
}

