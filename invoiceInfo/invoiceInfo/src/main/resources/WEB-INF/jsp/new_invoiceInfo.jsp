<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en" >
<head>
    <meta charset="UTF-8">
    <title>Add New Invoice</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
          rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
          crossorigin="anonymous">
</head>
<body>
<div class="container">
    <h2>Add New Invoice</h2><br>
    
    <form:form  action="saveInvoice" modelAttribute="invoiceInfo" method="POST">

        <form:hidden  path="id"
               placeholder="id" class="form-control mb-4 col-4"/>

        <form:input type="text" path="invoiceNo"
               placeholder="invoiceNo" class="form-control mb-4 col-4"/>

        <form:input type="text" path="billTo"
               placeholder="billTo" class="form-control mb-4 col-4"/>

        <form:input type="text" path="status"
               placeholder="status" class="form-control mb-4 col-4"/>

        <form:input type="date" path="invoiceDate"
               placeholder="invoiceDate" class="form-control mb-4 col-4"/>

        <form:input type="date" path="dueDate"
               placeholder="dueDate" class="form-control mb-4 col-4"/>
        <!-- <div>
            <table border="1" class="table table-striped table-responsive-md">
                <thead>
                <tr>
                    <th>SNo</th>
                    <th>Product</th>
                    <th>Description</th>
                    <th>Price</th>
                    <th>Qty</th>
                    <th>Tax%</th>
                    <th>Total</th>
                    <th>
                        <button type="submit" name="addRow" onclick="addRow()">Add row</button>
                    </th>

                </tr>
                </thead>

                <tbody id="tbody">

                    <tr>
                        
                        <td >1</td>

                        <td>
                            <input type="text" name="productName" >

                        </td>

                        <td>
                             <textarea class="form-control rounded-0" name="description" id="description" rows="3"
                                       maxlength="500"
                                       placeholder="Description"
                                        ></textarea>
                        </td>

                        <td>
                            <input type="number" name="price" id="price" class="form-control" placeholder="Price">
                        </td>

                        <td>
                            <input type="number" name="qty" class="form-control" id="qty" placeholder="Qty">
                        </td>

                        <td>
                            <input type="number" name="taxPercent" class="form-control" id="taxPercent" placeholder="Tax(%)">
                        </td>

                        <td>
                            <input type="number" name="total" class="form-control" id="total" placeholder="Total">
                        </td>
                        <td>
                            <button type="submit" name="removeRow"  >Remove row</button>
                        </td>
                       

                    </tr>

                </tbody>

            </table>
        </div> -->

        <button type="submit" class="btn btn-primary">save</button>
    </form:form>

</div>
<script type="text/javascript" src="script.js">
</script>
</body>
</html>