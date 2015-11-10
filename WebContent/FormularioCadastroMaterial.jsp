<%@page import="br.com.infox.entidades.Material"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CADASTRAR MATERIAL</title>
</head>
<body>


<%
	Material material = (Material)request.getAttribute("material");



%>
<form action="materialcontroller.do" method="post">



	<label>Caminho: </label>
	<input type="text" name="txtcaminhomaterial" value="<%= material.getCaminho() %>" size="100"/><br>
	<label>Nome do material:</label>
	<input type="text" name="txtnomedomaterial" value="<%= material.getNomeMaterial() %>" size="100"/><br>
	<label>Id do material: </label>
	<input type="text" name="txtidmaterial" value="<%= material.getIdMaterial() %>" size="100"/><br>
	<label>Id da disciplina: </label>
	<input type="text" name="txtiddisciplina" value="<%= material.getIdDisciplina() %>" size="100"/><br><br><br><br>
	
	<input type="submit" value="Salvar"/>	
	
	
</form>
</body>
</html>