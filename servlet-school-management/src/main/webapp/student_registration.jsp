<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="studentinfo" method="post">
Name: <input type="text" name="name" placeholder="Enter your name" required><br><br>
Email:<input type="email" name="email" required> <br><br>
Password: <input type="password" name="password" minlength="8" required> <br><br>
<input type="submit">
</form>
</body>
</html>