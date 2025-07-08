package com.rafael.backend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping
    public ResponseEntity<ApiResponse> testAWS() {
        return ResponseEntity.ok(new ApiResponse("version 0.1"));
    }
}
