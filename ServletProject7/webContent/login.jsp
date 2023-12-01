<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
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
<title>LOGIN PAGE</title>
</head>
<body>
<h2>INSERISCI LE CREDENZIALI</h2>
<form action="AutoServlet?op=login" method="POST">
<fieldset>
	<label>EMAIL:</label> <input name="email" id="email" value=""
			type="text"> <br> <br> <label>PASSWORD:</label>
		<input name="password" id="password" value="" type="password"> <br><br>

		<input type="submit" value="ACCEDI" />	
</fieldset>
</form>

<p>NON SEI REGISTRATO?</p>
<br>

<a href="register.jsp">REGISTRATI</a>




</body>
</html>