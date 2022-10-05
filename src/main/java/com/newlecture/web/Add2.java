package com.newlecture.web;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/add2")
public class Add2 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request,HttpServletResponse response)
	throws IOException,ServletException{
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		String[] num_ = request.getParameterValues("num");
		
		int result = 0;
		for(int i=0; i<num_.length; i++) {
			int num = Integer.parseInt(num_[i]);
			result+=num;
		}
		
		response.getWriter().printf("result is %d\n", result);
			
	}
	


}
