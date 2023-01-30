<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bill info</title>
</head>
<body>
<h2>Billing Details</h2>
      <pre>
         First Name : ${billing.firstName } <br/>
      Last Name : ${billing.lastName } <br/>
      First Email : ${billing.email } <br/>
      First Mobile : ${billing.mobile } <br/>
      Product      : ${billing.product }  <br/>
     Amount      : ${billing.amount }  <br/>
      
      
      
      </pre>
</body>
</html>