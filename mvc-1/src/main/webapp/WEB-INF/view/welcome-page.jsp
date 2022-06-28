<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">

 <h1 align="center">${restaurantName} </h1>
 
 <form action="orderPlaced" method="post">
 <input type="text" name="foodname" placeholder="Enter food name">
 <input type="submit" value="Submit">
 </form>
</body> 
</html>