package com.chainsys.servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
    public LogoutServlet() 
    {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		 response.setContentType("text/html");  
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession(false);
		session.invalidate();
		out.println("Logged out successfully...");
		out.println("<a href='login.jsp'><button>Login</button></a>");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doGet(request, response);
	}
}
