<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form modelAttribute="booking" action="updatebooking">
		<table>
			<tr>
				<td><form:label path="bookingid">BookingId</form:label></td>
				<td><form:input path="bookingid" readonly="true" />
			</tr>
			<tr>
				<td><form:label path="bookedfrom">From : </form:label></td>
				<td><form:input path="bookedfrom" /></td>
			</tr>
			<tr>
				<td><form:label path="bookedto">To : </form:label></td>
				<td><form:input path="bookedto" /></td>
			</tr>
			<tr>
				<td><form:label path="numofadults">Number of adults : </form:label></td>
				<td><form:input path="numofadults" /></td>
			</tr>
			<tr>
				<td><form:label path="numofchids">Number of childrens : </form:label></td>
				<td><form:input path="numofchids" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit"/></td>
			</tr>
		</table>
	</form:form>
</body>
</html>