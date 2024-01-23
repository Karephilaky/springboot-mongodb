package com.example.mongodb.service;

import com.example.mongodb.domain.Curso;
import com.example.mongodb.repository.CursoPersistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CursoServiceImpl implements CursoService {
    @Autowired
    private CursoPersistence cursoRepo;

    @Override
    public Curso save(Curso curso) {
        return cursoRepo.save(curso);
    }

    @Override
    public List<Curso> getAllCurso() {
        return cursoRepo.findAll();
    }


}
