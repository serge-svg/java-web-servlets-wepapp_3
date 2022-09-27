package com.svg.java.jee.servlets001.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletCookieReceiver")
public class ServletCookieReceiver extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter printWriter = response.getWriter();
		
		Cookie[] cookies = request.getCookies();
		for (Cookie cookie : cookies) {
			printWriter.printf("Cookie %s = %s %n", cookie.getName(), cookie.getValue());
			printWriter.printf("Cookie lasts: %s %n", cookie.getMaxAge());
		}
	}


}
