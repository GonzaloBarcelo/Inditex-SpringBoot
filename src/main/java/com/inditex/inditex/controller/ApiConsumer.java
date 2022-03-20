package com.inditex.inditex.controller;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@JsonIgnoreProperties
@RestController
public class ApiConsumer {
    @GetMapping("/consume/api")
    public @ResponseBody
    ResponseEntity<String> getValues(){
        String url="d";
        return ResponseEntity.ok().body(url);
    }
}

