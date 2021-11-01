package servlet;


import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.UsuarioDAO;
import tablas.Usuarios;



/**
 * Servlet implementation class LoginServlet
 */
@WebServlet ("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String nombreSi = null;
	private  Date date= new Date();
	private String id= null;
	
	

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
		HttpSession s = request.getSession(true);

	
		if(nombre==null || pass == null) {
			response.sendRedirect("Loger.html");
		}else {
			List <Usuarios> user = UsuarioDAO.getAllUsuario(nombre, pass);
			for (Usuarios usuarios : user) {
				if(usuarios.getNombre().equals(nombre) && usuarios.getClave().equals(pass)) {
					nombreSi=usuarios.getNombre();
					id = usuarios.getRoles()+"";
					s.setAttribute("usu", nombreSi);
					s.setAttribute("ids", id);
					LocalDateTime date = LocalDateTime.now();
					DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm:ss");
					String dater = date.format(format);
					s.setAttribute("fecha", dater);
					
					RequestDispatcher rd= request.getRequestDispatcher("Menu.jsp");
					rd.forward(request, response);

				}		
			}
			RequestDispatcher rd= request.getRequestDispatcher("Loger.html");
			rd.forward(request, response);
		}
		
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
