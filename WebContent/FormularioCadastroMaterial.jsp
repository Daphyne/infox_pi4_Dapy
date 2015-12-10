<<<<<<< HEAD

=======
<<<<<<< HEAD
<%@page import="br.com.infox.entidades.Material"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<<<<<<< HEAD
<title>Cadastro material</title>
</head>
<body>



=======
=======
<!DOCTYPE html>
<%@page import="br.com.infox.entidades.Material"%>
<html>
<head>
<meta charset="ISO-8859-1">
>>>>>>> 690cb9829f1cafbfc5850e578f4bd2d50b1fc298
<title>CADASTRAR MATERIAL</title>
</head>
<body>

<<<<<<< HEAD

=======
>>>>>>> 690cb9829f1cafbfc5850e578f4bd2d50b1fc298
<%
	Material material = (Material)request.getAttribute("material");



%>
>>>>>>> 06bf4517ac507a8f128966235204ad40b0dc7315
<form action="materialcontroller.do" method="post">



	<label>Caminho: </label>
<<<<<<< HEAD
	<input type="text" name="txtcaminhomaterial" value="${requestScope.material.caminho }" size="100"/><br>
	<label>Nome do material:</label>
	<input type="text" name="txtnomedomaterial" value="${requestScope.material.nomeMaterial }" size="100"/><br>
	<label>Id do material: </label>
	<input type="text" name="txtidmaterial" value="${requestScope.material.idMaterial }" size="100"/><br>
	<label>Id da disciplina: </label>
	<input type="text" name="txtiddisciplina" value="${requestScope.material.idDisciplina }" size="100"/><br><br><br><br>
=======
	<input type="text" name="txtcaminhomaterial" value="<%= material.getCaminho() %>" size="100"/><br>
	<label>Nome do material:</label>
	<input type="text" name="txtnomedomaterial" value="<%= material.getNomeMaterial() %>" size="100"/><br>
	<label>Id do material: </label>
	<input type="text" name="txtidmaterial" value="<%= material.getIdMaterial() %>" size="100"/><br>
	<label>Id da disciplina: </label>
	<input type="text" name="txtiddisciplina" value="<%= material.getIdDisciplina() %>" size="100"/><br><br><br><br>
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