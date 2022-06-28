<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
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
<h1 align="center">Welcome to Home Page</h1>
<h1>Hi ${username}</h1>
<h4>Roles assigned : ${authorities}</h4>

<sec:authorize access='hasAuthority("admin")'>
<a href="/admin">Admin</a>
<!-- http://localhost:8080/admin === /admin  ====>both are same URLs
 -->
 </sec:authorize>

</br>
<sec:authorize access='hasAuthority("user")'>
<a href="/user">User</a>
</sec:authorize>

<form:form action="logout" method="POST">
<input type="submit" value="Logout">
</form:form>
</body>
</html>