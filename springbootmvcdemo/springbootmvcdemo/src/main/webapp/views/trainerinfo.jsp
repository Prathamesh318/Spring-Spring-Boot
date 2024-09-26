
<%@page import="java.util.List" %>
<%@page import="com.infosys.springbootmvcdemo.Model.Trainer" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
			<tr>
			<th>Trainer Name</th>
			<th>Trainer Email</th>
				</tr>
				
				<%
				
				List<Trainer> t1=(List) request.getAttribute("tlist");
				for(Trainer t:t1){
					%>
					<tr>
						<td><%=t.getTrainerId() %></td>
						<td><%=t.getTrainerName()%></td>
						<td><%=t.getTrainerEmail()%></td>
						<td><%=t.getExp()%></td>
						<td><a href="">Update</a></td>
						<td><a href="">Delete</a></td>
					</tr>
			<% }
				
				
				%>
	</table>
	<c:set var="x" value="30"
</body>
</html>