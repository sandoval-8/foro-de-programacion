package principal.service;

import java.util.List;

import org.springframework.stereotype.Service;

import principal.entity.Clase;

@Service
public interface claseService {
	
	public List<Clase> getListaClases();
	
	public Clase getClase();
	
	public Clase createClase();
	
	public Clase updateClase();
	
	public void deleteClase(Long id);
}
