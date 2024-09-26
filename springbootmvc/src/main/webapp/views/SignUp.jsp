<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form  action="signupdetails" method="post">
	TrainerName :<input type='text' name='trainerName'/><br>
	TrainerEmail:<input type='email' name="trainerEmail"/>
	TPassword:<input type='password' name="trainerPass"/>
	TrainerExp:<input type='number' name="exp"/>
	
	<input type="submit" value="SignUp"/>
	
	</form>
</body>
</html>