<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Remove Data</title>
<style>
body
{
 display:flex;
 justify-content:center;
 background-color:whitesmoke;
}
h1
{
text-align:center;
color:orangered;
position:relative;
left:200px;
top:100px;
}
div
{
 border:2px solid white;
 border-radius:0px 20px 0px 20px;
 width:fit-content;
 padding:35px;
 background-color: #00008B;
 color:white;
 font-size:25px;
  font-family:Cambria, Cochin, Georgia, Times, 'Times New Roman', serif;
  position:relative;
  top:200px;
  right:70px;
}
.but
{
  width:90px;
  padding:7px;
  border-radius:20px;
  position:relative;
  left:90px;
  font-size:15px;
  border-color:white;
}
</style>
</head>
<body>
<h1>Remove Detail</h1>
 <div>
  <form action="DeleteServlet" method="get">
    Enter Id:<input type="number" name="id" required><br><br>
    <input type="submit" class="but" name="delete">
  </form>
 </div>
</body>
</html>