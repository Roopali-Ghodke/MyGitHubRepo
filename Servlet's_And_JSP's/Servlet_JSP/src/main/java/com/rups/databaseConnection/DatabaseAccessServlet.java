package com.rups.databaseConnection;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DatabaseAccessServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		//final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
		
		final String DB_URL = "jdbc:oracle:thin:system@//localhost:1521/xe";
		
		final String USERNAME = "system";
		final String PASSWORD = "oracle";
		
		Statement stmt = null;
		Connection conn = null;
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
			
			stmt = conn.createStatement();
			String query;
			//query = "SELECT * FROM EMPLOYEE";
			query = "SELECT * FROM EMP";
			ResultSet rs = stmt.executeQuery(query);
			
			out.println("<html><body>");
			out.println("<table><tr>");
			out.println("<th> Column Name </th>");
			out.println("<th> Column Value </th>");
			out.println("</tr>");
			
			while(rs.next()){
				/*int id = rs.getInt("ID");
				int age = rs.getInt("AGE");
				String firstName = rs.getString("FIRSTNAME");
				
				out.println("<tr>");
				out.println("<td>" + id + "</td>");
				out.println("<td>" + age + "</td>");
				out.println("<td>" + firstName + "</td>");
				out.println("</tr>");*/
				int age = rs.getInt("AGE");
				String name = rs.getString("NAME");
				
				out.println("<tr>");
				out.println("<td>" + age + "</td>");
				out.println("<td>" + name + "</td>");
				out.println("</tr>");
				
			}
			out.println("</table></body></html>");
			rs.close();
			stmt.close();
			conn.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(stmt != null){
					stmt.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if(conn != null){
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
