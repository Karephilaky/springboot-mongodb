package com.example.mongodb.repository;


import com.example.mongodb.domain.Coleccion;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ColeccionPersistence extends MongoRepository<Coleccion, Long> {
}
