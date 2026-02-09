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
        return this.repository.save(chat);
    }
}
