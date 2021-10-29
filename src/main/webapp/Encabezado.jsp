<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*, DAO.RolDAO, tablas.Roles, servlet.LoginServlet"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<div>Usuario: <%=session.getAttribute("usu")%> Fecha login: <%=session.getAttribute("fecha")%></div>
	<div>
	<!-- Esto es un if ternario mas facil que el if normal, las sentencias son iguales el ? es {} y : es else -->
	<input type=<%= (request.getRequestURI().endsWith("Menu.jsp")) ? "hidden" : "button" %> value="Volver" onClick="history.go(-1);">
	<form action="cerrarSesion" method="get">
		<input type="submit" value="Cerrar Sesion">
	</form></div>


</body>
</html>