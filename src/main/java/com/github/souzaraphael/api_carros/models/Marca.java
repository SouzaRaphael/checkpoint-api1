package com.github.souzaraphael.api_carros.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table (name = "marcas")

@Data
public class Marca {
    @Id
    private Long id;
    private String nome;

    public Marca setId(Long id) {
        this.id = id;
        return this;
    }
}
