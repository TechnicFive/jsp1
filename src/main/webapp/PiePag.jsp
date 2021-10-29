<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<input type="submit" value="Volver" onClick="history.go(-1);">
	<form action="cerrarSesion" method="get">
		<input type="submit" value="Cerrar Sesion">
	</form>

</body>
</html>