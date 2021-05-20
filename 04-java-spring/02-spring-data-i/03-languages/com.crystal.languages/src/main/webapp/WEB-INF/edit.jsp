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
		<a href="/languages/delete/${language.id}" method="DELETE">Delete</a> 
		<a href="/languages">Dashboard</a>
		<c:forEach items="${errors}" var="errors">
		<h5>${errors}</h5>
		</c:forEach>
		<form action="/languages/edit/${language.id}" method="POST">
			<div class="form-group">
				<div>
					<label path="creator">Creator: </label> 
					<form:errors path="creator"/>
					<input type="text"
						name="creator" value="${language.creator}">
				</div>
				<div>
					<label path="name">Name: </label> 
					<form:errors path="name"/>
					<input type="text" name="name"
						value="${language.name}">
				</div>
				<div>
					<label path="version">Version: </label>
					<form:errors path="version"/> 
					<input type="number"
						name="version" value="${language.version}">
				</div>
				<button>Submit</button>
		</form>
</body>
</html>