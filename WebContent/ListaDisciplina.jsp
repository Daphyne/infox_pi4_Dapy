<%@page import="br.com.infox.entidades.Disciplina"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista Disciplina</title>
</head>
<body>

<table border="1">
		
		<tr bgcolor="#1E90FF">
		<th> Id da disciplina</th><th>Nome</th><th>Matrícula do professor</th><th>Telefone do professor</th><th>E-mail do professor</th>
		</tr>
<%

List<Disciplina> listadisci = (List<Disciplina>)request.getAttribute("lista");

for(Disciplina d : listadisci){

%>


	<tr bgcolor=" #9AFF9A">
		<td><%= d.getIdDisciplina() %></td>
		<td><%= d.getNomeDisciplina() %></td>
		<td><%= d.getMatriculaProfessor() %></td>
		<td><%= d.getTelefoneProfessor() %></td>
		<td><%= d.getEmailProfessor()%></td>

	</tr>



<% 
}
%>



	</table>
	
</body>
</html>