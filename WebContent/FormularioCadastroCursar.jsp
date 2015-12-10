<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro cursar</title>
</head>
<body>




<form action="cursarcontroller.do" method="post">



	<label>Falta: </label>
	<input type="text" name="txtfaltacursar" value="${requestScope.cursar.falta }" size="100"/><br>
	<label>Nota:</label>
	<input type="text" name="txtnotacursar" value="${requestScope.cursar.nota }" size="100"/><br>
	<label>Matrícula do aluno: </label>
	<input type="text" name="txtmaluno" value="${requestScope.cursar.matriculaAluno }" size="100"/><br>
	<label>Id da disciplina: </label>
	<input type="text" name="txtiddisciplina" value="${requestScope.cursar.idDisciplina }" size="100"/><br><br><br><br>
	
	<input type="submit" value="Salvar"/>	
	
	
</form>
</body>
</html>