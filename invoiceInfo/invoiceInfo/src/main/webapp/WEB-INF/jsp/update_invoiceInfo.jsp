<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Update Invoice</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

</head>

<body>

	<div class="container">

		<h2>Update Invoice</h2>
		<br>

		<form:form action="/saveInvoice" modelAttribute="invoiceInfo"
			method="POST">
			<form:hidden path="id" placeholder="id" class="form-control " />
			<div class="form-row">
				<div class="form-group col-md-2">
					<label>Invoice No*</label>
				</div>
				<div class="form-group col-md-4">
					<form:input type="text" path="invoiceNo" placeholder="invoiceNo"
						required="required" class="form-control" />
				</div>
				<div class="form-group col-md-2">
					<label>Invoice Date*</label>

				</div>
				<div class="form-group col-md-4">
					<form:input type="date" path="invoiceDate"
						placeholder="invoiceDate" class="form-control" id="invoice_date" />
				</div>
			</div>
			<div class="form-row">
				<div class="form-group col-md-2">
					<label>Bill To*</label>

				</div>
				<div class="form-group col-md-4">
					<form:select path="billTo" class="form-control" required="required">
						<optgroup label="Select_Customer">
							<form:option value="Aayush"></form:option>
							<form:option value="Shridhar"></form:option>
							<form:option value="Suneel"></form:option>
							<form:option value="Lekhana"></form:option>
						</optgroup>
					</form:select>
				</div>
				<div class="form-group col-md-2">
					<label>Due Date*</label>

				</div>

				<div class="form-group col-md-4">
					<form:input type="date" path="dueDate" placeholder="dueDate"
						id="due_date" class="form-control " />
				</div>
			</div>
			<div class="form-row">
				<div class="form-group col-md-2">
					<label>Status*</label>

				</div>
				<div class="form-group col-md-4">
					<form:select path="status" class="form-control">
						<optgroup label="Select_Status">
							<form:option value="Draft"></form:option>
							<form:option value="Sent"></form:option>
							<form:option value="Paid"></form:option>
						</optgroup>
					</form:select>
				</div>
				<div class="form-group col-md-2">
					<label hidden>** :</label>
				</div>
				<div class="form-group col-md-4">
					<input type="text" class="form-control" style="visibility: hidden;">
				</div>
			</div>


			<div class="form-row">
				<h2>Invoice Details</h2>

				<table class="table table-bordered">
					<thead>
						<tr>
							<th>SNo</th>
							<th>Product*</th>
							<th>Description*</th>
							<th>Price*</th>
							<th>Qty*</th>
							<th>Tax%</th>
							<th>Total</th>
							<th><input type="button" value="Add row"
								class="btn btn-primary" onclick="addRows('myTable')" /></th>
						</tr>

					</thead>
					<tbody id="myTable">

					</tbody>
					<tr>
						<td colspan="6" rowspan="2">
							<div class="form-group  col-md-2">
								<label>Invoice Note(Optional) :</label>
							</div>
							<div class="form-group   col-md-6">
								<textarea class="form-control rounded-0" name="invoiceNote"
									id="invoiceNote" rows="3" maxlength="1000"
									placeholder="Invoice Note"></textarea>
							</div>
						</td>
						<td>Sub Total :</td>
						<td><input type="number" path="subTotal" name="subTotal"
							id="subTotal" readonly /></td>
					</tr>
					<tr>
						<td>Total Tax :</td>
						<td><input type="number" path="totalTax" name="totalTax"
							id="totalTax" readonly /></td>
					</tr>
					<tr>
						<td colspan="6" style="border-top: hidden">
							<div class="form-group  col-md-2">
								<label>Attachment (Optional) :</label>
							</div>
							<div class="form-group col-md-4">
								<input type="file" name="file" path="file"
									placeholder="Attachment" id="file" class="form-control">
							</div>
						</td>
						<td>Grand Total:</td>
						<td><input type="number" path="grandTotal" name="grandTotal"
							id="grandTotal" readonly /></td>
					</tr>

				</table>
			</div>

			<input type="submit" value="save" class="btn btn-success" />
			<button type="clear" class="btn btn-danger">Cancel</button>
		</form:form>
	</div>
	<script>
		
	 document.getElementById("invoice_date").onchange=function(){
		 
		 var input = document.getElementById("due_date")
		 input.setAttribute("min",this.value);
	 };
	 
		
	 function addRows() {
         var table = document.getElementById("myTable");
         
         var counts = (table.rows.length) ;
         var temp=counts+1;
        
         var row = table.insertRow(counts).outerHTML = "<tr id='row" + counts + "'> " +

             "<td class='form-control serial'></td> " +
             "<td  ><input type='text' name='listOfProducts[" + counts + "].productName' class='form-control' ></td> " +
             "<td  ><input type='text' name='listOfProducts[" + counts + "].description' class='form-control' ></td> " +
             "<td  ><input type='text' name='listOfProducts[" + counts + "].price' value=0 class='form-control price' ></td> " +
             "<td  ><input type='number' name='listOfProducts[" + counts + "].qty' value=0 class='form-control qty' ></td> " +
             "<td  ><input type='text' name='listOfProducts[" + counts + "].taxPercent' value=0 class='form-control tax' ></td> " +
             "<td  ><input type='number' name='listOfProducts[" + counts + "].total' value=0 class='form-control total' readonly/></td> " +

             "<td><button onclick=deleteRow(this)><i class='fa fa-trash' style='font-size:24px' ></i></button></td> " +
             "</tr>";
             serialize();
             calculation();
             
     }
		
	 function deleteRow(e){
		 e.parentNode.parentNode.parentNode.removeChild(e.parentNode.parentNode);
		 serialize();
		 calculation();
	 }
	 
	 function serialize(){
		 const list = document.querySelectorAll(".serial");
		 list.forEach((ele,idx)=>{
			 ele.innerHTML=idx+1;
		 })
	 }
	 
	 function calculation(){
		 var price = document.querySelectorAll(".price");
		 var qty = document.querySelectorAll(".qty")
		 var tax = document.querySelectorAll(".tax")
		 var total = document.querySelectorAll(".total")
		 var calcTax = [];
		 var tot=[];
		
		 var totalTax = document.getElementById("totalTax");
		 var subTotal = document.getElementById("subTotal");
		 var grandTotal = document.getElementById("grandTotal");
		 
		 var tot_tax=0;
		 var sub_total=0;
		 
		 console.log(total,tax,qty);
		 
		 for(let i=0;i<price.length;i++){
			 
			 calcTax[i]=parseFloat(price[i].value)*parseInt(qty[i].value)*parseFloat(tax[i].value)/100;
			 tot[i]= parseFloat(price[i].value)*parseInt(qty[i].value);
			 total[i].value=tot[i];
		 }
		 
		
		 console.log(calcTax,tot_tax,tot,sub_total);
		 tot_tax=calcTax.reduce((a,c)=> {return a+c},0);
		 totalTax.value=parseFloat(tot_tax);
		 
		 sub_total =tot.reduce((a,c)=> {return a+c},0);
		 subTotal.value=parseFloat(sub_total);
		 
		 
		 grandTotal.value= tot_tax+sub_total;
		 
		 
	 }
	 
	</script>
</body>

</html>
