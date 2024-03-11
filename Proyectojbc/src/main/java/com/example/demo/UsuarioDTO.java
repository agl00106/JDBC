package com.example.demo;

import java.io.Serializable;

public class UsuarioDTO implements Serializable {
	
	public UsuarioDTO(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	private int id;
	private String nombre;

	public UsuarioDTO() {
		super();
		this.id = -1;
		this.nombre = "";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
