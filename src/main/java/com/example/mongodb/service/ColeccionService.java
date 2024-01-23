package com.example.mongodb.service;

import java.util.List;

import com.example.mongodb.domain.Coleccion;


public interface ColeccionService {

    public Coleccion save(Coleccion coleccion);

    List<Coleccion> getAllColeccion();


}