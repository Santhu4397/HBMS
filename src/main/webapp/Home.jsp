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
<a href="getallusers">select users</a>
<%User user=(User)request.getAttribute("save"); %>
<%User user1=(User)request.getAttribute("update"); %>
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