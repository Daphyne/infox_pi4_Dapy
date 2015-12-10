<%@page import="br.com.infox.entidades.Aluno"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<<<<<<< HEAD
<title>Lista aluno</title>
</head>
<body>


=======
<title>Listar aluno</title>
</head>
<body>

>>>>>>> 690cb9829f1cafbfc5850e578f4bd2d50b1fc298
<table border="1">
		
		<tr bgcolor="#1E90FF">
		<th> Matrícula do aluno</th><th>Telefone</th><th>E-mail</th><th>Data de nascimento</th><th>Nome</th><th>Endereco</th><th>Senha</th><th>Acao</th>
		</tr>
<%

<<<<<<< HEAD
	List<Aluno> listaalu = (List<Aluno>)request.getAttribute("lista");

	for(Aluno a : listaalu){
=======
List<Aluno> listaalu = (List<Aluno>)request.getAttribute("lista");

for(Aluno a : listaalu){
>>>>>>> 690cb9829f1cafbfc5850e578f4bd2d50b1fc298

%>


	<tr bgcolor=" #9AFF9A">
		<td><%= a.getMatriculaAluno() %></td>
		<td><%= a.getTelefoneAluno() %></td>
		<td><%=  a.getEmailAluno()%></td>
		<td><%= a.getDataNacAluno() %></td>
		<td><%= a.getNomeAluno()%></td>
		<td><%= a.getEndereco() %></td>
		<td><%= a.getSenha()%></td>
		<td>
		
		<a href="alunocontroller.do?acao=exc&matriculaAluno=<%= a.getMatriculaAluno()%>"> Excluir </a>
		
		<a href="alunocontroller.do?acao=alt&matriculaAluno=<%= a.getMatriculaAluno()%>"> Alterar </a>
		
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