package ar.edu.unju.fi.tp1pto1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.fi.tp1pto1.model.Provincia;

@Controller
public class ProvinciaController {
	
	@Autowired
	private Provincia provincia;
	/**
	 * Método que devuelve el objeto provincia
	 * @param model 
	 * @return un String que indica el nombre del archivo html de la vista
	 */
	@GetMapping("/provincias")
	public String getProvincia(Model model) {
		this.provincia.setNombre("Jujuy");
		this.provincia.setCodigo(388);
		model.addAttribute("provincia", this.provincia);
		return "provincias";		
	}

}
