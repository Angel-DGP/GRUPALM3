package com.krakedev.GestionBuses.servicios;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.krakedev.GestionBuses.bdd.GestionBDD;
import com.krakedev.GestionBuses.entidades.Buses;
import com.krakedev.GestionBuses.entidades.Rutas;
import com.krakedev.GestionBuses.excepciones.GestionException;
@Path("gestion")
public class GestionServicios {
	@Path("buses")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response buses() {
		ArrayList<Buses> prds= new ArrayList<Buses>();
		GestionBDD gBDD = new GestionBDD();
		
		try {
			prds = gBDD.busesDisponibles();
			return Response.ok(prds).build();
		} catch (GestionException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}
	@Path("rutas")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response rutas() {
		ArrayList<Rutas> prds= new ArrayList<Rutas>();
		GestionBDD gBDD = new GestionBDD();
		
		try {
			prds = gBDD.rutasDisponibles();
			return Response.ok(prds).build();
		} catch (GestionException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}


}
