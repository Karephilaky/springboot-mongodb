package com.example.mongodb.service;

import com.example.mongodb.domain.Elecciones;
import com.example.mongodb.repository.EleccionesPersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EleccionesServiceImpl implements EleccionesService {
    @Autowired
    private EleccionesPersistence eleccionesRepo;

    @Override
    public Elecciones save(Elecciones elecciones) {
        return eleccionesRepo.save(elecciones);
    }

    @Override
    public List<Elecciones> getAllElecciones() {
        return eleccionesRepo.findAll();
    }


}