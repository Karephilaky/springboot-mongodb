package com.example.mongodb.repository;

import com.example.mongodb.domain.Candidatos;
import com.example.mongodb.domain.Curso;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.mongodb.domain.Candidatos;

import java.util.List;

public interface CursoPersistence extends MongoRepository<Curso, Long> {
}
