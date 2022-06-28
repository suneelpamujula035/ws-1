<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl"
	crossorigin="anonymous">

<link rel="stylesheet" type="text/css"
	href="/student-management/URLToReachResourcesFolder/css/my-style-sheet.css">

</head>
<body class="myFonts">

	<div class="container">

		<h1 align="center">Student Management</h1>

		<form action="showAddStudentPage">
			<input type="submit" value="ADD" class="btn btn-success">
		</form>
		<br/>
		<table border="1" class="table table-striped">
			<thead>
				<tr>
					<th>id</th>
					<th>name</th>
					<th>mobile</th>
					<th>country</th>
					<th>action</th>
				</tr>
			</thead>

			<c:forEach var="student" items="${students}">
				<tr>
					<td>${student.id}</td>
					<td>${student.name}</td>
					<td>${student.mobile}</td>
					<td>${student.country}</td>
					<td><a
						href="http://localhost:8080/updateStudent?userId=${student.id}">Update</a>
					<a
						href="http://localhost:8080/deleteStudent?userId=${student.id}"
						onclick="if(!(confirm('Are you sure you want to delete this student?'))) return false">Delete</a></td>
				</tr>

			</c:forEach>

		</table>
	</div>
</body>
</html>