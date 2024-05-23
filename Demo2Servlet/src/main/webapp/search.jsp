<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search</title>
</head>
<style>
body
{
 display:flex;
 justify-content:center;
}
h1
{
text-align:center;
position:relative;
top:100px;
left:220px;
}
div
{
border:2px solid;
box-shadow:1px 1px 1px 1px;
border-radius:20px 0px 20px 0px;
width:fit-content;
padding:20px;
position:relative;
top:200px;
right:80px;
font-size:25px;
background-color:skyblue;
 font-family:Cambria, Cochin, Georgia, Times, 'Times New Roman', serif;
}
.but
{
width:100px;
padding:10px;
font-size:15px;
border-radius:10px;
position:relative;
left:100px;
border-color:white;
}
</style>
<body>
<h1>Details</h1>
<div>
<form action="SearchServlet" method="post">
	Enter name:<input type="text" name="name" required><br><br>
	<input type="submit" class="but" name="search">
</form>
</div>
</body>
</html>