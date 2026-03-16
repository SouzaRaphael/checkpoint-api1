package com.github.souzaraphael.api_carros.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("marcas")
public class MarcasController {
    @GetMapping("listar")
    public String listarMarcas() {
        return "honda, fiat, hyundai";
    }
}
