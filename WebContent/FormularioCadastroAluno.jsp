<<<<<<< HEAD
<%@page import="br.com.infox.entidades.Aluno"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
=======
<!DOCTYPE html>
<%@page import="br.com.infox.entidades.Aluno"%>
<html>
<head>
<meta charset="ISO-8859-1">
>>>>>>> 690cb9829f1cafbfc5850e578f4bd2d50b1fc298
<title>CADASTRO DE ALUNO</title>
</head>
<body>


<<<<<<< HEAD

=======
>>>>>>> 690cb9829f1cafbfc5850e578f4bd2d50b1fc298
<%
	Aluno aluno = (Aluno)request.getAttribute("aluno");



%>
<form action="alunocontroller.do" method="post">



	<label>Matrícula do aluno: </label>
	<input type="text" name="txtmatriculaaluno" value="<%= aluno.getMatriculaAluno() %>" size="100"/><br>
	<label>Telefone do aluno:</label>
	<input type="text" name="txttelefonealuno" value="<%= aluno.getTelefoneAluno() %>" size="100"/><br>
	<label>E-mail do aluno: </label>
	<input type="text" name="txtemailaluno" value="<%= aluno.getEmailAluno() %>" size="100"/><br>
	<label>Data de nascimento: </label>
	<input type="text" name="txtnascaluno" value="<%= aluno.getDataNacAluno() %>" size="100"/><br>
	<label>Nome do aluno:</label>
	<input type="text" name="txtnomealuno" value="<%= aluno.getNomeAluno() %>" size="100"/><br>
	<label>Endereço:</label>
	<input type="text" name="txtenderecoaluno" value="<%= aluno.getEndereco() %>" size="100"/><br>
	<label>Senha:</label>
	<input type="password" name="txtsenhacoaluno" value="<%= aluno.getSenha() %>" size="100"/><br><br><br><br>
	
	<input type="submit" value="Salvar"/>	
	
	
</form>

<<<<<<< HEAD
=======

>>>>>>> 690cb9829f1cafbfc5850e578f4bd2d50b1fc298
</body>
</html>