<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Person</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
</head>
<body>
<div class="container">
		<h1>New Person</h1>
		<form:form method="POST" action="/add" modelAttribute="person">
			<div class="form-group">
				<form:label path="firstName">First Name: </form:label>
				<form:errors path="firstName"/>
				<form:input path="firstName"/>
			</div>
			<div class="form-group">
				<form:label path="lastName">Last Name: </form:label>
				<form:errors path="lastName"/>
				<form:input path="lastName"/>
			</div>
			<button>Create</button>
		</form:form>
	</div>
</body>
</html>