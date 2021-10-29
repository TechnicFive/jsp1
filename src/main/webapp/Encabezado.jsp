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


</body>
</html>