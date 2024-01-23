package com.example.mongodb.repository;


import com.example.mongodb.domain.Estudiante;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EstudiantePersistence extends MongoRepository<Estudiante, Long> {
}
