<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Product</title>
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
	
	
	
	
</style>
</head>
<body>
	<main class="maincontainer">
	<form action="/update" method="post">
	
	Product Id:<input id="name"  required="required"  type="text" name="id" placeholder="Enter the product name"/>
	
	New Quantity:<input type="text" name="quantity" required  placeholder="Enter the product Company"/>
	<button  type="submit"  >Submit</button>
	</form>
	<button  type="button" href="/home" >Hme</button>
	</main>

</body>
</html>