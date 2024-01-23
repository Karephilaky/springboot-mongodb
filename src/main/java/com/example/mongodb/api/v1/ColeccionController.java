package com.example.mongodb.api.v1;


import com.example.mongodb.domain.Coleccion;
import com.example.mongodb.service.ColeccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1.0/Coleccion")
public class ColeccionController {

    @Autowired
    private ColeccionService coleccionService;

    @PostMapping
    public ResponseEntity<Coleccion> create(@RequestBody Coleccion coleccion) {
        return new ResponseEntity<>(coleccionService.save(coleccion), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Coleccion>> getAll() {
        List<Coleccion> coleccionEntityList = coleccionService.getAllColeccion();
        return new ResponseEntity<>(coleccionEntityList, HttpStatus.OK);
    }


}
