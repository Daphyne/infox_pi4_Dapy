<%@page import="br.com.infox.entidades.Aviso"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista aviso</title>
</head>
<body>


<table border="1">
		
		<tr bgcolor="#1E90FF">
		<th> Nome </th><th>Id do aviso</th><th>Hora da publicação</th><th>Id da disciplina</th><th>Mensagem do aviso</th><th>Acao</th>
		</tr>
<%

	List<Aviso> listav = (List<Aviso>)request.getAttribute("lista");

	for(Aviso a : listav){

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
</body>
</html>