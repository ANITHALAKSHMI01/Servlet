<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Demo</title>
<style>
body
{
    background-color: whitesmoke;
}
h1
{
text-align:center;
position:relative;
 top:60px;
 color: orangered;
}
div
{
 border:2px solid #38d9b3;
 border-radius:20px 0px 20px 0px;
 box-shadow:2px 2px 2px 2px;
 display:flex;
 justify-content:center;
 width:fit-content;
 padding:20px;
 position:relative;
 left:450px;
 top:70px;
 background-color: #38d9b3;
 opacity: 0.6;
 font-size:20px;
}
.but
{
   padding:5px;
   width:100px;
   position:relative;
   left:90px; 
   border-radius:20px;
   background-color: green;
   color:white;
   font-size:15px;
}
</style>
</head>
<body>
	<h1>Registration Form</h1>
	<div>
	<form action="Servlet1" method="get">
		 Name          : <input type="text" name="name"><br><br>
		 Phone Number  : <input type="tel" name="phoneNo" maxlength=10><br><br>
		 Email Id      : <input type="email" name="emailId" required><br><br>
		 Password      : <input type="password" name="password" maxlength=6 required><br><br>
		 <input class="but" type="submit" name="submit">
	</form>
	</div>
</body>
</html>