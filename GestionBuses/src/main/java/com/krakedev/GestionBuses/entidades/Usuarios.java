package com.krakedev.GestionBuses.entidades;

public class Usuarios {
	private String id;
	private String nombre;
	private String apellido;
	private String correoElectronico;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	@Override
	public String toString() {
		return "Usuarios [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", correoElectronico="
				+ correoElectronico + "]";
	}
	public Usuarios(String id, String nombre, String apellido, String correoElectronico) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correoElectronico = correoElectronico;
	}
	public Usuarios() {
		super();
	}
	
	
}
