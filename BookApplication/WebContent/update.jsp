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
<form action="update" method="post">
SELECT ISBN<select>
	<c:forEach var="Book" items="${books}">
		<option>${Book.ISBN}</option>
	</c:forEach>
</select><br>
UPDATE PRICE:<input  type="text" name="price"><br>
<input type="submit" value="CHANGE PRICE">
</form>


</body>
</html>