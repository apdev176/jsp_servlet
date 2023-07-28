<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="welcome" method="post">
		<label>Email Id:</label> <input type="email" name="email"> <br>
		<br> <label>Password</label> <input type="password"
			name="password"><br>
		<br> <select name="accountType" required>
			<option selected disabled value="">-- select an option --</option>
			<option value="saving">Saving Account</option>
			<option value="current">Current Account</option>
		</select> <br> <input type="submit" value="Submit">
	</form>
</body>
</html>