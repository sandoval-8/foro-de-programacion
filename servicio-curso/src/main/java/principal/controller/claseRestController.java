package principal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import principal.entity.Clase;
import principal.service.claseService;

@RestController
public class claseRestController {
	
	@Autowired
	private claseService servicioClase;
	
	@GetMapping("/clase/lista")
	public ResponseEntity<List<Clase>> obtenerListaClases() {
		return new ResponseEntity(servicioClase.getListaClases(), HttpStatus.OK);
	}
	
	@GetMapping("/clase/{id}")
	public ResponseEntity<Clase> obtenerClase(@RequestBody Long id) {
		return new ResponseEntity(servicioClase.getClase(), HttpStatus.OK);
	}
	
	@PostMapping("/clase/create")
	public ResponseEntity<Clase> crearClase() {
		return new ResponseEntity(servicioClase.createClase(), HttpStatus.CREATED);
	}
	
	@PutMapping("/clase/update")
	public ResponseEntity<Clase> actualizarClase() {
		return new ResponseEntity(servicioClase.updateClase(), HttpStatus.OK);
	}
	
	@DeleteMapping("/clase/delete/{id}")
	public void borrarClase(@RequestBody Long id) {
		servicioClase.deleteClase(id);
	}
}
