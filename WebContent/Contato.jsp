<!DOCTYPE html>

<html>
<head>
<link href="Estilo.css" type="text/css"rel ="stylesheet">

<meta charset="ISO-8859-1">
<title>Contato</title>
</head>
<body>

<div id="principal">

	<h2>Fale conosco</h2>

		<dl>

			<dt>Matriz</dt>

			<dd>Rua:Sem Nome, s/n</dd>

			<dd>Bairro: Imbiribeira</dd>

			<dd>Tel:+81 3333-3333</dd>

			<dd>E-mail: <a href="infox@gmail.com">infox@gmail.com</a></dd>


		</dl>




<form  action ="Sucesso.html" method="post" id="contato">

<fieldset>
	<legend>Contato</legend>
	
		<label for="nome">Nome:(<span>*</span>)</label>
		<input type="text" name="nome" id="nome"/>
		<label for="nome">E-mail::(<span>*</span>)</label>
		<input type="text" name="email" id="nome"/>
		<label for="nome">Insituição de ensino:(<span>*</span>)</label>
		<input type="text" name="instituicao" id="nome"/>
		
	<div id ="ddd-telefone">
	<div class="um">
	<label for ="ddd">DDD:</label>
	<input type ="text" name="ddd" id="ddd"/>
	</div>
	<div class="dois">
	<label for ="telefone">Telefone:</label>
	<input type ="text" name="telefone" id="telefone"/>
	</div>
	</div>
	
		<label for="assunto">Assunto: (<span>*</span>) </label>
	
	<select name="assunto" id="assunto">
	<option value ="">Escolha um assunto:</option>
	<option value ="comercial">Comercial</option>
	<option value ="tecnico">Técnico</option>
	<option value ="social">Social</option>
	<option value ="outros">Outros</option>
	
	</select>	
		
		<label for="mensagem">Mensagem: (<span>*</span>)</label>
		<textarea name="mensagem" id="mensagem" cols=""rows=""></textarea>
		<input type ="submit" name="enviar" id="enviar" value="Enviar"/>
		
		
		

</fieldset>

</form>
</div>

</body>
</html>