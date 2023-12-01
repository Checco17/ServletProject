<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="Francesco.CRUD.UtenteCRUD"%>
<%@ page import="Francesco.Model.Utente"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>UTENTI SITO</title>
<style>
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
</head>
<body>
<h1>REGISTRO UTENTI</h1>
	<br>
	
	
	<table>

		<tr>
			<th>EMAIL</th>

			<th>PASSWORD</th>
			

		</tr>

		 <%UtenteCRUD crud = UtenteCRUD.getInstance();
 	      ArrayList<Utente> elenco = crud.select();
  	      for(Utente a : elenco){%>
  	      
  	      <tr>
  	      
  	      	<th><%=a.getEmail() %></th>
  	      	<th><%=a.getPassword() %> </th> 
  	      	   
  	      
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