package com.rups;

import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response){
	
		PrintWriter out = response.getWriter();
		
		out.println("<html> <body>");
		out.println("<p> My First Servlet </p>");
		out.println("</body></html>");
		
		String username = request.getParameter("uname");
		String password = request.getParameter("pwd");
		
		out.println("<html>"
				+ "<body>"
				+ "<p> Username - " + username
				+ "Password - " + password
				+ "</p>"
				+ "</body>"
				+ "</html>");
		}	
	}

}
