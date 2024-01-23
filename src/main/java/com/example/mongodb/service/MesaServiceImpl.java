package com.example.mongodb.service;

import com.example.mongodb.domain.Mesa;

import com.example.mongodb.repository.MesaPersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class MesaServiceImpl implements MesaService {
    @Autowired
    private MesaPersistence mesaRepo;

    @Override
    public Mesa save(Mesa mesa) {
        return mesaRepo.save(mesa);
    }

    @Override
    public List<Mesa> getAllMesa() {
        return mesaRepo.findAll();
    }


}
