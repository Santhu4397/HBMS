<%@page import="com.ty.HBMS.dto.Hotel"%>
<%@page import="com.ty.HBMS.dto.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 align="center" >HBMS HOME PAGE</h1>
<a href="user">create user</a>
<a href="hotel">Create Hotel</a>
<a href="getallhotels">View Hotels</a>
<a href="booking">Create Booking</a>
<a href="getallbookings">View all bookings</a>
<%Hotel hotel=(Hotel)request.getAttribute("hotel"); %>
<%if(hotel!=null){ %>
<h1><%=hotel.getHotelname() %> Hotel is Saved</h1>
<%} %>
<a href="getallusers">select users</a>
<%User user=(User)request.getAttribute("save"); %>
<%User user1=(User)request.getAttribute("update"); %>
<%Integer id=(Integer)request.getAttribute("remove"); %>
<%if (user!=null){ %>
<h1><%=user.getName() %> User Saved </h1>
<%}else if(user1!=null){%>
<h1><%=user.getName() %> User UPdated </h1>
<%}else if(id!=null){ %>
<h1> User with ID:<%=id %> Removed </h1>
<%} else{%>

<%} %>
</body>
</html>