<%@page import="br.com.infox.entidades.Professor"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista professor</title>
</head>
<body>

	<table border="1">
		
		<tr bgcolor="#1E90FF">
		<th> Matrícula</th><th>Data de nascimento</th><th>Telefone</th><th>Nome</th><th>Senha</th><th>E-mail</th><th>Acao</th>
		</tr>
<%

List<Professor> listaprof = (List<Professor>)request.getAttribute("lista");

for(Professor p : listaprof){

%>


	<tr bgcolor=" #9AFF9A">
		<td><%= p.getMatriculaProfessor() %></td>
		<td><%= p.getDataNascProfessor() %></td>
		<td><%= p.getTelefoneProfessor() %></td>
		<td><%= p.getNomeProfessor() %></td>
		<td><%= p.getSenha() %></td>
		<td><%= p.getEmailProfessor() %></td>
		<td>
		<a href="professorcontroller.do?acao=exc&matriculaProfessor=<%= p.getMatriculaProfessor() %>"> Excluir </a>
		<a href="professorcontroller.do?acao=alt&matriculaProfessor=<%= p.getMatriculaProfessor() %>"> Alterar </a>
		</td>
	</tr>



<% 
}
%>



	</table>
</body>
</html>