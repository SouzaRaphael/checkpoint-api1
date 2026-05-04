package com.github.souzaraphael.api_carros.models;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table (name = "carros")

@Data
public class Carro {
    @Id
    private Long id;
    private String nome;
    private BigDecimal preco;

    public Carro setId(Long id) {
        this.id = id;
        return this;
    }
}
