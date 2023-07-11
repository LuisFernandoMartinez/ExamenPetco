package com.example.demo.controller;

import com.example.demo.entity.Persona;
import com.example.demo.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;



@RestController
@RequestMapping("/root")
public class PersonaController {
    @Autowired
    private PersonaService personaService;

    @GetMapping("/obtainAll")
    private ResponseEntity<List<Persona>> getAllPrincipal(){
         try{
             List<Persona>listTransform= personaService.getAll();
             listTransform.stream()
                     .map(persona -> {
                  Persona persona1=persona;
                  persona1.setCompleteName(persona.getCompleteName().toUpperCase());
                  return persona1;
                     }).collect(Collectors.toList());
             return new ResponseEntity<>(listTransform,HttpStatus.ACCEPTED);
         }catch(Exception e){
             System.out.println(e);
             return new ResponseEntity<>(null,HttpStatus.NO_CONTENT);
        }
    }
    @PostMapping("/add")
    private ResponseEntity<Persona> addOne(@RequestBody Persona persona){
        try{
            Persona personaTr=personaService.guardarPersona(persona);
            return new ResponseEntity<>(personaTr,HttpStatus.ACCEPTED);
        }catch{
            return new ResponseEntity<>(null,HttpStatus.NO_CONTENT);
        }
    }
}
