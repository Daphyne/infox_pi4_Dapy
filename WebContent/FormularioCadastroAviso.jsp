<%@page import="br.com.infox.entidades.Aviso"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CADASTRAR AVISO</title>
</head>
<body>


<%
	Aviso aviso = (Aviso)request.getAttribute("aviso");



%>

<form action="avisocontroller.do" method="post">



	<label>Nome do aviso: </label>
	<input type="text" name="txtnomeaviso" value="<%= aviso.getNomeAviso() %>" size="100"/><br>
	<label>Id do aviso:</label>
	<input type="text" name="txtidaviso" value="<%= aviso.getIdAviso() %>" size="100"/><br>
	<label>Hora da publicação: </label>
	<input type="text" name="txthorapublicacao" value="<%= aviso.getHoraPublicacao() %>" size="100"/><br>
	<label>Id da disciplina: </label>
	<input type="text" name="txtiddisciplina" value="<%= aviso.getIdDisciplina() %>" size="100"/><br>
	<label>Mensagem do aviso: </label>
	<input type="text" name="txtmensagemaviso" value="<%= aviso.getMensagemaviso() %>" size="100"/><br><br><br><br>
	
	<input type="submit" value="Salvar"/>	
	
	
</form>
</body>
</html>