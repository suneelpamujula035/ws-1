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
	<%-- <h1 align="center">This is my Custom Login Page</h1>
<div align="center">
<form:form>
Username : <input type="text" name="username"><br>

Password : <input type="password" name="password"><br>

<input type="submit" value="Login">
</form:form>
</div> --%>

	<c:if test="${param.error!=null}">
		<i style="color: red">Invalid login or password</i>
	</c:if>
	<c:if test="${param.logout!=null}">
		<i style="color: red">You are successfully logged out! sign in
			again</i>
	</c:if>
	<h1 align="center">This is my Custom Login Page</h1>
	<div align="center">
		<form:form action="/process-login">
Username : <input type="text" name="username">
			<br>

Password : <input type="password" name="password">
			<br>

			<input type="submit" value="Login">
		</form:form>
		<a href="http://localhost:8080/signup">Signup</a>
	</div>
</body>
</html>