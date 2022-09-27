package com.svg.java.jee.servlets002.sessions;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Servlet002")
public class Servlet002 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession mySession =  request.getSession();
		String course =  (String) mySession.getAttribute("course");
		
		PrintWriter printWriter = response.getWriter();
		printWriter.printf("Course: %s", course);
		printWriter.close();
		
	}


}
