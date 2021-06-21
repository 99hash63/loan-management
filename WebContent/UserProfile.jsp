<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>User Profile</h1>

<c:forEach var="us" items="${user}">

${us.userName}<br>
${us.password}<br>
${us.firstName}<br>
${us.lastName}<br>
${us.age}<br>
${us.contact}<br>
${us.email}<br>
${us.address}<br>

</c:forEach>


</body>
</html>