<%@page import="com.ty.HBMS.dto.User"%>
<%@page import="com.ty.HBMS.dto.Rooms"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center"><b>Cart</b></h1>
<%
	HttpSession httpSession = request.getSession();
	User user = (User) httpSession.getAttribute("user");
	%>
	<%if(user.getRole().equalsIgnoreCase("admin")){ %>
		<%@ include file="AdminNavbar.jsp" %>
	<%} else { %>
		<%@ include file="user_navbar.jsp" %>
	<%} %>
	<%List<Rooms> rooms = (List<Rooms>) httpSession.getAttribute("rooms");
			%>
			<%if(rooms!= null){ %>
	<form action="booking">
		<table border="1" align="center">
			<tr>
				<th>room no</th>
				<th>room type</th>
				<th>room cost</th>
			</tr>
			
			
			<%
			for (Rooms r : rooms) {
			%>
			<tr>
				<td><%=r.getRoomno()%></td>
				<td><%=r.getRoomtype()%></td>
				<td><%=r.getRommcost()%></td>
			</tr>
		
		</table>
		<input align="center"type="submit" value="Confirm Booking">
			<%
			}}else {
			%>
			<h3>No Booking available</h3>
			<%} %>
	</form>
</body>
</html>