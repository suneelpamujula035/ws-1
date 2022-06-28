<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Invoice Info List</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
          rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
          crossorigin="anonymous">
</head>
<body>
    <div  class="container my-2">
        <h1>Invoice Info List</h1>
        <a href ="" th:href ="@{/openNewInvoiceInfoForm}" class="btn btn-primary btn-sm mb-3">Add Invoice</a>
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

            <tbody>
                <tr th:each="invoiceInfo:${InvoiceInfoList}">
                    <td th:text="${invoiceInfo?.primaryKey}"></td>
                    <td th:text="${invoiceInfo?.invoiceNo}"></td>
                    <td th:text="${invoiceInfo?.billTo}"></td>
                    <td th:text="${invoiceInfo?.invoiceDate}"></td>
                    <td th:text="${invoiceInfo?.dueDate}"></td>
                    <td th:text="${invoiceInfo?.status}"></td>
                    <td th:text="${invoiceInfo?.grandTotal}"></td>
                    <td> <a href="" th:href="@{/editInvoiceForm/{primaryKey}(primaryKey=${invoiceInfo.primaryKey})}" class="btn btn-primary">Edit</a>
                         <a href="" th:href="@{/deleteInvoiceByPrimaryKey/{primaryKey}(primaryKey=${invoiceInfo.primaryKey})}" class="btn btn-danger">Delete</a>
                    </td>


                </tr>
            </tbody>
        </table>

    </div>
</body>
</html>