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
@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet 
{
	public static Demo demo=new Demo();
	public static List list;
	static Servlet1 servlet=new Servlet1();
	public static DemoImplementation demoImpl=new DemoImplementation();
	private static final long serialVersionUID = 1L;
    public DeleteServlet()
    {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		String id=request.getParameter("id");
		int id1=Integer.parseInt(id);
		demo.setId(id1);
		try 
		{
			demoImpl.deleteDetails(demo);
			System.out.println("Deleted Successfully");
		} 
		catch (ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
		servlet.displayDetails(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}

}
