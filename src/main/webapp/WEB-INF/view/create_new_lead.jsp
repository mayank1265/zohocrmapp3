<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>create lead</title>
</head>
<body>
<h2>Create New Lead</h2>
<form action="save" method = "post">
 <pre>
		      First Name<input type = "text" name = "firstName"/>
		      Last Name<input type = "text" name = "lastName"/>
		      Email<input type = "text" name = "email"/>
		      Mobile<input type = "text" name = "mobile"/>
		      
		      <select name="source" >
		  <option value="radio">radio</option>
		  <option value="newspaper">newspaper</option>
		  <option value="advertisement">advertisement</option>
		  <option value="website">Website</option>
		</select>
		      <input type = "submit" value = "save"/>
		     
		      </pre>

</body>
</html>