package com.chainsys.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.servlet.dao.DemoImplementation;
import com.chainsys.servlet.model.Demo;
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
    public Servlet1()
    {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		System.out.println("In get...");
		Demo demo=new Demo();
		DemoImplementation demoImpl=new DemoImplementation();
		String name=request.getParameter("name");
		String phoneNumber=request.getParameter("phoneNo");
		String emailId=request.getParameter("emailId");
		long phoneNo1=Long.parseLong(phoneNumber);
		demo.setName(name);
		demo.setEmail(emailId);
		demo.setPhoneNo(phoneNo1);
		try 
		{
			demoImpl.saveDetails(demo);
			System.out.println("row inserted");
		} 
		catch (ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
//		DemoImplementation demoImpl=new DemoImplementation();
//		PrintWriter out=response.getWriter();
//		out.println(demo.getName());
//		out.println(demo.getEmail());
//		out.println(demo.getPhoneNo());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doGet(request, response);
	}

}
