package com.example.demo.dao;

import com.example.demo.entity.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Persona, Long> {
}
