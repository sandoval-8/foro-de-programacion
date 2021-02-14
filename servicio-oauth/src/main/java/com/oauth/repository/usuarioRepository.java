package com.oauth.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.oauth.usuario.usuario;


public interface usuarioRepository extends CrudRepository<usuario, Long>{

	public usuario findByUsername(String username);
}
