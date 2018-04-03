package com.rups.file;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class FileUploadServlet1 extends HttpServlet{

	private String filePath;
	private boolean isMultiPart;
	private int maxMemSize = 4 * 1024;
	private int maxFileSize = 50 * 1024;
	private File file;
	
	public void init(){
		filePath = getServletContext().getInitParameter("file-upload");
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
		isMultiPart = ServletFileUpload.isMultipartContent(request);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		//response.setIntHeader("Refresh", 5);
		
		if(!isMultiPart){
			out.println("<html><body><h2> No File Uploaded </h2></body></html>");
		}
		
		DiskFileItemFactory factory = new DiskFileItemFactory();
		
		factory.setSizeThreshold(maxFileSize);
		factory.setRepository(new File("C:\\temp"));
		
		ServletFileUpload upload = new ServletFileUpload(factory);
		
		upload.setSizeMax(maxFileSize);
		
		try {
			List fileItems = upload.parseRequest(request);
			Iterator itr = fileItems.iterator();
			
			out.println("<html><body><h2> Servlet upload </h2>");
			while(itr.hasNext()){
				FileItem fi = (FileItem) itr.next();
				if(!fi.isFormField()){
					if(fi.getName().lastIndexOf("\\") >= 0){
						file = new File(filePath + fi.getName().substring(fi.getName().lastIndexOf("\\")));
					}else{
						file = new File(filePath + fi.getName().substring(fi.getName().lastIndexOf("\\") + 1));
					}
					fi.write(file);
					out.println("File Uploaded successfully");
				}
			}
			out.print("</body></html>");
		} catch (FileUploadException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
