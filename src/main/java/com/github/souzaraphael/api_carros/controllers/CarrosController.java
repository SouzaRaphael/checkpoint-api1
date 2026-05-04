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

import com.github.souzaraphael.api_carros.models.Carro;
import com.github.souzaraphael.api_carros.repositories.RepositoryCarro;

@RestController
@RequestMapping("carros")
public class CarrosController {
    // @GetMapping("listar")
    // public String listarCarros() {
        //     return "uno, civic, toro";
        // }
        
        // @GetMapping("precos")
        // public String listarPrecos() {
            //     return "1000, 500, 2000 (bons precos ;])";
            // }
            
    @Autowired
    private RepositoryCarro repository;

    @GetMapping
    private ResponseEntity<List<Carro>> findAll() {
        return ResponseEntity.ok(repository.findAll());
    }

    @PostMapping
    private ResponseEntity<Carro> create(@RequestBody Carro carro) {
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(carro));
    }

    @PutMapping
    private ResponseEntity<Carro> update(@PathVariable Long id, @RequestBody Carro carro) {
        return repository.findById(id).isPresent()
                ? ResponseEntity.ok(repository.save(carro.setId(id)))
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