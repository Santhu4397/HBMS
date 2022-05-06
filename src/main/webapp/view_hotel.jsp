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
	<table>
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
			<th>Update</th>
			<th>Remove</th>
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
				<td><a href="edithotel?=${hotels.hotelid}"/>Edit</td>
				<td><a href="removehotel?=${hotels.hotelid}"/>Remove</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>