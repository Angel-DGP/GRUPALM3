package com.krakedev.GestionBuses.bdd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.krakedev.GestionBuses.entidades.Buses;
import com.krakedev.GestionBuses.entidades.Rutas;
import com.krakedev.GestionBuses.excepciones.GestionException;
import com.krakedev.GestionBuses.utils.ConexionBDD;

public class GestionBDD {
	public ArrayList<Buses> busesDisponibles() throws GestionException {
		ArrayList<Buses> bs= new ArrayList<Buses>();
		Connection CON = null;
		PreparedStatement PS = null;
		Buses bus = null;
		try {
			CON = ConexionBDD.obtenerConexion();
			PS = CON.prepareStatement("select * from buses where disponible = true;");
			ResultSet RS = PS.executeQuery();
			
			while (RS.next()) {
				bus = new Buses(RS.getInt("id"), RS.getString("nombre"), RS.getInt("capacidad_maxima"), RS.getBoolean("disponible"));
				bs.add(bus);
			}

		} catch (GestionException e) {
			e.printStackTrace();
			throw e;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new GestionException("Error al consultar: " + e.getMessage());
		} finally {
			if (CON != null) {
				try {
					CON.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return bs;
	}
	
	public ArrayList<Rutas> rutasDisponibles() throws GestionException {
		ArrayList<Rutas> rs= new ArrayList<Rutas>();
		Connection CON = null;
		PreparedStatement PS = null;
		Rutas rus = null;
		try {
			CON = ConexionBDD.obtenerConexion();
			PS = CON.prepareStatement("select * from rutas where disponible = true;");
			ResultSet RS = PS.executeQuery();
			
			while (RS.next()) {	
				rus = new Rutas(RS.getInt("id"), RS.getString("origen"), RS.getString("destino"), RS.getDate("horario_salida"), RS.getDate("horario_llegada"), new Buses(RS.getInt("id_bus"), null, 0, true), RS.getBoolean("disponible"));
				rs.add(rus);
			}

		} catch (GestionException e) {
			e.printStackTrace();
			throw e;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new GestionException("Error al consultar: " + e.getMessage());
		} finally {
			if (CON != null) {
				try {
					CON.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return rs;
	}
}
