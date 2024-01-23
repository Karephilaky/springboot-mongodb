package com.example.mongodb.repository;


import com.example.mongodb.domain.Elecciones;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EleccionesPersistence extends MongoRepository<Elecciones, Long> {
}
