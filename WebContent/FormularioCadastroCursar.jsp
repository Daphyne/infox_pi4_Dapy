<!DOCTYPE html>
<%@page import="br.com.infox.entidades.Cursar"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CADASTRO DO CURSAR</title>
</head>
<body>


<%
	Cursar cursar = (Cursar)request.getAttribute("cursar");



%>

<form action="cursarcontroller.do" method="post">



	<label>Falta: </label>
	<input type="text" name="txtfaltacursar" value="<%= cursar.getFalta() %>" size="100"/><br>
	<label>Nota:</label>
	<input type="text" name="txtnotacursar" value="<%= cursar.getNota() %>" size="100"/><br>
	<label>Matrícula do aluno: </label>
	<input type="text" name="txtmaluno" value="<%= cursar.getMatriculaAluno() %>" size="100"/><br>
	<label>Id da disciplina: </label>
	<input type="text" name="txtiddisciplina" value="<%= cursar.getIdDisciplina() %>" size="100"/><br><br><br><br>
	
	<input type="submit" value="Salvar"/>	
	
	
</form>


</body>
</html>