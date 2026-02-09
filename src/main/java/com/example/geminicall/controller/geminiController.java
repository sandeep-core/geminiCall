package com.example.geminicall.controller;

import com.example.geminicall.model.geminiModel;
import com.example.geminicall.service.geminiService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class geminiController {
    private final geminiService service;

    public geminiController(geminiService service) {
        this.service = service;
    }
    @PostMapping("/add-chat")
    public geminiModel addchat( @RequestBody geminiModel chat){
        return service.addchat(chat);
    }
}
