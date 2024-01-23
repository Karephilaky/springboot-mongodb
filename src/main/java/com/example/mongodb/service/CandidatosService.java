package com.example.mongodb.service;

import java.util.List;

import com.example.mongodb.domain.Candidatos;

public interface CandidatosService {

    public Candidatos save(Candidatos candidatos);

    List<Candidatos> getAllCandidatos();


}
