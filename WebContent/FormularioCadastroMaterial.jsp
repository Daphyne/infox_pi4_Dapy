
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro material</title>
</head>
<body>



<form action="materialcontroller.do" method="post">



	<label>Caminho: </label>
	<input type="text" name="txtcaminhomaterial" value="${requestScope.material.caminho }" size="100"/><br>
	<label>Nome do material:</label>
	<input type="text" name="txtnomedomaterial" value="${requestScope.material.nomeMaterial }" size="100"/><br>
	<label>Id do material: </label>
	<input type="text" name="txtidmaterial" value="${requestScope.material.idMaterial }" size="100"/><br>
	<label>Id da disciplina: </label>
	<input type="text" name="txtiddisciplina" value="${requestScope.material.idDisciplina }" size="100"/><br><br><br><br>
	
	<input type="submit" value="Salvar"/>	
	
	
</form>


</body>
</html>