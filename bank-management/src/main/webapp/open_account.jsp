<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>

	<form   action="customerDetail" method="post">
		<label>Name:</label> <input required type="text" name="customerName"><br>
		<br> <label>Email:</label> <input required type="email"
			name="customerEmail"><br>
		<br> <label>Password:</label> <input required type="text"
			name="customerPassword" minlength="8"><br>
		<br> <label>Phone Number</label> 
		<input required type="text"  name="customerPhone"  minlength="10" maxlength="10"><br>
		<br> <label>PAN</label> <input required type="text" name="customerPan"><br>
		<br> <label>Age</label> <input required type="number" min="18" name="customerAge"><br>
		<br> <label>Account Type:</label> 
		<select name="accountType" required>
			<option selected disabled value="" >-- select an option --</option>
			<option value="saving">Saving Account</option>
			<option value="current">Current Account</option>
		</select> <br>
		<br> <input type="submit">
	</form>
</body>
</html>
