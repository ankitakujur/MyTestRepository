<%@page import="com.connection.Book" %>
<%@page import="java.util.List" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
List<Book> list=(List<Book>)request.getAttribute("books");
%>
<table>
<%
for(Book b: list)
{
	%>
	<tr>
	<td><%out.println(b.getBookName());%></td>
	<td><%out.println(b.getISBN());%></td>
	<td><%out.println(b.getAuthor());%></td>
	<td><%out.println(b.getPrice());%></td>
	<td><%out.println(b.getPublication());%></td>
	</tr>
	<%} %>
</table>
}

</body>
</html>