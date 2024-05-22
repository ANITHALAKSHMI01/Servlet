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
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		String id=request.getParameter("id");
		String password=request.getParameter("password");
		int id1=Integer.parseInt(id);
		demo.setId(id1);
		demo.setPassword(password);
		try 
		{
			demoImpl.updateDetails(demo);
			System.out.println("Updated Successfully");
		} 
		catch (ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
		servlet.displayDetails(request, response);
	}
//	protected void displayDetails(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
//	{
//		try 
//		{
//			list=demoImpl.retriveDetails();
//			System.out.println(list);
//			System.out.println("Displayed successfully..");
//		} 
//		catch (ClassNotFoundException | SQLException e)
//		{
//			e.printStackTrace();
//		}
//		request.setAttribute("list", list);
//		 RequestDispatcher requestDispatcher=request.getRequestDispatcher("demotable.jsp");
//		 requestDispatcher.forward(request, response);
//	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doGet(request, response);
//		displayDetails(request, response);
	}
}
