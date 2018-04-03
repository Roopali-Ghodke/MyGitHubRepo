package com.rups.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
	
		PrintWriter out = response.getWriter();
		
		out.println("<html> <body>");
		out.println("<p> Reading all Login Page Parameters </p>");
		
		
		/*String username = request.getParameter("uname");
		String password = request.getParameter("pwd");
		
		out.println("<html>"
				+ "<body>"
				+ "<p> Username - " + username 
				+ "Password - " + password
				+ "</p>"
				+ "</body>"
				+ "</html>");*/
		
		//out.println(request.getLocale());
		
		out.println("<table>");
		out.println("<tr><th>Param Name</th>"
				+ "<th>Param Values</th>\n");
		
		Enumeration paramNames = request.getParameterNames();
		while(paramNames.hasMoreElements()){
			String paramName = (String) paramNames.nextElement();
			out.print("<tr><td>" + paramName +"</td><td>");
			String[] paramValues = request.getParameterValues(paramName);
			
			if(paramValues.length == 1){
				String paramValue =  paramValues[0];
				if(paramValues.length == 0){
					out.println("No values</td>");
				}else{
					out.println(paramValue);
				}
			}else{
				out.println("<ul>");
				for(int i=0; i < paramValues.length; i++){
					out.println("<li> " + paramValues[i] + "</li>");
				}
				out.println("</ul>");
			}
		}	
		out.println("</table>");
		out.println("</body></html>");
	}	
}


