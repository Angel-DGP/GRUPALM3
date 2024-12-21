package com.krakedev.GestionBuses.entidades;

public class Buses {
	private int id;
	private String nombre;
	private int capacidadMaxima;
	private boolean disponible;
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
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
	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}
	public void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}
	@Override
	public String toString() {
		return "Buses [id=" + id + ", nombre=" + nombre + ", capacidadMaxima=" + capacidadMaxima + ", disponible="
				+ disponible + "]";
	}
	public Buses(int id, String nombre, int capacidadMaxima) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.capacidadMaxima = capacidadMaxima;
	}
	public Buses() {
		super();
	}
	public Buses(int id, String nombre, int capacidadMaxima, boolean disponible) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.capacidadMaxima = capacidadMaxima;
		this.disponible = disponible;
	}
	

}
