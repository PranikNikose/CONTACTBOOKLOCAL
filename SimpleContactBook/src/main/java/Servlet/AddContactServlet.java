package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.AddContactDao;
import project.Contact;

@WebServlet("/AddContact")
public class AddContactServlet extends HttpServlet 
{
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	{
		String Name = request.getParameter("Name");
		String Email = request.getParameter("Email").toLowerCase();
		String Mobile = request.getParameter("Mobile");
		String Occupation =request.getParameter("Occupation");
		String Place = request.getParameter("Place");
		
		Contact c1 = new Contact(Name,Email,Mobile,Occupation,Place);
		
		AddContactDao dao = new AddContactDao();
		
		Boolean flagresult = dao.AddContact(c1);
		
		//response.getWriter().print("Data Upload Status: " + flagresult);

		response.sendRedirect("Home.jsp");
	}

}
