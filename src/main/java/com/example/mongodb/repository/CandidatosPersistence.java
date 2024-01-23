package com.example.mongodb.repository;

import com.example.mongodb.domain.Candidatos;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface CandidatosPersistence extends MongoRepository<Candidatos, Long> {
}
