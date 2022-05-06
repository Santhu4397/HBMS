<%@page import="com.ty.HBMS.dto.Hotel"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>HBMS HOME PAGE</h1>
<a href="user">create user</a>
<a href="hotel">Create Hotel</a>
<%Hotel hotel=(Hotel)request.getAttribute("hotel"); %>
<%if(hotel!=null){ %>
<h1><%=hotel.getHotelname() %> Hotel is Saved</h1>
<%} %>

</body>
</html>