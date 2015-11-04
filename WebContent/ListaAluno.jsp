<%@page import="br.com.infox.entidades.Aluno"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listar aluno</title>
</head>
<body>

<table border="1">
		
		<tr bgcolor="#1E90FF">
		<th> Matrícula do aluno</th><th>Telefone</th><th>E-mail</th><th>Data de nascimento</th><th>Nome</th><th>Endereco</th><th>Senha</th>
		</tr>
<%

List<Aluno> listaalu = (List<Aluno>)request.getAttribute("lista");

for(Aluno a : listaalu){

%>


	<tr bgcolor=" #9AFF9A">
		<td><%= a.getMatriculaAluno() %></td>
		<td><%= a.getTelefoneAluno() %></td>
		<td><%=  a.getEmailAluno()%></td>
		<td><%= a.getDataNacAluno() %></td>
		<td><%= a.getNomeAluno()%></td>
		<td><%= a.getEndereco() %></td>
		<td><%= a.getSenha()%></td>

	</tr>



<% 
}
%>



	</table>
	
</body>
</html>