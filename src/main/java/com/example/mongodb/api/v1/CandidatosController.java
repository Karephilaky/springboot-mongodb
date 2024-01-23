package com.example.mongodb.api.v1;

import com.example.mongodb.domain.Candidatos;
import com.example.mongodb.domain.Pais;
import com.example.mongodb.service.CandidatosService;
import com.example.mongodb.service.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1.0/Candidatos")
public class CandidatosController {

    @Autowired
    private CandidatosService candidatosService;

    @PostMapping
    public ResponseEntity<Candidatos> create(@RequestBody Candidatos candidatos) {
        return new ResponseEntity<>(candidatosService.save(candidatos), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Candidatos>> getAll() {
        List<Candidatos> candidatosEntityList = candidatosService.getAllCandidatos();
        return new ResponseEntity<>(candidatosEntityList, HttpStatus.OK);
    }


    }
