package com.example.demo.service;

import com.example.demo.entity.Persona;

import java.util.List;

public interface PersonaService {
    List<Persona> getAll();
    Persona guardarPersona(Persona persona);
}
