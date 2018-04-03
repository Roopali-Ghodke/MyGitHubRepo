package com.rups.file;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class FileUploadServlet extends HttpServlet{
	
	private String filePath;
	private boolean isMultipart;
	private int maxMemSize = 4 * 1024;
	private int maxFileSize = 50 * 1024;
	private File file;

	public void init(){
		filePath = getServletContext().getInitParameter("file-upload");
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, 	ServletException {
		
		isMultipart = ServletFileUpload.isMultipartContent(request);	
		//response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		if(!isMultipart){
			out.println("<html>"
					+ "<body>"
					+ "<h2>"
					+ "No File Uploaded"
					+ "</h2>"
					+ "</body>"
					+ "</html>");
		}
		
		
		DiskFileItemFactory factory = new DiskFileItemFactory();
		factory.setSizeThreshold(maxMemSize);
		factory.setRepository(new File("C:\\"));
		
		ServletFileUpload upload = new ServletFileUpload(factory);
		upload.setSizeMax(maxFileSize);
		
		try {
			List fileItems = upload.parseRequest(request);
			
			Iterator i = fileItems.iterator();
			
			out.println("<html>");
	        out.println("<head>");
	        out.println("<title>Servlet upload</title>");  
	        out.println("</head>");
	        out.println("<body>");
	        
	        while(i.hasNext()){
	        	FileItem fi = (FileItem) i.next();
	        	
	        	if(!fi.isFormField()){
	        		String fieldName = fi.getFieldName();
	        		String fileName = fi.getName();
	        		String contentType = fi.getContentType();
	        		boolean isInMemory = fi.isInMemory();
	        		long sizeInBytes = fi.getSize();
	        		
	        		if(fileName.lastIndexOf("\\") >= 0){
	        			file = new File(filePath + fileName.substring(fileName.lastIndexOf("\\"))); 
	        		}else{
	        			file = new File(filePath + fileName.substring(fileName.lastIndexOf("\\")+1));
	        		}
	        		fi.write(file);
	        		out.println("Uploaded file - " + fileName + "<br>");
	        		out.println("<ul>");
	        		out.println("<li>" + fieldName + "</li>");
	        		out.println("<li>" + fileName + "</li>");
	        		out.println("<li>" + contentType + "</li>");
	        		out.println("<li>" + isInMemory + "</li>");
	        		out.println("<li>" + sizeInBytes + "</li>");
	        	}
	        }
	        out.println("</body>");
	         out.println("</html>");
		} catch (FileUploadException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	 public void doGet(HttpServletRequest request, HttpServletResponse response)
	         throws ServletException, java.io.IOException {

	         throw new ServletException("GET method used with " +
	            getClass( ).getName( )+": POST method required.");
	      }
}
