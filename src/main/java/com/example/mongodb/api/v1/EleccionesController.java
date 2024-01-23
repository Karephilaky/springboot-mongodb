package com.example.mongodb.api.v1;


import com.example.mongodb.domain.Elecciones;
import com.example.mongodb.service.EleccionesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1.0/Elecciones")
public class EleccionesController {

    @Autowired
    private EleccionesService eleccionesService;

    @PostMapping
    public ResponseEntity<Elecciones> create(@RequestBody Elecciones elecciones) {
        return new ResponseEntity<>(eleccionesService.save(elecciones), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Elecciones>> getAll() {
        List<Elecciones> eleccionesEntityList = eleccionesService.getAllElecciones();
        return new ResponseEntity<>(eleccionesEntityList, HttpStatus.OK);
    }


}
