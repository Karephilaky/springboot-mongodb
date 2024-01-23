package com.example.mongodb.service;

import java.util.List;

import com.example.mongodb.domain.Curso;

public interface CursoService {

    public Curso save(Curso curso);

    List<Curso> getAllCurso();


}