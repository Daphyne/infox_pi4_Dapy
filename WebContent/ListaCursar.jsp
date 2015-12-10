<%@page import="br.com.infox.entidades.Cursar"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista cursar</title>
</head>
<body>

<<<<<<< HEAD

=======
>>>>>>> 690cb9829f1cafbfc5850e578f4bd2d50b1fc298
<table border="1">
		
		<tr bgcolor="#1E90FF">
		<th> Matrícula do aluno</th><th>Id da disciplina</th><th>Nota</th><th>Falta</th><th>Acao</th>
		</tr>
<%

<<<<<<< HEAD
	List<Cursar> listacur = (List<Cursar>)request.getAttribute("lista");

	for(Cursar c : listacur){
=======
List<Cursar> listacur = (List<Cursar>)request.getAttribute("lista");

for(Cursar c : listacur){
>>>>>>> 690cb9829f1cafbfc5850e578f4bd2d50b1fc298

%>


	<tr bgcolor=" #9AFF9A">
		<td><%= c.getMatriculaAluno() %></td>
		<td><%= c.getIdDisciplina() %></td>
		<td><%=  c.getNota()%></td>
		<td><%=  c.getFalta()%></td>
		<td>
		
		<a href="cursarcontroller.do?acao=exc&matriculaAluno=<%=c.getMatriculaAluno()%>"> Excluir </a>
		
		<a href="cursarcontroller.do?acao=alt&matriculaAluno=<%=c.getMatriculaAluno()%>"> Alterar </a>
		
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