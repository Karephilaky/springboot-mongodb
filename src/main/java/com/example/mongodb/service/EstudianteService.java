package com.example.mongodb.service;

import java.util.List;

import com.example.mongodb.domain.Estudiante;

public interface EstudianteService {

    public Estudiante save(Estudiante estudiante);

    List<Estudiante> getAllEstudiante();


}