<!DOCTYPE html>
<%@page import="br.com.infox.entidades.Material"%>
<html>
<head>
<meta charset="ISO-8859-1">
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