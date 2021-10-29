package servlet;


import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.UsuarioDAO;
import tablas.Usuarios;



/**
 * Servlet implementation class LoginServlet
 */
@WebServlet ("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static String nombreSi = null;
	final Date date=new Date();

    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    } 

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nombre=request.getParameter("nombre");
		String pass=request.getParameter("contrasena");
		

	
		if(nombre==null || pass == null) {
			response.sendRedirect("Loger.html");
		}else {
			List <Usuarios> user = UsuarioDAO.getAllUsuario(nombre, pass);
			for (Usuarios usuarios : user) {
				if(usuarios.getNombre().equals(nombre) && usuarios.getClave().equals(pass)) {
					nombreSi=usuarios.getNombre();
					response.sendRedirect("Menu.jsp");
				}else response.sendRedirect("Loger.html");
			}
		}
		
	}
	
	public String getNombre() {
		return nombreSi;
	}
	
	public Date getFecha() {
		return date;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
