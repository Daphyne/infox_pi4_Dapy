<<<<<<< HEAD
<%@page import="br.com.infox.entidades.Professor"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
=======
<!DOCTYPE html>
<%@page import="br.com.infox.entidades.Professor"%>
<html>
<head>
<meta charset="ISO-8859-1">
>>>>>>> 690cb9829f1cafbfc5850e578f4bd2d50b1fc298
<title>CADASTRO DO PROFESSOR</title>
</head>
<body>

<<<<<<< HEAD

=======
>>>>>>> 690cb9829f1cafbfc5850e578f4bd2d50b1fc298
<%
	Professor prof = (Professor)request.getAttribute("professor");



%>
	<form action="professorcontroller.do" method="post">



	<label>Matrícula do professor: </label>
	<input type="text" name="txtmatriculaprofessor" value="<%= prof.getMatriculaProfessor() %>" size="100"/><br>
	<label>Data de nascimento do professor:</label>
	<input type="text" name="txtdatanasciprofessor" value="<%= prof.getDataNascProfessor() %>" size="100"/><br>
	<label>Telefone do professor: </label>
	<input type="text" name="txttelefoneprofessor" value="<%= prof.getTelefoneProfessor() %>" size="100"/><br>
	<label>Nome do professor:</label>
	<input type="text" name="txtnomeprofessor" value="<%= prof.getNomeProfessor() %>" size="100"/><br>
	<label>Senha do professor: </label>
	<input type="password" name="txtsenhaprofessor" value="<%= prof.getSenha() %>" size="100"/><br>
	<label>E-mail do professor:</label>
	<input type="text" name="txtemailprofessor" value="<%= prof.getEmailProfessor()  %>" size="100"/><br><br><br><br>

	<input type="submit" value="Salvar"/>	
	
	
</form>
<<<<<<< HEAD
=======

>>>>>>> 690cb9829f1cafbfc5850e578f4bd2d50b1fc298
</body>
</html>