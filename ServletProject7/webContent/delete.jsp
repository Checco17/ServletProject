<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
h1 {
	color: #3498db; /* Colore del testo */
	font-size: 24px; /* Dimensione del font */
	font-family: "Times New Roman", Times, serif;
	/* Font in stile romano */
}

body {
	text-align: center;
}

input[type="submit"] {
	background-color: #3498db; /* Colore di sfondo */
	color: #fff; /* Colore del testo */
	border: none; /* Rimuovi il bordo */
	border-radius: 4px; /* Bordi arrotondati */
	padding: 10px 20px; /* Spazio interno */
	cursor: pointer; /* Cambia il cursore al passaggio del mouse */
	}
fieldset {
  width: 300px;
  margin: 0 auto;
  padding: 20px;
  border: 1px solid #ccc;
  border-radius: 5px;
}

legend {
  font-weight: bold;
  margin-bottom: 10px;
}	
</style>
<title>RIMOZIONE AUTOMOBILE</title>
</head>

<body>
	<h1>RIMUOVI UN AUTOMOBILE NEL DATABASE</h1>

	<form action="AutoServlet?op=delete" method="POST">
	<fieldset>
		<label>TARGA:</label> <input name="targa" id="targa" value=""
			type="text"> <br> <br> <label>PROPRIETARIO:</label>
		<input name="proprietario" id="proprietario" value="" type="text"><br>
		<br> <input type="submit" value="Salva modifica" /> <br> <br> <a
			href="welcome.jsp">TORNA A BENVENUTO</a>
			</fieldset>
	</form>
</body>
</html>