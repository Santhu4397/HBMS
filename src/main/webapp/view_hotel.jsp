<%@page import="com.ty.HBMS.dto.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2 align="center">Hotel Details</h2>
	<%HttpSession httpSession=request.getSession();
	User user=(User)httpSession.getAttribute("user"); %>
	<table border="2">
		<tr>
			<th>Hotel Id</th>
			<th>Hotel Name</th>
			<th>Hotel City</th>
			<th>Hotel Address</th>
			<th>Hotel Description</th>
			<th>Hotel Cost</th>
			<th>Hotel PhoneNumber1</th>
			<th>Hotel PhoneNumber2</th>
			<th>Hotel Rating</th>
			<th>hotel Email</th>
			<%if(user!=null && user.getRole().equalsIgnoreCase("admin")){%>
			<th>Update</th>
			<th>Remove</th>
			<th>Add Rooms</th>
			<th>View Rooms</th>
			<%}else{%>
			<th>View Rooms</th>
			<%} %>
		</tr>
		<c:forEach items="${hotels}" var="hotels">
			<tr>
				<td>${hotels.hotelid}</td>
				<td>${hotels.hotelname}</td>
				<td>${hotels.hotelcity}</td>
				<td>${hotels.hoteladdress}</td>
				<td>${hotels.hoteldesc}</td>
				<td>${hotels.hotelcost}</td>
				<td>${hotels.hotelphone1}</td>
				<td>${hotels.hotelphone2}</td>
				<td>${hotels.hoterating}</td>
				<td>${hotels.hotelemail}</td>
				<%if(user!=null && user.getRole().equalsIgnoreCase("admin")){%>
				<td><a href="edithotel?hotelid=${hotels.hotelid}">Edit</a></td>
				<td><a href="removehotel?hotelid=${hotels.hotelid}">Remove</a></td>
				<td><a href="rooms?hotelid=${hotels.hotelid}">Create Rooms</a></td>
				<td><a href="getroom?hotelid=${hotels.hotelid}">View Rooms</a></td>
				<%}else{%>
				<td><a href="getroom?hotelid=${hotels.hotelid}">View Rooms</a></td>
				<%} %>
			</tr>
		</c:forEach>
	</table>
</body>
</html>