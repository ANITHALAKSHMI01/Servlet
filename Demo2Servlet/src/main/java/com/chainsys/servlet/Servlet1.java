package com.chainsys.servlet;
import java.io.IOException;
//import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import javax.servlet.RequestDispatcher;
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
	public static List list;
	public static Demo demo=new Demo();
	public static DemoImplementation demoImpl=new DemoImplementation();
	private static final long serialVersionUID = 1L;
    public Servlet1()
    {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		System.out.println("In get...");
		String name=request.getParameter("name");
		String phoneNumber=request.getParameter("phoneNo");
		String emailId=request.getParameter("emailId");
		String password=request.getParameter("password");
		long phoneNo1=Long.parseLong(phoneNumber);
		demo.setName(name);
		demo.setEmail(emailId);
		demo.setPhoneNo(phoneNo1);
		demo.setPassword(password);
		try 
		{
			demoImpl.saveDetails(demo);
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
		System.out.println("row inserted");
		
	}
	protected void displayDetails(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		try 
		{
			list=demoImpl.retriveDetails();
//			System.out.println(list);
			System.out.println("Displayed successfully..");
		} 
		catch (ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
		request.setAttribute("list", list);
		 RequestDispatcher requestDispatcher=request.getRequestDispatcher("demotable.jsp");
		 requestDispatcher.forward(request, response);
	}
//	protected void deleteDetails(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
//	{
//		String id=request.getParameter("id");
//		int id1=Integer.parseInt(id);
//		demo.setId(id1);
//		try 
//		{
//			demoImpl.deleteDetails(demo);
//		} 
//		catch (ClassNotFoundException | SQLException e)
//		{
//			e.printStackTrace();
//		}
//	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
//		Scanner scanner=new Scanner(System.in);
		doGet(request, response);
		displayDetails(request,response);
	}

}
