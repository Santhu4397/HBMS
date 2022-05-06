<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
         <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">Update Room Details </h1>
<form:form action="updateroom" modelAttribute="rooms" >
<table>
<tr><td>Room ID:</td><td><form:input type="number" path="roomId" readonly="true"/></td></tr>
<tr><td>Room NO:</td><td><form:input type="number" palceholder="RoomNumber" path="roomno"/></td></tr>
<tr><td>Room Type:</td>
<td><form:radiobutton value="AC" path="roomtype"/>AC 
<form:radiobutton value="NON-AC" path="roomtype"/>NON-AC</td></tr>
</table>
<tr><td>Room Cost:</td><td><form:input type="number" palceholder="Room Cost per Night" path="rommcost"/></td></tr><br>
<tr><td>Room Available:</td>
<td><form:radiobutton value="Available" path="roomavilable"/>available
<form:radiobutton value="NotAvailable" path="roomavilable"/>not available
<form:radiobutton value="Reserved" path="roomavilable"/>reserved</td></tr>
</table><br> 
<td><input type="submit" value="submit"/></td></tr>
</form:form>
</body>
</html>