<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
 <%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>contacts</title>
</head>
<body>

     <h2>All contacts</h2>
     <table>       
       <tr>
         <th>FirstName</th>
         <th>LastName</th>
         <th>email</th>
         <th>mobile</th>
         <th>Source</th>
         <th>Billing</th>
      </tr>
      <c:forEach  var = "cnt" items="${contacts}"> 
       <tr>
       <td>${cnt.firstName}</td>
       <td>${cnt.lastName}</td>
       <td>${cnt.email}</td>
       <td>${cnt.mobile}</td>
       <td>${cnt.source}</td>
       <td><a href="generatebill?id=${cnt.id}">billing </a></td>
      </tr>
      
      </c:forEach>
        
        </table>
        
        
</body>
</html>