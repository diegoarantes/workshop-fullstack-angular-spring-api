package com.arantes.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arantes.vendas.model.Produto;

public interface Produtos extends JpaRepository<Produto, Long> {

}
