<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page  import="com.product.model.Product" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find Product</title>
<style>
	input{
		padding:20px;'
	
	}
	body{
	
		background:rgb(171, 163, 162)
	}
	.maincontainer{
		height:100vh;
		width:100%;
		display:flex;
		flex-direction:column;
		align-items:center;
		justify-content:center;
	
	}
	form{
		display:flex;
		flex-direction:column;
		align-items:center;
		justify-content:center;
		background:orange;
		width:fit-content;
		padding:10px;
		gap:0.5rem;
		margin:10px;
		border:1px solid white;
		border-radius: 10px;
		box-shadow: maroon;
		
	
	}
	
	button{
		padding:5px;
		margin:2px;
		color:white;
		border:2px solid gray;
		background-color: brown;
		border-radius: 5px;
		
	}
	a{
		decoration-style:none;
		color:white;
		width:fit-content;
		height:fit-content;
		padding:5px;
		margin:2px;
		background-color:brown;
		border:2px solid gray;
		border-radius: 5px;
	}
	.content{
		height:300px;
		width:300px;
		background-color:white;
		padding:10px;
		margin-top:10px;
		color:gray;
		border:2px solid white;
		border-radius:10px;
		
	
	}
	h1{
	color:gray;
	}
	
	
	
	
	
	
	
</style>
</head>
<body>
	<main class="maincontainer">
	<form action="/delete" method="post">
	
	Product Id:<input id="name"  required="required"  type="text" name="id" placeholder="Enter the product id"/>
	<button  type="submit"  >Submit</button>
	</form>
	<a  type="button" href="/home" >Home</a>
	</main>

</body>
</html>