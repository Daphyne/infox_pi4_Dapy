<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro do professor</title>
</head>
<body>
<c:import url="MenuProfessor.jsp"></c:import>



	<form action="professorcontroller.do" method="post">



	<label>Matrícula do professor: </label>
	<input type="text" name="txtmatriculaprofessor" value="${requestScope.professor.matriculaProfessor }" size="100"/><br>
	<label>Data de nascimento do professor:</label>
	<input type="text" name="txtdatanasciprofessor" value="${requestScope.professor.dataNascProfessor }" size="100"/><br>
	<label>Telefone do professor: </label>
	<input type="text" name="txttelefoneprofessor" value="${requestScope.professor.telefoneProfessor }" size="100"/><br>
	<label>Nome do professor:</label>
	<input type="text" name="txtnomeprofessor" value="${requestScope.professor.nomeProfessor }" size="100"/><br>
	<label>Senha do professor: </label>
	<input type="password" name="txtsenhaprofessor" value="${requestScope.professor.senha }" size="100"/><br>
	<label>E-mail do professor:</label>
	<input type="text" name="txtemailprofessor" value="${requestScope.professor.emailProfessor }" size="100"/><br><br><br><br>

	<input type="submit" value="Salvar"/>	
	
	
</form>

</body>
</html>