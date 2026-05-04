package com.github.souzaraphael.api_carros.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.souzaraphael.api_carros.models.Marca;
import com.github.souzaraphael.api_carros.repositories.RepositoryMarca;

@RestController
@RequestMapping("marcas")
public class MarcasController {
    // @GetMapping("listar")
    // public String listarMarcas() {
    //     return "honda, fiat, hyundai";
    // }

    @Autowired
    private RepositoryMarca repository;

    @GetMapping
    private ResponseEntity<List<Marca>> findAll() {
        return ResponseEntity.ok(repository.findAll());
    }

    @PostMapping
    private ResponseEntity<Marca> create(@RequestBody Marca marca) {
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(marca));
    }

    @PutMapping
    private ResponseEntity<Marca> update(@PathVariable Long id, @RequestBody Marca marca) {
        return repository.findById(id).isPresent()
                ? ResponseEntity.ok(repository.save(marca.setId(id)))
                : ResponseEntity.notFound().build();
    }

    @DeleteMapping("{id}")
    private ResponseEntity<Void> delete(@PathVariable Long id) {
        if (repository.findById(id).isPresent()) {
            repository.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
