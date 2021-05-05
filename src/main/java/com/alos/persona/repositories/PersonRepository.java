package com.alos.persona.repositories;

import com.alos.persona.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {  
}
