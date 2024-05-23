<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.chainsys.servlet.model.Demo" %>
    <%@ page import="java.util.List" %>
     <%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Table</title>
</head>
<style>
h1
{
  text-align:center;
  color:orange;
}
#main
{
	display:flex;
	justify-content:center;
}
 table
 {
 	border-spacing:0;
 	border-color:white;
 }
 th
 {
 	background-color:blue;
 	color:white;
 	font-size:22px;
 }
 td
 {
  font-size:20px;
 }
 th,td,button,.button
 {
 padding:10px;
 }
 .but
 {
  width:100px;
  border-radius:20px;
  font-size:20px;
  position:relative;
  top:50px;
  left:500px;
  background-color:blue;
  opacity:0.7px;
  border-color:white;
  color:white;
 }
 .but1,.button
 {
  width:100px;
  border-radius:20px;
  font-size:20px;
  background-color:blue;
  opacity:0.7px;
  border-color:white;
  color:white;
 }
</style>
<body>
<h1>Demo Table</h1>
<div id="main">
<table border="2px">
	<thead>
		<tr>
	<th>Id</th>
	 <th>Name</th>
	 <th>Email Id</th>
	 <th>Phone Number</th>
	 <th>Delete</th>
	 <th>Update</th>
	   </tr>
	</thead>
	<tbody>
	  <%List<Demo> list=(ArrayList<Demo>)request.getAttribute("list");
	  for(Demo demo: list)
	  {
	  %>
	  <tr>
	  <td> <%=demo.getId()%></td>
	   <td><%=demo.getName()%></td>
	    <td><%=demo.getEmail() %></td>
	     <td><%=demo.getPhoneNo() %></td>
	     <td>
               <form action="Servlet1" method="post">
                     <input type="hidden" name="deleteId" value="<%=demo.getId()%>">
                     <input type="submit" name="delete" value="Delete" class="button">
                </form>
          </td> 
	     <td>  <input type="hidden" name="id" value="<%= demo.getId() %>">
	          <a href="update.jsp?editId=<%=demo.getId()%>"><button class="but1">Update</button></a>
	     </td>
	  </tr>
	   <%
           }
           %>
	</tbody>
</table><br>
</div>
<div>
<a href="demo.jsp"><button class="but">Add</button></a>
<a href="search.jsp"><button class="but">Search</button></a>
</div>
</body>
</html>