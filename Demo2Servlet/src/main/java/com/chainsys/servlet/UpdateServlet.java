package com.chainsys.servlet;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.servlet.dao.DemoImplementation;
import com.chainsys.servlet.model.Demo;
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet
{
	public static Demo demo=new Demo();
	public static List list;
	public static Servlet1 servlet=new Servlet1();
	public static DemoImplementation demoImpl=new DemoImplementation();
	private static final long serialVersionUID = 1L;
    public UpdateServlet() 
    {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String phoneNo=request.getParameter("phoneNo");
		String  email=request.getParameter("emailId");
		int id=Integer.parseInt(request.getParameter("id"));
		long phoneNumber=Long.parseLong(phoneNo);
		demo.setId(id);
		demo.setName(name);
		demo.setPassword(password);
		demo.setEmail(email);
		demo.setPhoneNo(phoneNumber);
		try 
		{
			demoImpl.updateDetails(demo);
			System.out.println("Updated Successfully");
		} 
		catch (ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
		try 
		{
			list=demoImpl.retriveDetails();
		}
		catch (ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
		request.setAttribute("list", list);
		RequestDispatcher requestDispatcher=request.getRequestDispatcher("demotable.jsp");
		requestDispatcher.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doGet(request, response);
	}
}
