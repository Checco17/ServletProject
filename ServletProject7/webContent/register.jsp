<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
body{
text-align: center;
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
<title>REGISTRAZIONE UTENTE</title>
</head>
<body>
<h2>INSERISCI I TUOI DATI</h2>

<form action="AutoServlet?op=insertUtente" method="POST">
<fieldset>
<label>EMAIL:</label> <input name="email" id="email" value=""
			type="text"> <br> <br> <label>PASSWORD:</label>
		<input name="password" id="password" value="" type="password"> <br><br>
	    <label>CONFERMA PASSWORD:</label>
		<input name="confermaPassword" id="confermaPassword" value="" type="password"> <br><br>
<input type="submit" value="REGISTRATI" /> <br><br>

<button class="button" type="button"
		onclick="window.location.href = 'login.jsp';">ESCI</button>
	<br>
</fieldset>
</form>

</body>
</html>