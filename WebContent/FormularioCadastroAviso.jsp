<!DOCTYPE html>
<%@page import="br.com.infox.entidades.Aviso"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CADASTRO DO AVISO</title>
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