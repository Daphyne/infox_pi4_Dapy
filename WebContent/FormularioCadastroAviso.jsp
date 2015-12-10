<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro aviso</title>
</head>
<body>



<form action="avisocontroller.do" method="post">



	<label>Nome do aviso: </label>
	<input type="text" name="txtnomeaviso" value="${requestScope.aviso.nomeAviso }" size="100"/><br>
	<label>Id do aviso:</label>
	<input type="text" name="txtidaviso" value="${requestScope.aviso.idAviso }" size="100"/><br>
	<label>Hora da publicação: </label>
	<input type="text" name="txthorapublicacao" value="${requestScope.aviso.horaPublicacao }" size="100"/><br>
	<label>Id da disciplina: </label>
	<input type="text" name="txtiddisciplina" value="${requestScope.aviso.idDisciplina }" size="100"/><br>
	<label>Mensagem do aviso: </label>
	<input type="text" name="txtmensagemaviso" value="${requestScope.aviso.mensagemaviso}" size="100"/><br><br><br><br>
	
	<input type="submit" value="Salvar"/>	
	
	
</form>
</body>
</html>