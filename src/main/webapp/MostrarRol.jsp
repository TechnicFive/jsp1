<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*, DAO.RolDAO, tablas.Roles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Roles</title>
</head>
<body>
<%@include file="Encabezado.jsp"%>
	<!-- Scriptlet -->
		<%
			//Ahora cargaremos la tabla de roles
			
			List <Roles> rol = RolDAO.getAllRoles(); 
			pageContext.setAttribute("ListaRoles", rol);
		%>
		
		<table border="2">
			<tr>
				<th>Id</th>
				<th>Rol</th>
			</tr>
			<c:forEach items="${pageScope.ListaRoles}" var="Roles" varStatus="status">
			<tr>
			    <td><c:out value="${Roles.id}"></c:out></td>
			    <td><c:out value="${Roles.rol}"></c:out></td>          
			</tr>
			</c:forEach>
		</table>
		
	<%@include file="PiePag.jsp"%>
</body>
</html>