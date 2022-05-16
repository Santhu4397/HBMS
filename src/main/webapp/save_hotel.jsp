<%@page import="com.ty.HBMS.dto.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Hospital</title>
</head>
<body>
<h1 align="center">Hotel Details</h1>
<%
	HttpSession httpSession = request.getSession();
	User user = (User) httpSession.getAttribute("user");
	%>
	<%if(user.getRole().equalsIgnoreCase("admin")){ %>
		<%@ include file="AdminNavbar.jsp" %>
	<%} else { %>
		<%@ include file="user_navbar.jsp" %>
	<%} %>
	<form:form action="savehotel" modelAttribute="hotel" method="post">
		<table>
			<tr>
				<td><form:label path="hotelname">Hotel Name : </form:label></td>
				<td><form:input path="hotelname"/></td>
			</tr>
			<tr>
				<td><form:label path="hotelcity">Hotel City : </form:label></td>
				<td><form:input path="hotelcity"/></td>
			</tr>
			<tr>
				<td><form:label path="hoteladdress">Hotel Address</form:label></td>
				<td><form:input path="hoteladdress"/>
			</tr>
			<tr>
				<td><form:label path="hoteldesc"/>Hotel Description</td>
				<td><form:textarea path="hoteldesc"/></td>
			</tr>
			<tr>
				<td><form:label path="hotelcost">Hotel Cost : </form:label></td>
				<td><form:input path="hotelcost"/></td>
			</tr>
			<tr>
				<td><form:label path="hotelphone1">Hotel Phone Number1 :</form:label></td>
				<td><form:input path="hotelphone1"/></td>
			</tr>
			<tr>
				<td><form:label path="hotelphone2">Hotel Phone Number2 :</form:label></td>
				<td><form:input path="hotelphone2"/></td>
			</tr>
			<tr>
				<td><form:label path="hoterating">Hotel Rating : </form:label></td>
				<td><form:input path="hoterating"/></td>
			</tr>
			<tr>
				<td><form:label path="hotelemail">Hotel Email Id : </form:label></td>
				<td><form:input path="hotelemail"/>
			</tr>
			<tr>
				<td><input type="submit" value="submit"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>