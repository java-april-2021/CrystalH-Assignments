<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<a href="/languages/">Dashboard</a>
		<p>${language.name}</p>
		<p>${language.creator}</p>
		<p>${language.version}</p>
		<p>Expiration Date:</p>
		<a href="/languages/edit/${id}">Edit</a>
		<a href="/languages/delete/${id}">Delete</a>
	</div>
</body>
</html>