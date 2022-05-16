<%@page import="com.ty.HBMS.dto.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">Create Rooms For the Hotels</h1>
<%
	HttpSession httpSession = request.getSession();
	User user = (User) httpSession.getAttribute("user");
	%>
	<%if(user.getRole().equalsIgnoreCase("admin")){ %>
		<%@ include file="AdminNavbar.jsp" %>
	<%} else { %>
		<%@ include file="user_navbar.jsp" %>
	<%} %>
	<form:form action="saverooms" modelAttribute="room">
		<table>
			<tr>
				<td>Room NO:</td>
				<td><form:input type="number" palceholder="RoomNumber"
						path="roomno" /></td>
			</tr>
			<tr>
				<td>Room Type:</td>
				<td><form:radiobutton value="AC" path="roomtype" />AC <form:radiobutton
						value="NON-AC" path="roomtype" />NON-AC</td>
			</tr>
			<tr>
				<td>Room Cost:</td>
				<td><form:input type="number" palceholder="Room Cost per Night"
						path="rommcost" /></td>
			</tr>
			<tr>
				<td>Room Capacity</td>
				<td><form:input type="number" path="roomCapacity" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="submit" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>