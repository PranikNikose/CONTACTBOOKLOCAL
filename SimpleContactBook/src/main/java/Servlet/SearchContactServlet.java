package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.SearchContactDao;
import project.Contact;

@WebServlet("/SearchContact")
public class SearchContactServlet extends HttpServlet
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String searchName = request.getParameter("searchName");
		
		SearchContactDao dao = new SearchContactDao();
		
		Contact c1 = dao.getContact(searchName);
		
		response.getWriter().print(c1);
		
	}

}
