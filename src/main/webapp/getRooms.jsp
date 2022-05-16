<%@page import="org.hibernate.internal.build.AllowSysOut"%>
<%@page import="java.util.List"%>
<%@page import="com.ty.HBMS.dto.Rooms"%>
<%@page import="com.ty.HBMS.dao.RoomDao"%>
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
	<h1 align="center">
		ROOMS DETAILS
		
	</h1>

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
			<th>room no</th>
			<th>room type</th>
			<th>room cost</th>
			<th>room available</th>
			<%
			if (user != null && user.getRole().equalsIgnoreCase("admin")) {
			%>
			<th>update</th>
			<th>remove</th>
			<%
			} else {
			%>
			<th>Book</th>
			<th>View Booking</th>
			<%
			}
			%>
		</tr>
		<c:forEach items="${rooms}" var="u">
			<tr>
				<td>${u.roomno }</td>
				<td>${u.roomtype }</td>
				<td>${u.rommcost }</td>
				<td>${u.roomavilable }</td>
				<%
				if (user != null && user.getRole().equalsIgnoreCase("admin")) {
				%>
				<td><a href="getbyidroom?id=${u.roomId }">update</a></td>
				<td><a href="removeroom?id=${u.roomId }">remove</a></td>
				<%
				} else  {
				%>
				<td><a href="add?roomId=${u.roomId}">Add to Cart</a></td>
				<td><a href="getallbookings?">view Booking</a></td>
				<%
				}
				%>
			</tr>
		</c:forEach>
	</table>

</body>
</html>