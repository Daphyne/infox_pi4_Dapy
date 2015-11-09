<!DOCTYPE html>
<%@page import="br.com.infox.entidades.Aluno"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CADASTRO DE ALUNO</title>
</head>
<body>


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


</body>
</html>