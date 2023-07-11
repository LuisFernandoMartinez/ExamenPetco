package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="complete_name")
    private String completeName;
    @Column(name="age")
    private int age;

    public Persona(String completeName, int age) {
        this.completeName = completeName;
        this.age = age;
    }
}
