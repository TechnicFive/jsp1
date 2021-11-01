<%@page import="org.hibernate.internal.build.AllowSysOut"%>
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
	<% String id=null; %>
	<% int idd=0; %>
	<%= id=(String)session.getAttribute("ids") %>
	<% idd= Integer.parseInt(id); %>
	
	<%@include file="Encabezado.jsp"%>
	<h1>Menu</h1>
	<form action="newRol" method="get">
		<input type=<%= (idd<=1)?"button":"hidden" %> value="Crear nuevo Rol">
	</form>
	<form action="verRol" method="get">
		<input type="submit" value="Ver roles">
	</form>
</body>
</html>