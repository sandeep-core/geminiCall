package com.example.geminicall.service;

import com.example.geminicall.model.geminiModel;
import com.example.geminicall.repository.geminiRepository;
import org.springframework.stereotype.Service;

@Service
public class geminiService {
    private final geminiRepository repository;

    public geminiService(geminiRepository repository) {
        this.repository = repository;
    }

    //create
    public geminiModel addchat(geminiModel chat){
        String response ="this is response from gemini";
        chat.setResponse(response);
        return this.repository.save(chat);
    }
}
