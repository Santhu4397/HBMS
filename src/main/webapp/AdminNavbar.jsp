<%@page import="com.ty.HBMS.dto.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: #333;
}

li {
  float: left;
}

li a {
  display: block;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

/* Change the link color to #111 (black) on hover */
li a:hover {
  background-color: #111;
}
</style>
</head>
<body>
<%HttpSession hSession=request.getSession();
User userg=(User)hSession.getAttribute("user");
%>
	<ul>
		<li><a href="user">Create user</a></li>
		<li><a href="hotel">Create Hotel</a></li>
		<li><a href="booking">Create Booking</a></li>
		<li><a href="getallhotels">View Hotels</a></li>
		<li><a href="getallbookings">View all bookings</a></li>
		<li><a href="getallusers">View users</a></li>
		<li style="float: right;"><h4>Hi <%=userg.getName()%></h4></li>
		<li style="float: right;"><a href="logout">log out</a></li>
	</ul>
</body>
</html>