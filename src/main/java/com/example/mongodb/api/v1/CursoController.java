package com.example.mongodb.api.v1;


import com.example.mongodb.domain.Curso;
import com.example.mongodb.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1.0/Curso")
public class CursoController {

    @Autowired
    private CursoService cursoService;

    @PostMapping
    public ResponseEntity<Curso> create(@RequestBody Curso curso) {
        return new ResponseEntity<>(cursoService.save(curso), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Curso>> getAll() {
        List<Curso> cursoEntityList = cursoService.getAllCurso();
        return new ResponseEntity<>(cursoEntityList, HttpStatus.OK);
    }


}
