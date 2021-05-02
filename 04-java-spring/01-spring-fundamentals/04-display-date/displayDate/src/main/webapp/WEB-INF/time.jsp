<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/style.css" />
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<fmt:formatDate value="${time}" pattern="H:mm" />
	
</body>
</html>