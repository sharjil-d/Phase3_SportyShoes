<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Manage Products</title>
</head>
<body>
<h1>Below are the products available in the store</h1>

<table border="1">

		<th>Sr No</th>
		<th>Brand</th>
		<th>Type</th>
		<th>Color</th>
		<th>Size</th>
		<c:forEach var="pp" items="${pp }" varStatus="status">
			<tr>
				<td>${pp.sno}</td>
				<td>${pp.brand}</td>
				<td>${pp.type}</td>
				<td>${pp.color}</td>
				<td>${pp.size}</td>
				

			</tr>
		</c:forEach>
	</table>

<h1>Enter the serial number to delete any product</h1>
<form action ="<%= request.getContextPath()%>/deleteproduct" method="get">
<input type="text" name="producttodelete"/><br><br>
<input type="submit" value="Delete product"/>

</body>
</html>