package com.github.souzaraphael.api_carros.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.souzaraphael.api_carros.models.Carro;

public interface RepositoryCarro extends JpaRepository<Carro, Long> {

}