<<<<<<< HEAD
<%@page import="com.ty.HBMS.dto.Hotel"%>
=======
<%@page import="com.ty.HBMS.dto.User"%>
>>>>>>> 685bc56e37aa49cf5179e06d95131a23dbf18c97
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
<%Hotel hotel=(Hotel)request.getAttribute("hotel"); %>
<%if(hotel!=null){ %>
<h1><%=hotel.getHotelname() %> Hotel is Saved</h1>
<%} %>
<a href="getallusers">select users</a>
<%User user=(User)request.getAttribute("save"); %>
<%User user1=(User)request.getAttribute("udate"); %>
<%int id=(Integer)request.getAttribute("remove"); %>
<%if (user!=null){ %>
<h1><%=user.getName() %> User Saved </h1>
<%}else if(user1!=null){%>
<h1><%=user.getName() %> User UPdated </h1>
<%}else{ %>
<h1> User with ID:<%=id %> Removed </h1>
<%} %>
</body>
</html>