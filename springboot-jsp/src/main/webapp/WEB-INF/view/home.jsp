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
 
            var cell1 = row.insertCell(0);
            var element1 = document.createElement("input");
            element1.type = "checkbox";
            element1.name="chkbox[]";
            cell1.appendChild(element1);
 
            var cell2 = row.insertCell(1);
            cell2.innerHTML = rowCount + 1;
 
            var cell3 = row.insertCell(2);
            var element2 = document.createElement("input");
            element2.type = "text";
            var length=(table.rows.length)-1;
            element2.name = "operationParameterses["+length+"].name";
            cell3.appendChild(element2);
 
        }
 
        function deleteRow(tableID) {
            try {
            var table = document.getElementById(tableID);
            var rowCount = table.rows.length;
 
            for(var i=0; i<rowCount; i++) {
                var row = table.rows[i];
                var chkbox = row.cells[0].childNodes[0];
                if(null != chkbox && true == chkbox.checked) {
                    table.deleteRow(i);
                    rowCount--;
                    i--;
                }
            }
            }catch(e) {
                alert(e);
            }
        }
 
    </script>

<form:form commandName="user" action="lazyRowAdd.web" method="POST">        
 
            <fieldset>
                <legend>User details</legend>
                <ol>
                    <li>
                        <label for=name>Name</label>
                        <form:input path="name"  type="text" placeholder="First and last name" />
                    </li>
                    <li>
                        <label for=name>Date</label>
                    <form:input path="dob" type="date" required="true" />
                    </li>
                    <li>
                        <label for=email>Email</label>
                        <form:input path="email" type="text" required="true" />
                    </li>
                    <li>
                        <label for=phone>Phone</label>
                        <form:input path="phone" type="text" required="true" />
                    </li>
 
                    <li>
                        <input type="button" value="Add Row" onclick="addRow('dataTable')" />  
                        <input type="button" value="Delete Row" onclick="deleteRow('dataTable')" />                    
                        <table id="dataTable" width="350px" border="1">
                            <tr>                           
                                <td><input type="checkbox" name="chk"/></td>
                                <td> 1 </td>
                                <td> <input type='text' name = "operationParameterses[0].name"/> </td>                               
                            </tr>
                        </table>
                    </li>
 
                </ol>
                Dynamically data entered below:
                <ol>
                <c:forEach items="${user.operationParameterses}" var="value">
                  <li><c:out value="${value.name}"/></li>
                 </c:forEach>
                </ol>
            </fieldset>            
            <fieldset>
                <button type=submit>Save User Details!</button> 
            </fieldset>
        </form:form>
</body>
</html>