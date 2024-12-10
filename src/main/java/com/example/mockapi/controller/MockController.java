package com.example.mockapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MockController {
    @GetMapping("/sample")
    public String sample()
    {
        return "Hello Mock Api";
    }
}
