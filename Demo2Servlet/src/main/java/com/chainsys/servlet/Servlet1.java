package com.chainsys.servlet;
import java.io.IOException;
import java.io.PrintWriter;
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
import javax.servlet.http.HttpSession;

import com.chainsys.servlet.dao.DemoImplementation;
import com.chainsys.servlet.model.Demo;
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet 
{
	public static List list;
	public static Demo demo=new Demo();
	public static DemoImplementation demoImpl=new DemoImplementation();
	static DeleteServlet servlet=new DeleteServlet();
	private static final long serialVersionUID = 1L;
    public Servlet1()
    {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		System.out.println("In get...");
//		String name=request.getParameter("name");
//		String dateOfbirth=request.getParameter("dateOfBirth");
//		String phoneNumber=request.getParameter("phoneNo");
//		String emailId=request.getParameter("emailId");
//		String password=request.getParameter("password");
//		long phoneNo1=Long.parseLong(phoneNumber);
//		demo.setName(name);
//		demo.setDateOfBirth(dateOfbirth);
//		demo.setEmail(emailId);
//		demo.setPhoneNo(phoneNo1);
//		demo.setPassword(password);
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();
		if(session!=null)
		{
			String name=request.getParameter("name");
			String dateOfbirth=request.getParameter("dateOfBirth");
			String phoneNumber=request.getParameter("phoneNo");
			String emailId=request.getParameter("emailId");
			String password=request.getParameter("password");
			long phoneNo1=Long.parseLong(phoneNumber);
			demo.setName(name);
			demo.setDateOfBirth(dateOfbirth);
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
			System.out.println("Row inserted");
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
		else
		{
			response.sendRedirect("login.jsp");
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String delete = request.getParameter("delete");
        if(delete != null && delete.equals("Delete"))
        {
        	int id=Integer.parseInt(request.getParameter("deleteId"));
        	demo.setId(id);
        	try 
        	{
				demoImpl.deleteDetails(demo);
				System.out.println("Row deleted");
			} 
        	catch (ClassNotFoundException | SQLException e) 
        	{
				e.printStackTrace();
			}
        	try 
    		{
    			list=demoImpl.retriveDetails();
    			System.out.println("Displayed successfully..");
    		} 
    		catch (ClassNotFoundException | SQLException e)
    		{
    			e.printStackTrace();
    		}
        	request.setAttribute("list", list);
        	request.getRequestDispatcher("demotable.jsp").forward(request, response);
        }
	}

}
