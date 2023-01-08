<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Manage Users</title>
</head>
<body style="background-color: lightblue;">
<h1>Below are the Users Signed Up</h1>
<table border="1">

		<th>Sr No</th>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Email</th>
		
		<c:forEach var="userss" items="${userss }" varStatus="status">
			<tr>
				<td>${status.index + 1}</td>
				<td>${userss.firstname}</td>
				<td>${userss.lastname}</td>
				<td>${userss.email}</td>
			</tr>
		</c:forEach>
	</table>
	
<h1>Please enter below the name of old user who deleted account </h1>
	<form action ="<%= request.getContextPath()%>/searchforuser" method="get">
<input type="text" name="searchforuser"/><br><br>
<input type="submit" value="search for deleted user"/>
	
</body>
</html>