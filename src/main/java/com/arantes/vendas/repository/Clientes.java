package com.arantes.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arantes.vendas.model.Cliente;

public interface Clientes extends JpaRepository<Cliente, Long>{

}
