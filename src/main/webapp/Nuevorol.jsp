<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Nuevos Roles</title>
</head>
<body>
	<%@include file="Encabezado.jsp"%>
	<form action="Newroler" method="post">
		Nuevo Rol: <input type="text" name="nombre" required="required">
		<input type="submit" value="Crear">
	</form>
</body>
</html>