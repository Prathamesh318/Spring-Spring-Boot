<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List" %>
<%@page import="com.product.model.Product" %>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>

	.main{
		display:flex;
		height:100%;
		widht:100%;
		justify-content:center;
		align-items:center;
	
	}
	</style>
	
</head>
<body>
	<main class="main">
  <table border="1">
  <tr>  
        <th> Trainer Name</th>
         <th>Trainer Email </th>
   </tr>
 		<% List products=(List<Product>)request.getAttribute("prodlist"); %>
 		
 	<%for(Product p:products) %>
   <tr>
   	<td>
   	<%=p.getCompany() %>
       </td>
   </tr>
   
  </table>
	
	</main>
</body>
</html>