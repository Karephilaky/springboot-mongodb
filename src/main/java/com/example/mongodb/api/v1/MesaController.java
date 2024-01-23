package com.example.mongodb.api.v1;


import com.example.mongodb.domain.Mesa;
import com.example.mongodb.service.MesaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1.0/Mesa")
public class MesaController {

    @Autowired
    private MesaService mesaService;

    @PostMapping
    public ResponseEntity<Mesa> create(@RequestBody Mesa mesa) {
        return new ResponseEntity<>(mesaService.save(mesa), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Mesa>> getAll() {
        List<Mesa> mesaEntityList = mesaService.getAllMesa();
        return new ResponseEntity<>(mesaEntityList, HttpStatus.OK);
    }


}