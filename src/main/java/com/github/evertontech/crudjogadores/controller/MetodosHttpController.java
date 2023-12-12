package com.github.evertontech.crudjogadores.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/metodos")
public class MetodosHttpController {

    @GetMapping
    public String metodoGet() {
        return "Requisição do tipo GET";
    }

    @PostMapping
    public String metodoPost() {
        return "Requição do tipo POST";
    }

    @PutMapping
    public String metodoPut() {
        return "Requisição do tipo PUT";
    }

    @DeleteMapping
    public String metodoDelete() {
        return "Requisição do tipo DELETE";
    }
}
