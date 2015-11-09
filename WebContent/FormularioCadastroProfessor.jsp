<!DOCTYPE html>
<%@page import="br.com.infox.entidades.Professor"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CADASTRO DO PROFESSOR</title>
</head>
<body>

<%
	Professor prof = (Professor)request.getAttribute("professor");



%>
	<form action="professorcontroller.do" method="post">



	<label>Matrícula do professor: </label>
	<input type="text" name="txtmatriculaprofessor" value="<%= prof.getMatriculaProfessor() %>" size="100"/><br>
	<label>Data de nascimento do professor:</label>
	<input type="text" name="txtdatanasciprofessor" value="<%= prof.getDataNascProfessor() %>" size="100"/><br>
	<label>Telefone do professor: </label>
	<input type="text" name="txttelefoneprofessor" value="<%= prof.getTelefoneProfessor() %>" size="100"/><br>
	<label>Nome do professor:</label>
	<input type="text" name="txtnomeprofessor" value="<%= prof.getNomeProfessor() %>" size="100"/><br>
	<label>Senha do professor: </label>
	<input type="password" name="txtsenhaprofessor" value="<%= prof.getSenha() %>" size="100"/><br>
	<label>E-mail do professor:</label>
	<input type="text" name="txtemailprofessor" value="<%= prof.getEmailProfessor()  %>" size="100"/><br><br><br><br>

	<input type="submit" value="Salvar"/>	
	
	
</form>

</body>
</html>