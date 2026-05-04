package com.github.souzaraphael.api_carros.models;

import jakarta.persistence.Column;
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
    @Column(name = "data_criacao")
    private String dataCriacao;
    @Column(name = "qtde_carros")
    private Long qtdeCarros;
    @Column(name = "qtde_pecas_estoque", nullable = false)
    private Long qtdePecasEstoque;

    public Marca setId(Long id) {
        this.id = id;
        return this;
    }
}
