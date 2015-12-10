
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro disciplina</title>
</head>
<body>


	<form action="disciplinacontroller.do" method="post">



	<label>Id da disciplina: </label>
	<input type="text" name="txtiddisciplina" value="${request.disciplina.idDisciplina }" size="100"/><br>
	<label>Nome da disciplina:</label>
	<input type="text" name="txtnomedisciplina" value="${request.disciplina.nomeDisciplina }" size="100"/><br>
	<label>Matrícula do professor: </label>
	<input type="text" name="txtmatriculaprofessor" value="${request.disciplina.matriculaProfessor }" size="100"/><br>
	<label>Telefone do professor: </label>
	<input type="text" name="txttelefoneprofessor" value="${request.disciplina.telefoneProfessor }" size="100"/><br>
	<label>E-mail do professor:</label>
	<input type="text" name="txtemailprofessor" value="${request.disciplina.emailProfessor }" size="100"/><br><br><br><br>

	<input type="submit" value="Salvar"/>	
	
	
</form>
</body>
</html>