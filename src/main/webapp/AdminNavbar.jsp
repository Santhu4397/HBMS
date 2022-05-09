<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
li {
	float: left;
}

ul {
	list-style-type: none;
	padding: 0;
	background-color: black;
}

li a {
	display: block;
	color: black; text-align : center;
	padding: 14px 16px;
	text-align: center;
	text-decoration: none;
}
</style>
</head>
<body>
	<ul >
		<li><a href="user">Create user</a></li>
		<li><a href="hotel">Create Hotel</a></li>
		<li><a href="booking">Create Booking</a></li>
		<li><a href="rooms">Create Rooms</a></li>
		<li><a href="getallhotels">View Hotels</a></li>
		<li><a href="getallbookings">View all bookings</a></li>
		<li><a href="getallusers">View users</a></li>
		<li><a href="getroom">View Rooms</a></li>
		<li><a href="login.jsp">login </a></li>
		<li><a href="logout">log out</a></li>
	</ul>
</body>
</html>