package com.krakedev.GestionBuses.entidades;

public class Reserva {
	private int id;
	private Usuarios u;
	private Rutas r;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Usuarios getU() {
		return u;
	}
	public void setU(Usuarios u) {
		this.u = u;
	}
	public Rutas getR() {
		return r;
	}
	public void setR(Rutas r) {
		this.r = r;
	}
	@Override
	public String toString() {
		return "Reserva [id=" + id + ", u=" + u + ", r=" + r + "]";
	}
	public Reserva(int id, Usuarios u, Rutas r) {
		super();
		this.id = id;
		this.u = u;
		this.r = r;
	}
	public Reserva() {
		super();
	}
	
	
}
