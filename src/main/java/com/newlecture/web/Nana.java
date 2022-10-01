package com.newlecture.web;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/hi")
public class Nana extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request,HttpServletResponse response)
			throws IOException,ServletException{
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		for(int i=0; i<100; i++) {
			out.println((i+1)+": 안녕 Servlet!!");
		}
	}
	
	
}
