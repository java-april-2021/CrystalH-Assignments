<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<form method="POST" action="/login">
		<label for="name">Your Name: </label>
		<input type="text" name="name">
		
		<label for="location">Dojo Location: </label>
		<select name="location" id="location">
  			<option value="sanjose">San Jose</option>
  			<option value="dallas">Dallas</option>
  			<option value="seattle">Seattle</option>
  			<option value="austin">Austin</option>
		</select>
		
		<label for="language">Favorite Language: </label>
		<select name="language" id="language">
			<option value="python">Python</option>
			<option value="java">Java</option>
			<option value="mern">MERN</option>
		</select>
		<label for="comment">Comment (optional):</label>
		<input type="text" name="text">
		<button>Submit</button>
	</form>
</body>
</html>