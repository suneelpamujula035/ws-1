<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">This is Welcome Page</h1>

<%
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");//HTTP 1.1
	response.setHeader("Pragma", "no-cache");//HTTP 1.0
	response.setHeader("Expires", "0");//Proxies
	
	if(session.getAttribute("user")==null)
	{
		response.sendRedirect("login.jsp");
	}

%>
 Welcome Mr. ${user}
<a href="videos.jsp">videos</a>

<form action="LogoutServlet">
<input type="submit" value="Logout">
</form>
</body>
</html>