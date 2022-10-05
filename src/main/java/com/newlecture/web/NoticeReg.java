package com.newlecture.web;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/notice-reg")
public class NoticeReg extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request,HttpServletResponse response)
			throws IOException,ServletException{
		
		response.setCharacterEncoding("UTF-8");//이렇게 보낼테니
		response.setContentType("text/html; charset=UTF-8");//브라우저는 이렇게 해석해라
		//request.setCharacterEncoding("UTF-8");//브라우저에서  UTF-8로 보내는 경우 웹 서버가 요청을 받을 형식을 지정한다.
		
		PrintWriter out = response.getWriter();
		
		String title= request.getParameter("title");
		String content= request.getParameter("content");
		
		out.println(title);
		out.println(content);

	}
	
	
}
