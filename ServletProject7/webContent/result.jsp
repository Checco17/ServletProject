<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="Francesco.CRUD.AutoCRUD"%>
<%@ page import="Francesco.Model.Auto"%>
<%@ page import="java.util.*"%>
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

table {
	text-align: center;
	width: 30%;
	margin: 0 auto;
	border-collapse: collapse;
    border: 1px solid black;
}

th, td {
    border: 1px solid black;
    padding: 8px;
    
  }
  
  tr:first-child {
    background-color: yellow; /* Imposta il colore di sfondo desiderato per la prima riga */
  }
</style>
<title>ELENCO AUTOMOBILI</title>
</head>
<body>
	<h1>REGISTRO AUTOMOBILI</h1>
	<br>
	
	
	<table>

		<tr>
			<th>TARGA</th>

			<th>PROPRIETARIO</th>
			

		</tr>

		 <%AutoCRUD crud = AutoCRUD.getInstance();
 	      ArrayList<Auto> elenco = crud.select();
  	      for(Auto a : elenco){%>
  	      
  	      <tr>
  	      
  	      	<th><%=a.getTarga() %></th>
  	      	<th><%=a.getProprietario() %> </th> 
  	      	   
  	      
  	      </tr>
	   
		 <% } 
 %> 



	</table>
	<br>
	<br>
	<a href="welcome.jsp">TORNA
			A BENVENUTO</a>
</body>
</html>