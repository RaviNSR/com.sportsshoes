<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
	<%@page isELIgnored="false"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<head>
<c:import url="/head-meta"/>

</head>

<body>
  <c:import url="/head"/>	
  <center>
					    
	<form method="post" action="AddProduct" modelAttribute="Product" >
	
		<!--  -->
		<table style="width: 80%;" class="table center">
				
				<td>Product Name:<input path="productName" type="text" name="ProductName" id="productName" class="form-control" autofocus="true"/></td>
				
			</tr>
			
			
			<tr>
			
				<td>Product Price:<input path="productPrice" name="ProductPrice" type="productPrice"  class="form-control" id="productPrice" autofocus="true"/></td>
				
			</tr>
			
							  	
			<tr>
				
				<td>Product Quantity<input path="productQuantity" name="ProductQuantity" type="productQuantity"  class="form-control" id="productQuantity" autofocus="true" /></td>
				
			</tr>
				
				<tr>
				
				<td>Product Category<input path="productCategory" name="ProductCateogry" type="productCategory"  class="form-control" id="productQuantity" autofocus="true" /></td>
				
			</tr>
							  	
			<tr>
				
				<td>Product Image<input path="productFile" name="ProductImage" type="file" class="form-control" id="productFile" autofocus="true"/></td>
				
			</tr>
				
			<tr>
				
				<td>Product Description: <input path="ProductDescription" name="ProductDescription" type="ProductDescription"  class="form-control" id="ProductDescription" autofocus="true" /> </td>
				
				
			</tr>
		<td>  <button class="btn btn-primary" type="submit">Submit</button></td>
		  </table>
		</form>
	</center>
</body>
</html>