package com.newlecture.web;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class Add extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request,HttpServletResponse response)
	throws IOException,ServletException{
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		String x_ = request.getParameter("x");
		String y_ = request.getParameter("y");
		int x=0;
		int y=0;
		if(!x_.equals(""))
			x=Integer.parseInt(x_);
		if(!y_.equals("") )
			y=Integer.parseInt(y_);

		int result = x+y;
		
		response.getWriter().printf("result is %d\n", result);
			
	}
	


}
