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

<<<<<<< HEAD


=======
>>>>>>> 690cb9829f1cafbfc5850e578f4bd2d50b1fc298
<table border="1">
		
		<tr bgcolor="#1E90FF">
		<th> Id da disciplina</th><th>Nome</th><th>Matrícula do professor</th><th>Telefone do professor</th><th>E-mail do professor</th><th>Acao</th>
		</tr>
<%

<<<<<<< HEAD
	List<Disciplina> listadisci = (List<Disciplina>)request.getAttribute("lista");

	for(Disciplina d : listadisci){
=======
List<Disciplina> listadisci = (List<Disciplina>)request.getAttribute("lista");

for(Disciplina d : listadisci){
>>>>>>> 690cb9829f1cafbfc5850e578f4bd2d50b1fc298

%>


	<tr bgcolor=" #9AFF9A">
		<td><%= d.getIdDisciplina() %></td>
		<td><%= d.getNomeDisciplina() %></td>
		<td><%= d.getMatriculaProfessor() %></td>
		<td><%= d.getTelefoneProfessor() %></td>
		<td><%= d.getEmailProfessor()%></td>
		<td>
		
		<a href="disciplinacontroller.do?acao=exc&idDisciplina=<%= d.getIdDisciplina() %>"> Excluir </a>
		
		<a href="disciplinacontroller.do?acao=alt&idDisciplina=<%= d.getIdDisciplina() %>"> Alterar </a>
		
		</td>
		

	</tr>



<% 
}
%>



	</table>
<<<<<<< HEAD
=======
	
>>>>>>> 690cb9829f1cafbfc5850e578f4bd2d50b1fc298
</body>
</html>