package DAO;


import java.util.List;

import org.hibernate.Session;
import Hibernate.HibernateUtil;
import tablas.Usuarios;


public class UsuarioDAO {
	public static List<Usuarios> getAllUsuario(String nombre, String pass) {
		return getAllUsuario(HibernateUtil.retrieveSession(), nombre, pass);
	}
	
	public static List<Usuarios> getAllUsuario(Session s, String nombre, String pass) {
		String hQuery = "from Usuarios";
		List<Usuarios> clientList = s.createQuery(hQuery, Usuarios.class)
				   	   			           .getResultList();
		
		return clientList;
	}
}
