package com.krakedev.GestionBuses.entidades;

import java.util.Date;

public class Rutas {
	private int id;
	private String origen;
	private String destino;
	private Date horarioSalida;
	private Date horarioLlegada;
	private Buses bus;
	private boolean disponible;
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	@Override
	public String toString() {
		return "Rutas [id=" + id + ", origen=" + origen + ", destino=" + destino + ", horarioSalida=" + horarioSalida
				+ ", horarioLlegada=" + horarioLlegada + ", bus=" + bus + ", disponible=" + disponible + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public Date getHorarioSalida() {
		return horarioSalida;
	}
	public void setHorarioSalida(Date horarioSalida) {
		this.horarioSalida = horarioSalida;
	}
	public Date getHorarioLlegada() {
		return horarioLlegada;
	}
	public void setHorarioLlegada(Date horarioLlegada) {
		this.horarioLlegada = horarioLlegada;
	}
	public Buses getBus() {
		return bus;
	}
	public void setBus(Buses bus) {
		this.bus = bus;
	}
	public Rutas(int id, String origen, String destino, Date horarioSalida, Date horarioLlegada, Buses bus) {
		super();
		this.id = id;
		this.origen = origen;
		this.destino = destino;
		this.horarioSalida = horarioSalida;
		this.horarioLlegada = horarioLlegada;
		this.bus = bus;
	}
	public Rutas() {
		super();
	}
	public Rutas(int id, String origen, String destino, Date horarioSalida, Date horarioLlegada, Buses bus,
			boolean disponible) {
		super();
		this.id = id;
		this.origen = origen;
		this.destino = destino;
		this.horarioSalida = horarioSalida;
		this.horarioLlegada = horarioLlegada;
		this.bus = bus;
		this.disponible = disponible;
	}
	
	
}
