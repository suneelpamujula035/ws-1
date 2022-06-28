<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h5>We have received your details....We will get back to you</h5>
<hr>
Your Details :
<%-- Name : ${name2}<br>
Number : ${number2}<br>
Email : ${email2} --%>
Name : ${contactInfo.name}<br>
Number : ${contactInfo.number}<br>
Email : ${contactInfo.email}
</body>
</html>