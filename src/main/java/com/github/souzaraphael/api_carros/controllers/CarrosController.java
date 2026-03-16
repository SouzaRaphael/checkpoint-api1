package com.github.souzaraphael.api_carros.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("carros")
public class CarrosController {

    @GetMapping("listar")
    public String listarCarros() {
        return "uno, civic, toro";
    }

    @GetMapping("precos")
    public String listarPrecos() {
        return "1000, 500, 2000 (bons precos ;])";
    }
}