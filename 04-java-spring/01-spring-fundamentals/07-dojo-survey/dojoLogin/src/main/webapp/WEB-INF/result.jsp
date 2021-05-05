<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Submitted Info</h1>
	<p>Name: <c:out value="${formData.name}"/></p>
	<p>Dojo Location: <c:out value="${formData.location}"/></p>
	<p>Favorite Language: <c:out value="${formData.language}"/></p>
	<p>Comment: <c:out value="${formData.comment}"/></p>
	
	<a href="/">Go back</a>
</body>
</html>