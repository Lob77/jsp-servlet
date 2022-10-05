package com.newlecture.web.filter;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;

@WebFilter("/*")
public class CharacterEncodingFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request
			, ServletResponse response, 
			FilterChain chain)
			throws IOException, ServletException {
			
		// System.out.println("before Filter");
		request.setCharacterEncoding("UTF-8");//모든 서블릿이 실행되기 전에 실행한다.
		chain.doFilter(request, response);
		// System.out.println("after Filter");
	}

}
