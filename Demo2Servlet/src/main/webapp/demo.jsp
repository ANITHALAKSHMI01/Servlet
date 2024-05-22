<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Demo</title>
<style>
div
{
 border:2px solid;
 display:flex;
 justify-content:center;
 width:fit-content;
 padding:20px;
}
</style>
</head>
<body>
	<div>
	<form action="Servlet1" method="post">
		 Name          : <input type="text" name="name"><br><br>
		 Phone Number  : <input type="tel" name="phoneNo" maxlength=10><br><br>
		 Email Id      : <input type="email" name="emailId"><br><br>
		 Password      : <input type="password" name="password" maxlength=6><br><br>
		 <input type="submit" name="submit">
	</form>
	</div>
</body>
</html>