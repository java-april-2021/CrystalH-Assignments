<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Main Page</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
</head>
<body>
	<h1>This is the main page!</h1>
	<hr>
	<table class="table table-dark">
		<thead>
			<td>ID</td>
			<td>Name</td>
			<td>Creator</td>
			<td>Version</td>
		</thead>
		<tbody>
			<c:forEach items="${languages}" var="language">
			<tr>
				<td>${language.id}</td>
				<td><a href="/languages/${language.id}">${language.name}</a></td>
				<td>${language.creator}</td>
				<td>${language.version}</td>
				<td><a href="/languages/delete/${language.id}" method="DELETE">Delete</a></td>
				<td><a href="/languages/edit/${language.id}">Edit</a></td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>