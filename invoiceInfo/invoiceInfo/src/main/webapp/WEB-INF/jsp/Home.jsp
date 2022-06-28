<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>

<!doctype html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<spring:url value="all" var="pageurl" />
<title>Invoice Info List</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
	<%-- <c:set value="${invoiceInfoList}" var="userPageList" /> --%>
	<c:set var="pageListHolder" value="${invoiceList}" scope="session" />
	<div class="container my-2">
		<h1>Invoice Info List</h1>
		<input type="text" id="myInput" onkeyup="searchFunction()"
			placeholder="dueDate filter yyyyy-mm-dd"> <a
			href="http://localhost:9191/openNewInvoiceInfoForm"
			class="btn btn-primary btn-sm mb-3">Add Invoice</a>
		<table border="1" class="table table-striped table-responsive-md">
			<thead>
				<tr>
					<th>S.No.</th>
					<th>Invoice No.</th>
					<th>Bill To</th>
					<th>Invoice Date</th>
					<th>Due Date</th>
					<th>Status</th>
					<th>Amount</th>
					<th>Action</th>
				</tr>
			</thead>

			<tbody id="searchMe">
				<c:forEach var="invoiceInfo" items="${pageListHolder.pageList}">
					<tr>
						<td>${invoiceInfo.id}</td>
						<td>${invoiceInfo.invoiceNo}</td>
						<td>${invoiceInfo.billTo}</td>
						<td>${invoiceInfo.invoiceDate}</td>
						<td>${invoiceInfo.dueDate}</td>
						<td>${invoiceInfo.status}</td>
						<td>${invoiceInfo.grandTotal}</td>
						<td><a
							href="http://localhost:9191/editInvoiceForm/${invoiceInfo.id}"
							class="btn btn-primary">Edit</a> <a
							href="http://localhost:9191/deleteInvoiceByid/${invoiceInfo.id}"
							class="btn btn-danger">Delete</a></td>

					</tr>
				</c:forEach>

			</tbody>

		</table>
		<span style="float: left;"> <c:choose>
				<c:when test="${pageListHolder.firstPage}">Prev</c:when>
				<c:otherwise>
					<a href="/all/prev">Prev</a>
				</c:otherwise>
			</c:choose>
		</span> <span> <c:forEach begin="0"
				end="${pageListHolder.pageCount-1}" varStatus="loop">
    			&nbsp;&nbsp;
     			<c:choose>
					<c:when test="${loop.index == pageListHolder.page}">${loop.index+1}</c:when>
					<c:otherwise>
						<a href="/all/${loop.index}">${loop.index+1}</a>
					</c:otherwise>
				</c:choose>
		   		 &nbsp;&nbsp;
		 </c:forEach>
		</span> <span> <c:choose>
				<c:when test="${pageListHolder.lastPage}">Next</c:when>
				<c:otherwise>
					<a href="/all/next">Next</a>
				</c:otherwise>
			</c:choose>
		</span>




	</div>
	<script type="text/javascript">
		function searchFunction() {

			var input, filter, table, tr, td, i, txtValue;
			input = document.getElementById("myInput");
			filter = input.value.toUpperCase();
			table = document.getElementById("searchMe");
			tr = table.getElementsByTagName("tr");

			for (i = 0; i < tr.length; i++) {
				td = tr[i].getElementsByTagName("td")[4];
				if (td) {
					txtValue = td.textContent || td.innerText;
					if (txtValue.toUpperCase().indexOf(filter) > -1) {
						tr[i].style.display = "";
					} else {
						tr[i].style.display = "none";
					}
				}
			}
		}
	</script>
</body>
</html>