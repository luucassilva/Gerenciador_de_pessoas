package com.factsolution.persona_api.repository;

import com.factsolution.persona_api.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {



}
