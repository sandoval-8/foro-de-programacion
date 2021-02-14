package principal.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import principal.entity.Clase;
import principal.repository.claseRepository;

@Service
@Primary
public class claseServiceImpl implements claseService{
	
	private Logger log = LoggerFactory.getLogger(claseServiceImpl.class);
	
	@Autowired
	private claseRepository repositorioClase;

	@Override
	public List<Clase> getListaClases() {
		// TODO Auto-generated method stub
		List<Clase> clases = repositorioClase.findAll();
		if(clases!=null) {
			log.debug("Se envio: " + clases);
		}else {
			log.debug("es nulo");
		}
		return clases;
	}

	@Override
	public Clase getClase() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Clase createClase() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Clase updateClase() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteClase(Long id) {
		// TODO Auto-generated method stub
		
	}

}
