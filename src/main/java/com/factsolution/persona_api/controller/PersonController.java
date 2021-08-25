package com.factsolution.persona_api.controller;


import com.factsolution.persona_api.dto.response.MessageResponseDTO;
import com.factsolution.persona_api.entity.Person;
import com.factsolution.persona_api.repository.PersonRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/people") // caminho de acesso
public class PersonController {

    private PersonRepository personRepository; // instacia a classe personRepository do package repository

    @Autowired// inversão de controle e injeção de dependencia
    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @PostMapping // method de post de pessoa
    public MessageResponseDTO creatPerson(@RequestBody Person person) {
        Person savedPerson = personRepository.save(person);
        return MessageResponseDTO
                .builder()
                .message("Created person with ID " + savedPerson.getId())
                .build();
    }

}
