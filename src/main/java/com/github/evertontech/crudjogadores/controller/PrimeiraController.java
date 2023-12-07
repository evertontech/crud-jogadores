package com.github.evertontech.crudjogadores.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiraController {

    @GetMapping
    public String get() {
        return "Hello World!";
    }
}
