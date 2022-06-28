<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">

<link rel="stylesheet" type="text/css" href="/student-management/URLToReachResourcesFolder/css/my-style-sheet.css">

<link rel="stylesheet" type="text/css" href="/student-management/URLToReachResourcesFolder/css/add-student.css">

</head>
<body>

	<div align="center">
		<h1>Add Student</h1>
		<form:form action="save-student" modelAttribute="student"
			method="POST">

			<form:hidden path="id" />

			<label>Name: </label>
			<form:input path="name" />
			<br />

			<label>Mobile: </label>
			<form:input path="mobile" />
			<br />


			<label>Country: </label>
			<form:input path="country" />
			<br />

			<input type="submit" value="Submit">
		</form:form>
	</div>
</body>
</html>