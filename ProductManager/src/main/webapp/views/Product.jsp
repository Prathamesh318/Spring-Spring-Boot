<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
	
	
	
	
</style>
</head>
<body>
	<main class="maincontainer">
	<form action="/product" method="post">
	
	Product Name:<input id="name" type="text" name="name" placeholder="Enter the product name"/>
	
	Product Company:<input type="text" name="company" placeholder="Enter the product Company"/>
	
	Product quantity:<input type="text" name="quantity" placeholder="Enter the product quantity"/>
	<button  type="submit">Submit</button>
	</form>
	
	</main>

</body>
</html>