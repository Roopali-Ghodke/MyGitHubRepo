package com.rups.pageRedirect;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PageRedirectServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response){
		String newUrl = "http://www.itsallbinary.com";
		
		response.setStatus(response.SC_MOVED_TEMPORARILY);
		response.setHeader("Location", newUrl);
	}

}
