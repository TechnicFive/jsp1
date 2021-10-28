package DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import Hibernate.HibernateUtil;
import tablas.Roles;

public class RolDAO {
	static Transaction tx = null;
	public static void insertRol(String nombre) {
		insertRol(HibernateUtil.retrieveSession(), nombre);
	}
	public static void insertRol(Session s, String nombre) {
		tx = s.beginTransaction();
		//public Empleado(int codigo, String nombre, String apellido1, String apellido2, String lugarNacimiento, String fechaNacimiento, String direccion, String telefono, String puesto, int codDepartamento)
		Roles client = new Roles(nombre);
		s.save(client);
		tx.commit();
	}
	
	public static List<Roles> getAllRoles() {
		return getAllRoles(HibernateUtil.retrieveSession());
	}
	
	public static List<Roles> getAllRoles(Session s) {
		String hQuery = "from Roles";
		List<Roles> clientList = s.createQuery(hQuery, Roles.class)
				   	   			           .list();
		
		return clientList;
	}
}
