<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@include file="Encabezado.jsp"%>
	<h1>Menu</h1>
	<form action="newRol" method="get">
		<input type="submit" value="Crear nuevo Rol">
	</form>
	<form action="verRol" method="get">
		<input type="submit" value="Ver roles">
	</form>
	<%@include file="PiePag.jsp"%>
</body>
</html>