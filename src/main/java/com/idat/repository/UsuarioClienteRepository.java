package com.idat.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idat.model.UsuarioCliente;

public interface UsuarioClienteRepository extends JpaRepository<UsuarioCliente, Integer> {

	UsuarioCliente findByUsuario(String username);

}
