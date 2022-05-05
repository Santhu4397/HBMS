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
<form:form action="saveuser" modelAttribute="user">
<table>
<tr><td>NAME:<form:input type="text" palceholder="Username" path="name"/></td></tr>
<tr><td>email:<form:input type="email" palceholder="UserEmail ID" path="email"/></td></tr>
</table>
</form:form>

</body>
</html>