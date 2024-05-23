<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Data</title>
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
.button
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
</head>
<body>
<h1>Update Password</h1>
<div>
<form action="UpdateServlet" method="post">
    Name:<input type="text" name="name"><br><br>
    Phone Number  : <input type="tel" name="phoneNo" maxlength=10><br><br>
    Email Id      : <input type="email" name="emailId" required><br><br>
    Password:<input type="password" name="password" maxlength=6 required><br><br>
	<input type="hidden" name="id" value="<%= request.getParameter("editId") %>">
	<input type="submit" class="button" name="update">
</form>
</div>
</body>
</html>