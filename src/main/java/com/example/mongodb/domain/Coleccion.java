package com.example.mongodb.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.aggregation.ArrayOperators;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;

@Document(collection = "Colección_voto")
public class Coleccion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private String id;

    private Elecciones eleccion;
    private Candidatos candidato;

    private Mesa mesa;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Elecciones getEleccion() {
        return eleccion;
    }
    public void setEleccion(Elecciones eleccion) {
        this.eleccion = eleccion;
    }

    public Candidatos getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidatos candidato) {
        this.candidato = candidato;
    }


    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public Mesa getMesa() {
        return mesa;
    }

}

