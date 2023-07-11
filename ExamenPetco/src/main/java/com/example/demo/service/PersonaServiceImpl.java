package com.example.demo.service;
import com.example.demo.dao.PersonRepository;
import com.example.demo.entity.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {
    @Autowired
    private PersonRepository personRepository;
    @Override
    public List<Persona> getAll() {
        return (List<Persona>) personRepository.findAll();
    }

    @Override
    public Persona guardarPersona(Persona persona) {
        return personRepository.save(persona);
    }
}
