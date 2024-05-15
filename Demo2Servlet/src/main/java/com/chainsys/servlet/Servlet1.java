package com.chainsys.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("In get");
		String name=request.getParameter("name");
		String dateOfBirth=request.getParameter("date");
		String phoneNumber=request.getParameter("phoneNo");
		String emailId=request.getParameter("emailId");
		String password=request.getParameter("password");
		int phoneNo1=Integer.parseInt(phoneNumber);
		PrintWriter out=response.getWriter();
		out.println(name);
		out.println(dateOfBirth);
		out.println(phoneNo1);
		out.println(emailId);
		out.println(password);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		System.out.println("In post");
		String name=request.getParameter("name");
		String dateOfBirth=request.getParameter("date");
		String phoneNumber=request.getParameter("phoneNo");
		int phoneNo1=Integer.parseInt(phoneNumber);
		String emailId=request.getParameter("emailId");
		String password=request.getParameter("password");
		PrintWriter out=response.getWriter();
		out.println(name);
		out.println(dateOfBirth);
		out.println(phoneNo1);
		out.println(emailId);
		out.println(password);
	}

}
