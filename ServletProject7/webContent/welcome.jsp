<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
 h1 {
    color: #3498db; /* Colore del testo */
    font-size: 24px; /* Dimensione del font */
    font-family: "Times New Roman", Times, serif; /* Font in stile romano */   
  }

  p {
    color: #555; /* Colore del testo */
    font-size: 16px; /* Dimensione del font */
    font-family: "Times New Roman", Times, serif; /* Font in stile romano */
  }
.button {
	margin-bottom: 10px;
	background-color: #3498db;
	color: #fff;
	border: none;
	border-radius: 20px;
	padding: 10px 20px;
	box-shadow: 0px 2px 4px rgba(0, 0, 0, 0.4);
}

body {
	text-align: center;
}
</style>

<meta charset="UTF-8">
<title>DATABASE AUTOMOBILI</title>
</head>

<body>
	<h1>BENVENUTO SUL SITO DI AUTOMOBILI</h1>
	<p>COSA VUOLE FARE?</p>
	<button class="button" type="button"
		onclick="window.location.href = 'add.jsp';">AGGIUNGI</button>
	<br>
	<button class="button" type="button"
		onclick="window.location.href = 'delete.jsp';">RIMUOVI</button>
	<br>
	<button class="button" type="button"
		onclick="window.location.href = 'update.jsp';">AGGIORNA</button>
		<br>
	<button class="button" type="button"
		onclick="window.location.href = 'result.jsp';">ELENCO</button>
	<br>
	<button class="button" type="button"
		onclick="window.location.href = 'user.jsp';">ELENCO UTENTI</button>
	<br>
	
	<button class="button" type="button"
		onclick="window.location.href = 'AutoServlet?op=logout';">ESCI</button>
	<br>
	
</body>
</html>