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
<body>
<table border="1">
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
<a href="delete.jsp"><button>Delete</button></a>
<a href="demo.jsp"><button>Insert</button></a>
<a href="update.jsp"><button>Update</button></a>
</body>
</html>