<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1">
<c:forEach var="Book" items="${ books}">
<tr>
<td><c:out value="${ Book.bookName}"></c:out></td>
<td><c:out value="${Book.author}"></c:out></td>
<td><c:out value="${Book.ISBN}"></c:out></td>
<td><c:out value="${Book.price}"></c:out></td>
<td><c:out value="${Book.publication}"></c:out></td>
</tr>

</c:forEach>
</table>

</body>
</html>