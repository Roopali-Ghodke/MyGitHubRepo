package com.rups.countRefresh;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RefreshServlet extends HttpServlet{
	
	private int hitsCount;
	public void init(){
		 hitsCount = 0;
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		
		response.setIntHeader("Refresh", 5);
		
		PrintWriter out = response.getWriter();
		
		hitsCount++;
		
		Calendar calendar = new  GregorianCalendar();
		
		int hour = calendar.get(Calendar.HOUR);
		int minute = calendar.get(Calendar.MINUTE);
		int seconds = calendar.get(Calendar.SECOND);
		
		String am_pm;
		
		if(calendar.get(Calendar.AM_PM)==0){
			am_pm = "AM";
		}else{
			am_pm = "PM";
		}
		
		String currentTime = hour + ":" + minute + ":" + seconds + " " + am_pm;
		
		out.println("Current Time - " + currentTime);
		out.println("Hits Count - " + hitsCount);
	}

}
