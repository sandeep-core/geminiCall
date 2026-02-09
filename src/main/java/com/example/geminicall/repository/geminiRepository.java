package com.example.geminicall.repository;

import com.example.geminicall.model.geminiModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface geminiRepository extends MongoRepository<geminiModel,String> {
}
