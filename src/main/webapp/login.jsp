<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body >
	<h1 align="center">Login page</h1>

	<form action="login" method="post">
		<table  >
			<tr>
				<td >email ID :</td>
				<td ><input type="email" placeholder="Email ID" name="emailid"></td>
			</tr>
			<tr>
				<td>Password :</td>
				<td><input type="password" placeholder="Password" name="pass"></td>
			</tr>
			
			<tr>
				<td></td>
				<td><input type="submit" value="login"></td>
			</tr>
			<tr>
				
				<td><a href="user">New User</a></td>
			</tr>
			
		</table>
	</form>
</body>
</html>