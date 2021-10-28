package DAO;


import java.util.List;

import org.hibernate.Session;
import Hibernate.HibernateUtil;
import tablas.Usuarios;


public class UsuarioDAO {
	public static boolean getAllUsuario(String nombre, String pass) {
		return getAllUsuario(HibernateUtil.retrieveSession(), nombre, pass);
	}
	
	public static boolean getAllUsuario(Session s, String nombre, String pass) {
		boolean bol=false;
		int contador=0;
		String hQuery = "from Usuarios";
		List<Usuarios> clientList = s.createQuery(hQuery, Usuarios.class)
				   	   			           .getResultList();
		for (Usuarios usuarios : clientList) {
			if(usuarios.getNombre().equals(nombre) && usuarios.getClave().equals(pass)) {
				contador++;
			}
		}
		
		if(contador>=1) bol=true;
		return bol;
	}
}
