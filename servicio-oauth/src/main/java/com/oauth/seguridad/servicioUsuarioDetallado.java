package com.oauth.seguridad;

import java.util.List;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.oauth.repository.usuarioRepository;
import com.oauth.usuario.usuario;


@Service
public class servicioUsuarioDetallado implements UserDetailsService{
	
	private Logger log = LoggerFactory.getLogger(servicioUsuarioDetallado.class);
	
	@Autowired
	private usuarioRepository repositorio;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		log.info("EMPEZO LA COMPROBACION");
		usuario USUARIO = repositorio.findByUsername(username);
		List<GrantedAuthority> authorities = USUARIO.getRoles()
				.stream()
				.map(role -> new SimpleGrantedAuthority(role.getRole()))
				.collect(Collectors.toList());
		return new User(USUARIO.getUsername(), USUARIO.getPassword(), false, false, false, false, authorities);
	}

}
