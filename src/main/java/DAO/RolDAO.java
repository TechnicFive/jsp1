package DAO;

import java.util.List;

import org.hibernate.Session;

import Hibernate.HibernateUtil;
import tablas.Roles;

public class RolDAO {
	
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
