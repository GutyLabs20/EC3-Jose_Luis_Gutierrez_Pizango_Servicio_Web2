package com.idat.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idat.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
