<<<<<<< HEAD
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

=======
<<<<<<< HEAD
<%@page import="br.com.infox.entidades.Cursar"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<<<<<<< HEAD
<title>Cadastro cursar</title>
=======
<title>CADASTRO CURSAR</title>
=======
<!DOCTYPE html>
<%@page import="br.com.infox.entidades.Cursar"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CADASTRO DO CURSAR</title>
>>>>>>> 690cb9829f1cafbfc5850e578f4bd2d50b1fc298
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
</head>
<body>


<<<<<<< HEAD


=======
<%
	Cursar cursar = (Cursar)request.getAttribute("cursar");



%>

>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
<form action="cursarcontroller.do" method="post">



	<label>Falta: </label>
<<<<<<< HEAD
	<input type="text" name="txtfaltacursar" value="${requestScope.cursar.falta }" size="100"/><br>
	<label>Nota:</label>
	<input type="text" name="txtnotacursar" value="${requestScope.cursar.nota }" size="100"/><br>
	<label>Matrícula do aluno: </label>
	<input type="text" name="txtmaluno" value="${requestScope.cursar.matriculaAluno }" size="100"/><br>
	<label>Id da disciplina: </label>
	<input type="text" name="txtiddisciplina" value="${requestScope.cursar.idDisciplina }" size="100"/><br><br><br><br>
=======
	<input type="text" name="txtfaltacursar" value="<%= cursar.getFalta() %>" size="100"/><br>
	<label>Nota:</label>
	<input type="text" name="txtnotacursar" value="<%= cursar.getNota() %>" size="100"/><br>
	<label>Matrícula do aluno: </label>
	<input type="text" name="txtmaluno" value="<%= cursar.getMatriculaAluno() %>" size="100"/><br>
	<label>Id da disciplina: </label>
	<input type="text" name="txtiddisciplina" value="<%= cursar.getIdDisciplina() %>" size="100"/><br><br><br><br>
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
	
	<input type="submit" value="Salvar"/>	
	
	
</form>
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======


>>>>>>> 690cb9829f1cafbfc5850e578f4bd2d50b1fc298
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
</body>
</html>