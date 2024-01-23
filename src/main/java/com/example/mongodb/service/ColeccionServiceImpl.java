package com.example.mongodb.service;

import com.example.mongodb.domain.Coleccion;
import com.example.mongodb.repository.ColeccionPersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ColeccionServiceImpl implements ColeccionService {
    @Autowired
    private ColeccionPersistence coleccionRepo;

    @Override
    public Coleccion save(Coleccion coleccion) {
        return coleccionRepo.save(coleccion);
    }

    @Override
    public List<Coleccion> getAllColeccion() {
        return coleccionRepo.findAll();
    }


}