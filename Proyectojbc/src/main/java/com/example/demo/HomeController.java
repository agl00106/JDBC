package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@Autowired DAOInterface dao;
	
	@GetMapping(value="/tabla")
	public String metod() {
		
		List<UsuarioDTO> usuarios = new ArrayList<UsuarioDTO>();
		
		
		usuarios = dao.leeUsuarios();
		
		for(UsuarioDTO usuario:usuarios) {
			System.out.println("ID:" + usuario.getId() + "Nombre:" + usuario.getNombre());
		}
		
		return "vista";
	}
}
