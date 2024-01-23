package com.example.mongodb.api.v1;


import com.example.mongodb.domain.Estudiante;
import com.example.mongodb.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1.0/Estudiante")
public class EstudianteController {

    @Autowired
    private EstudianteService estudianteService;

    @PostMapping
    public ResponseEntity<Estudiante> create(@RequestBody Estudiante estudiante) {
        return new ResponseEntity<>(estudianteService.save(estudiante), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Estudiante>> getAll() {
        List<Estudiante> estudianteEntityList = estudianteService.getAllEstudiante();
        return new ResponseEntity<>(estudianteEntityList, HttpStatus.OK);
    }


}
