package principal.controller;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import principal.entity.Clase;
import principal.service.claseServiceImpl;

@Controller
public class mainController {
	
	@Autowired
	private claseServiceImpl servicioClase;
	
	@GetMapping("/")
	public String indexPage(Model modelo) {
		System.out.println(servicioClase.getListaClases());
		List<Clase> listClass = servicioClase.getListaClases();
		List<Clase> listaClases = new ArrayList<>();
		System.out.println(Base64.getEncoder().encodeToString(listClass.get(0).getImagen()));
		for(Clase clase : listClass) {
			Clase claseEditada = new Clase();
			claseEditada.setTitulo(clase.getTitulo());
			claseEditada.setDesarrollo(clase.getDesarrollo());
			claseEditada.setPresentacion(clase.getPresentacion());
			claseEditada.setFoto(Base64.getEncoder().encodeToString(clase.getImagen()));
			System.out.println("base 64: "+Base64.getEncoder().encodeToString(clase.getImagen()));
			listaClases.add(claseEditada);
		}
		System.out.print(listClass.get(0).getImagen());
		modelo.addAttribute("listaClases", listaClases);
		/* modelo.addAttribute("foto", attributeValue) */
		return "index";
	}
}
