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
}
#main
{
	display:flex;
	justify-content:center;
}
 table
 {
 	border-spacing:0;
 }
 th,td,button
 {
 padding:10px;
 }
 button
 {
  width:100px;
  position:relative;
  top:50px;
  left:450px;
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
	  </tr>
	   <%
           }
           %>
	</tbody>
</table><br>
</div>
<div class="but">
<a href="delete.jsp"><button>Delete</button></a>
<a href="demo.jsp"><button>Add</button></a>
<a href="update.jsp"><button>Update</button></a>
</div>
</body>
</html>