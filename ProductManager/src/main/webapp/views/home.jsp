<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home-Product Manager</title>
<style type="text/css">

	body{
	
	background:rgb(171, 163, 162);
	}
	.main{
		display:flex;
		align-items:center;
		justify-content:center;
		flex-direction:column;
		gap:2rem;
		color:white;
		height:700px;
		widht:100%;
		margin-top:50px;
	}
	button{
	padding:5px;
	}
	
	
</style>
</head>
<body>

	
	<div class="main">
		<h1>Welcome to the dashboard of product manager</h1>
		<a href="/product">Add Product</a>
		<a href="/find">Find Product</a>
		<a href="/findAll">Find All Product</a>
		<a href="/update">Update Product</a>
		<a href="/delete">Delete Product</a>
	
	</div>
</body>
</html>