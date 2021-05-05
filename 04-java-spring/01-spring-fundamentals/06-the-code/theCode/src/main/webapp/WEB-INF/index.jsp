<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Try the Code</title>
</head>
<body>
	<c:out value="${errorMessage}"/>
	<h1>What is the code?</h1>
	<form method="POST" action="/tryCode">
		<input type="text" value="" name="code">
		<button>Try code.</button>
	</form>
</body>
</html>