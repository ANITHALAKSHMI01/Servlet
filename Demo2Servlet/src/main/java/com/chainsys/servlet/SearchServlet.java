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
@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static List list;
	public static Demo demo=new Demo();
	public static DemoImplementation demoImpl=new DemoImplementation();
    public SearchServlet()
    {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		String name=request.getParameter("name");
		demo.setName(name);
		try 
		{
			list=demoImpl.search(demo);
			System.out.println("Search Done..");
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
