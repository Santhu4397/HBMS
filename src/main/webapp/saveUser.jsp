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
<h1 align="center">Create User</h1>
<form:form action="saveuser" modelAttribute="user">
<table>
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
</form:form>

</body>
</html>