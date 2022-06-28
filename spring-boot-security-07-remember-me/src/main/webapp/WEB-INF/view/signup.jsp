<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">
		Sign up here !<h1>
		<div align="center">
			<form:form action="/process-signup" method="POST">
Username : <input type="text" name="username">
				<br>

Password : <input type="password" name="password">
				<br>

				<input type="submit" value="Register">
			</form:form>
		</div>
</body>
</html>