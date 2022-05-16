<%@page import="com.ty.HBMS.dto.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 align="center"><b>USERS DETAILS</b></h1>
<%
	HttpSession httpSession = request.getSession();
	User user = (User) httpSession.getAttribute("user");
	%>
	<%if(user.getRole().equalsIgnoreCase("admin")){ %>
		<%@ include file="AdminNavbar.jsp" %>
	<%} else { %>
		<%@ include file="user_navbar.jsp" %>
	<%} %>
	<table border="1" align="center">
		<tr>
			<th>name</th>
			<th>email</th>
			<th>contact Details</th>
			<th>Address</th>
			<th>role</th>
			<th>update</th>
			<th>remove</th>
		</tr>
		<c:forEach items="${users}" var="u">
			<tr>
				<td>${u.name }</td>
				<td>${u.email }</td>
				<td>${u.mob }</td>
				<td>${u.address }</td>
				<td>${u.role }</td>
				<td><a href="getbyid?id=${u.uid }">update</a></td>
				<td><a href="deleteuser?id=${u.uid }">remove</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>