<<<<<<< HEAD
<%@page import="br.com.infox.entidades.Cursar"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CADASTRO CURSAR</title>
=======
<!DOCTYPE html>
<%@page import="br.com.infox.entidades.Cursar"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CADASTRO DO CURSAR</title>
>>>>>>> 690cb9829f1cafbfc5850e578f4bd2d50b1fc298
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
<<<<<<< HEAD
=======


>>>>>>> 690cb9829f1cafbfc5850e578f4bd2d50b1fc298
</body>
</html>