package com.example.mongodb.service;

import com.example.mongodb.domain.Estudiante;

import com.example.mongodb.repository.EstudiantePersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EstudianteServiceImpl implements EstudianteService {
    @Autowired
    private EstudiantePersistence estudianteRepo;

    @Override
    public Estudiante save(Estudiante estudiante) {
        return estudianteRepo.save(estudiante);
    }

    @Override
    public List<Estudiante> getAllEstudiante() {
        return estudianteRepo.findAll();
    }


}
