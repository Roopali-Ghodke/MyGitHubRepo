package com.rups.error;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ErrorHandler extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		
		Throwable throwable = (Throwable) request.getAttribute("javax.servlet.error.exception");
		Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
		String servletName = (String) request.getAttribute("javax.servlet.error.servlet_name");
		if(servletName == null){
			servletName = "Servlet name NOT KNOWN";
		}
		String requestURI = (String) request.getAttribute("javax.servlet.error.request_uri");
		if(requestURI == null){
			requestURI = "Request URI NOT KNOWN";
		}
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.println("<html><body><title>");
		out.println("Error/Exception Information </title>");
		out.println("<h2>");
		if(throwable == null && statusCode == null){
			out.println("Error information is missing</h2>");
			out.println("Please return to the <a href=\"" + 
					response.encodeURL("http://localhost:8085/") +
					"\">Home Page </a>.");
		}else if(statusCode != null){
			out.println("The status code   is - " + statusCode);
		}else{
			out.println("<h2>Error Information</h2>");		
			out.println("Servlet Name - " + servletName);
			out.println("Exception Type - " + throwable.getClass().getName());
			out.println("The request URI - " + requestURI);
			out.println("Exception Message - " + throwable.getMessage());
		}
		
		out.println("<body></html>");
		
		
		
	}
}
