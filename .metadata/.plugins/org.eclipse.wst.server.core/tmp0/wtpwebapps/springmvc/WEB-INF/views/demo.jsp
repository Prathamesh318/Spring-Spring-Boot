<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
  <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> demo page</title>
</head>
<body>
		<h2>This is a demo page</h2>
		<%
		
		//String name =(String)request.getAttribute("name");
		%>
		<h3>
			${name}
		</h3>
		
</body>
</html>