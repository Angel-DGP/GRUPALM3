package com.krakedev.GestionBuses.utils;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.krakedev.GestionBuses.excepciones.GestionException;

public class ConexionBDD {	

	public static Connection obtenerConexion() throws GestionException	 {
		Context ctx = null;
		DataSource ds = null;
		Connection con = null;
		try {	
			ctx = new InitialContext();
			// JNDI
			ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/PgDB");
			con = ds.getConnection();
		} catch (NamingException | SQLException e) {
			e.printStackTrace();
			throw new GestionException("Error al contectarse");
		}
		
		return con;
	}
}