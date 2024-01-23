package com.example.mongodb.service;

import com.example.mongodb.domain.Candidatos;
import com.example.mongodb.repository.CandidatosPersistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CandidatosServiceImpl implements CandidatosService {
    @Autowired
    private CandidatosPersistence candidatosRepo;

    @Override
    public Candidatos save(Candidatos candidatos) {
        return candidatosRepo.save(candidatos);
    }

    @Override
    public List<Candidatos> getAllCandidatos() {
        return candidatosRepo.findAll();
    }


}
