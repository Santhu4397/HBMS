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
<h1 align="center">Create Rooms For the Hotels </h1>
<form:form action="saverooms" modelAttribute="room" >
<table>
<tr><td>Room NO:</td><td><form:input type="number" palceholder="RoomNumber" path="roomno"/></td></tr>
<tr><td>Room Type:</td>
<td><form:radiobutton value="AC" path="roomtype"/>AC 
<form:radiobutton value="NON-AC" path="roomtype"/>NON-AC</td></tr>
</table>
<tr><td>Room Cost:</td><td><form:input type="number" palceholder="Room Cost per Night" path="rommcost"/></td></tr><br>
<%-- <tr><td>Room Avilablity:</td>
<td><form:radiobutton value="avilable" path="roomavilable"/>Admin 
<form:radiobutton value="notavilable" path="roomavilable"/>EMP
<form:radiobutton value="Resiserved" path="roomavilable"/>Resiserved</td></tr>
</table><br> --%>
<td><input type="submit" value="submit"/></td></tr>
</form:form>
</body>
</html>