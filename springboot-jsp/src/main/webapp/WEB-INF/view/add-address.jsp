<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<script>
        function addRow(tableID) {
    
            var table = document.getElementById(tableID);
    
            var rowCount = table.rows.length;
            var row = table.insertRow(rowCount);
            var counts=rowCount-1;
            var cell1 = row.insertCell(0);
            var houseNum = document.createElement("input");
            houseNum.type = "text";
            houseNum.name="user.addresses["+counts+"].houseNum";
            cell1.appendChild(houseNum);
    
            var cell2 = row.insertCell(1);
            var city = document.createElement("input");
            city.type = "text";
            city.name="user.addresses["+counts+"].city";
            cell2.appendChild(city);
    
            var cell3 = row.insertCell(2);
            var country = document.createElement("input");
            country.type = "text";
            country.name="user.addresses["+counts+"].country";
            cell3.appendChild(country);
    
        }
    </script>


	<form:form action="save" method="POST" modelAttribute="user">
    ID : <form:input path="id" />
		<br />
    Name :<form:input path="name" />
		<br />
    Addresses :
    <table id="addressesTable" width="350px" border="1">
			<tr>
				<td>House No.</TD>
				<td>City</TD>
				<td>Country</TD>
			</tr>
			<tr>
				<%-- <c:forEach varStatus="vs" var="address" items="${user.addresses}">
					<div class="dl_item_<c:out value='${vs.index}'/>">
					<td><form:input path="addresse[${vs.index}].houseNum" /></td>
					<td><form:input path="addresse[${vs.index}].city" /></td>
					<td><form:input path="addresse[${vs.index}].country" /></td>
				</c:forEach> --%>
				<td><form:input path="addresses[0].houseNum" /></td>
				<td><form:input path="addresses[0].city" /></td>
				<td><form:input path="addresses[0].country" /></td>
			</tr>
		</table>
		<input type="button" value="Add More"
			onclick="addRow('addressesTable')" />
		<input type="submit" value="SUBMIT" />
	</form:form>
</body>
</html>