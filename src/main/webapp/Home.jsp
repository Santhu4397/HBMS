<%@page import="com.ty.HBMS.dto.Hotel"%>
<%@page import="com.ty.HBMS.dto.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
	<%
	HttpSession ht = request.getSession();
	User user = (User) ht.getAttribute("user");
	%>

	<h1 align="center">HBMS HOME PAGE</h1>
	<%
	if (user != null) {
	%>
	<%
	String role = user.getRole();
	%>
	<%
	if (role.equalsIgnoreCase("admin")) {
	%>
	<%@ include file="AdminNavbar.jsp"%>
	<%
	} else if (role.equalsIgnoreCase("Emp")) {
	%>
	<%@include file="user_navbar.jsp"%>
	<%
	} else if (role.equalsIgnoreCase("user")) {
	%>
	<%@include file="user_navbar.jsp"%>
	<%
	} else {
	%>
	<%
	response.sendRedirect("login.jsp");
	%>
	<%
	}
	}
	%>


</body>
</html>