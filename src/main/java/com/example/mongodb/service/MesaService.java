package com.example.mongodb.service;

import java.util.List;

import com.example.mongodb.domain.Mesa;

public interface MesaService {

    public Mesa save(Mesa mesa);

    List<Mesa> getAllMesa();


}