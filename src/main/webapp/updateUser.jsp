<%@page import="com.ty.HBMS.dto.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
      <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">UpDate User</h1>
<%
	HttpSession httpSession = request.getSession();
	User user = (User) httpSession.getAttribute("user");
	%>
	<%if(user.getRole().equalsIgnoreCase("admin")){ %>
		<%@ include file="AdminNavbar.jsp" %>
	<%} else { %>
		<%@ include file="user_navbar.jsp" %>
	<%} %>
<form:form action="updateuser" modelAttribute="user" method="post">
<table>
<tr><td>ID:</td><td><form:input type="number" palceholder="ID" path="uid" readonly="true"/></td></tr>
<tr><td>NAME:</td><td><form:input type="text" palceholder="Username" path="name"/></td></tr>
<tr><td>Email:</td><td><form:input type="email" palceholder="UserEmail ID" path="email"/></td></tr>
<tr><td>password:</td><td><form:input type="password" palceholder="UserEmail ID" path="password"/></td></tr>
<tr><td>Contact NO:</td><td><form:input type="number" palceholder="UserEmail ID" path="mob"/></td></tr>
<tr><td>Address:</td><td><form:input type="text" palceholder="UserEmail ID" path="address"/></td></tr>

<tr><td>ROLE:</td>
<td><form:radiobutton value="Admin" path="role"/>Admin 
<form:radiobutton value="Emp" path="role"/>EMP
<form:radiobutton value="User" path="role"/>User</td></tr>
</table>
<td><input type="submit" value="submit"/></td></tr>
</form:form>
</body>
</html>