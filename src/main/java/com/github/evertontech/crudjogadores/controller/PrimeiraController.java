package com.github.evertontech.crudjogadores.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiraController {

    @GetMapping("/")
    public String get() {
        return "Hello World!";
    }

    @GetMapping("/e1")
    public String exercicio1() {
        return "Exercício1";
    }

    @GetMapping("/uol-esportes")
    public int conta1() {
        int soma = 1 + 2;
        return soma;
    }
}
