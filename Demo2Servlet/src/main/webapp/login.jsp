<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <form action="LoginServlet">
		<label for="email">Email Id :</label> 
		<input type="email" id="email" name="email" required placeholder="Email"><br> <br>
		<label for="pass">Password : </label> 
		<input type="password" id="pass" name="password" placeholder="Password" required maxlength="6"><br> <br>
		<input type="submit" value="submit">
  </form>
</body>
</html>