<<<<<<< HEAD
<%@page import="br.com.infox.entidades.Disciplina"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
=======
<!DOCTYPE html>
<%@page import="br.com.infox.entidades.Disciplina"%>
<html>
<head>
<meta charset="ISO-8859-1">
>>>>>>> 690cb9829f1cafbfc5850e578f4bd2d50b1fc298
<title>CADASTRO DE DISCIPLINA</title>
</head>
<body>

<<<<<<< HEAD

=======
>>>>>>> 690cb9829f1cafbfc5850e578f4bd2d50b1fc298
<%
	Disciplina dis = (Disciplina)request.getAttribute("disciplina");



%>
	<form action="disciplinacontroller.do" method="post">



	<label>Id da disciplina: </label>
	<input type="text" name="txtiddisciplina" value="<%= dis.getIdDisciplina() %>" size="100"/><br>
	<label>Nome da disciplina:</label>
	<input type="text" name="txtnomedisciplina" value="<%= dis.getNomeDisciplina() %>" size="100"/><br>
	<label>Matrícula do professor: </label>
	<input type="text" name="txtmatriculaprofessor" value="<%= dis.getMatriculaProfessor() %>" size="100"/><br>
	<label>Telefone do professor: </label>
	<input type="text" name="txttelefoneprofessor" value="<%= dis.getTelefoneProfessor() %>" size="100"/><br>
	<label>E-mail do professor:</label>
	<input type="text" name="txtemailprofessor" value="<%= dis.getEmailProfessor() %>" size="100"/><br><br><br><br>

	<input type="submit" value="Salvar"/>	
	
	
</form>
<<<<<<< HEAD
=======


>>>>>>> 690cb9829f1cafbfc5850e578f4bd2d50b1fc298
</body>
</html>