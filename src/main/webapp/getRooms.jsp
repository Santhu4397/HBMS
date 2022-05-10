<%@page import="com.ty.HBMS.dao.RoomDao"%>
<%@page import="com.ty.HBMS.dto.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">
		<b>ROOMS DETAILS</b>
	</h1>
	<%
	HttpSession httpSession = request.getSession();
	User user = (User) httpSession.getAttribute("user");
	%>
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
				} else {
				%>
				<%RoomDao roomDao=new RoomDao();
					roomDao.getRoomById();
				%>
				<td><a href="booking?roomId=${u.roomId}">Book</a></td>
				<td><a href="getallbookings?">view Booking</a></td>
				<%
				}
				%>
			</tr>
		</c:forEach>
	</table>

</body>
</html>