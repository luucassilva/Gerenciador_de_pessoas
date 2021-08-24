package com.factsolution.persona_api.controller;


import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/people") // caminho de acesso
public class PersonController {

    @GetMapping
    public String getBook() {
        return " API REST Test! ";
    }

}
