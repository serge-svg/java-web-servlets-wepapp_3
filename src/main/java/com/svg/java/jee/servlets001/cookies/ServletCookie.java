package com.svg.java.jee.servlets001.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletCookie")
public class ServletCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie cookie = new Cookie("name", "name1");
		// This cookie just lasts 60 seconds
		cookie.setMaxAge(60);
		response.addCookie(cookie);
		
		PrintWriter printWriter = response.getWriter();
		printWriter.println("Cookie created");
		printWriter.close();
	}


}
