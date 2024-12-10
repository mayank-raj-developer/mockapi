package com.example.mockapi.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MockController {
    @GetMapping("/sample")
    public JsonNode sample() throws  JsonProcessingException
    {
        String temp="{\"message\": \"Hello Feign\"}";
        ObjectMapper objectMapper=new ObjectMapper();
        return objectMapper.readTree(temp);
    }
}
