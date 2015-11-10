<%@page import="br.com.infox.entidades.Material"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista material</title>
</head>
<body>


<table border="1">
		
		<tr bgcolor="#1E90FF">
		<th> Caminho</th><th>Nome</th><th>Id do material</th><th>Id da disciplina</th><th>Acao</th>
		</tr>
<%

	List<Material> listamat = (List<Material>)request.getAttribute("lista");

	for(Material m : listamat){

%>


	<tr bgcolor=" #9AFF9A">
		<td><%= m.getCaminho() %></td>
		<td><%= m.getNomeMaterial() %></td>
		<td><%=  m.getIdMaterial()%></td>
		<td><%=  m.getIdDisciplina()%></td>
		<td>
		
		<a href="materialcontroller.do?acao=exc&idMaterial=<%= m.getIdMaterial()%>"> Excluir </a>
		<a href="materialcontroller.do?acao=alt&idMaterial=<%= m.getIdMaterial()%>"> Alterar </a>
		
		
		</td>
		
		
	</tr>



<% 
}
%>



	</table>
</body>
</html>