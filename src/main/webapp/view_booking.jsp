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
	<table border="2">
		<tr>
			<th>Booking Id</th>
			<th>From</th>
			<th>To</th>
			<th>Number of adults</th>
			<th>Number of childrends</th>
			<th>Amount</th>
			<th>Edit</th>
			<th>Remove</th>
		</tr>
		<c:forEach items="${booking}" var="booking">
			<tr>
				<td>${booking.bookingid}</td>
				<td>${booking.bookedfrom}</td>
				<td>${booking.bookedto}</td>
				<td>${booking.numofadults}</td>
				<td>${booking.numofchids}</td>
				<td>${booking.amount}</td>
				<td><a href="editbooking?id=${booking.bookingid}">Edit</a></td>
				<td><a href="removebooking?id=${booking.bookingid}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>