<%@page import="br.com.infox.entidades.Aviso"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<<<<<<< HEAD
<title>Lista aviso</title>
</head>
<body>


=======
<title>Lista de aviso</title>
</head>
<body>

>>>>>>> 690cb9829f1cafbfc5850e578f4bd2d50b1fc298
<table border="1">
		
		<tr bgcolor="#1E90FF">
		<th> Nome </th><th>Id do aviso</th><th>Hora da publicação</th><th>Id da disciplina</th><th>Mensagem do aviso</th><th>Acao</th>
		</tr>
<%

<<<<<<< HEAD
	List<Aviso> listav = (List<Aviso>)request.getAttribute("lista");

	for(Aviso a : listav){
=======
List<Aviso> listav = (List<Aviso>)request.getAttribute("lista");

for(Aviso a : listav){
>>>>>>> 690cb9829f1cafbfc5850e578f4bd2d50b1fc298

%>


	<tr bgcolor=" #9AFF9A">
		<td><%= a.getNomeAviso() %></td>
		<td><%= a.getIdAviso()%></td>
		<td><%= a.getHoraPublicacao() %></td>
		<td><%= a.getIdDisciplina()%></td>
		<td><%= a.getMensagemaviso()%></td>
		<td>
		
		<a href="materialcontroller.do?acao=exc&idAviso=<%= a.getIdAviso()%>"> Excluir </a>
		
		<a href="materialcontroller.do?acao=alt&idAviso=<%= a.getIdAviso()%>"> Alterar </a>
		
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