<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<h1>Welcome ${r}</h1>

<form action="profile" method="post">
<button name="un" value="${r}">View Profile</button> 
</form>
</body>
</html>