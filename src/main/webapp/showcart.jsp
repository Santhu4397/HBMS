<%@page import="com.ty.HBMS.dto.Rooms"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">
		<b>Cart</b>
	</h1>
	<form action="booking">
		<table border="1" align="center">
			<tr>
				<th>room no</th>
				<th>room type</th>
				<th>room cost</th>
			</tr>
			<%
			HttpSession httpSession = request.getSession();
			List<Rooms> rooms = (List<Rooms>) httpSession.getAttribute("rooms");
			%>
			<%
			for (Rooms r : rooms) {
			%>
			<tr>
				<td><%=r.getRoomno()%></td>
				<td><%=r.getRoomtype()%></td>
				<td><%=r.getRommcost()%></td>
			</tr>
			<%
			}
			%>
		</table>
		<input type="submit" value="Confirm Booking">
	</form>
</body>
</html>