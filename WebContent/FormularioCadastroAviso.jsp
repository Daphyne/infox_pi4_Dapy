<<<<<<< HEAD
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

=======
<<<<<<< HEAD
<%@page import="br.com.infox.entidades.Aviso"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<<<<<<< HEAD
<title>Cadastro aviso</title>
</head>
<body>



=======
<title>CADASTRAR AVISO</title>
</head>
<body>


=======
<!DOCTYPE html>
<%@page import="br.com.infox.entidades.Aviso"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CADASTRO DO AVISO</title>
</head>
<body>

>>>>>>> 690cb9829f1cafbfc5850e578f4bd2d50b1fc298
<%
	Aviso aviso = (Aviso)request.getAttribute("aviso");



%>

>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
<form action="avisocontroller.do" method="post">



	<label>Nome do aviso: </label>
<<<<<<< HEAD
	<input type="text" name="txtnomeaviso" value="${requestScope.aviso.nomeAviso }" size="100"/><br>
	<label>Id do aviso:</label>
	<input type="text" name="txtidaviso" value="${requestScope.aviso.idAviso }" size="100"/><br>
	<label>Hora da publica��o: </label>
	<input type="text" name="txthorapublicacao" value="${requestScope.aviso.horaPublicacao }" size="100"/><br>
	<label>Id da disciplina: </label>
	<input type="text" name="txtiddisciplina" value="${requestScope.aviso.idDisciplina }" size="100"/><br>
	<label>Mensagem do aviso: </label>
	<input type="text" name="txtmensagemaviso" value="${requestScope.aviso.mensagemaviso}" size="100"/><br><br><br><br>
=======
	<input type="text" name="txtnomeaviso" value="<%= aviso.getNomeAviso() %>" size="100"/><br>
	<label>Id do aviso:</label>
	<input type="text" name="txtidaviso" value="<%= aviso.getIdAviso() %>" size="100"/><br>
	<label>Hora da publica��o: </label>
	<input type="text" name="txthorapublicacao" value="<%= aviso.getHoraPublicacao() %>" size="100"/><br>
	<label>Id da disciplina: </label>
	<input type="text" name="txtiddisciplina" value="<%= aviso.getIdDisciplina() %>" size="100"/><br>
	<label>Mensagem do aviso: </label>
	<input type="text" name="txtmensagemaviso" value="<%= aviso.getMensagemaviso() %>" size="100"/><br><br><br><br>
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