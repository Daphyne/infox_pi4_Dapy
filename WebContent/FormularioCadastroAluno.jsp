<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro aluno</title>
</head>
<body>

	<c:import url="MenuAluno.jsp"></c:import>


<form action="alunocontroller.do" method="post">



	<label>Matrícula do aluno: </label>
	<input type="text" name="txtmatriculaaluno" value="${requestScope.aluno.matriculaAluno }" size="100"/><br>
	<label>Telefone do aluno:</label>
	<input type="text" name="txttelefonealuno" value="${requestScope.aluno.telefoneAluno }" size="100"/><br>
	<label>E-mail do aluno: </label>
	<input type="text" name="txtemailaluno" value="${requestScope.aluno.emailAluno }" size="100"/><br>
	<label>Data de nascimento: </label>
	<input type="text" name="txtnascaluno" value="${requestScope.aluno.dataNacAluno }" size="100"/><br>
	<label>Nome do aluno:</label>
	<input type="text" name="txtnomealuno" value="${requestScope.aluno.nomeAluno }" size="100"/><br>
	<label>Endereço:</label>
	<input type="text" name="txtenderecoaluno" value="${requestScope.aluno.endereco }" size="100"/><br>
	<label>Senha:</label>
	<input type="password" name="txtsenhacoaluno" value="${requestScope.aluno.senha }" size="100"/><br><br><br><br>
	
	<input type="submit" value="Salvar"/>	
	
	
</form>
</body>
</html>