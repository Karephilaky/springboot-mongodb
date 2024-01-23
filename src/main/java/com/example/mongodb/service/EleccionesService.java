package com.example.mongodb.service;

import java.util.List;

import com.example.mongodb.domain.Elecciones;

public interface EleccionesService {

    public Elecciones save(Elecciones elecciones);

    List<Elecciones> getAllElecciones();


}