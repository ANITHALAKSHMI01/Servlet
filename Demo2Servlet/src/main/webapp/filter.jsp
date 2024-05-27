<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
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
/* right:50px; */
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
left:60px; 
border-color:white;
}
</style>
<meta charset="ISO-8859-1">
<title>Filter</title>
</head>
<body>
<div>
<form action="SearchServlet" method="post">
	From Date : <input type="date" name="fromDate" max="2010-07-31" min="2001-01-01" placeholder="DOB"><br><br>
	To Date   : <input type="date" name="toDate" max="2010-07-31" min="2001-01-01" placeholder="DOB"><br><br>
	<input type="submit" class="but" name="filter">
</form>
</div>
</body>
</html>