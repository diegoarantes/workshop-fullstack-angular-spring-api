package com.arantes.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arantes.vendas.model.Venda;

public interface Vendas extends JpaRepository<Venda, Long> {

}
