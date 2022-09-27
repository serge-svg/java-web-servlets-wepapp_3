package com.svg.java.jee.servlets001.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
		urlPatterns = { "/ServletInitialValue" }, 
		initParams = { 
				@WebInitParam(name = "initialRequestNumber", value = "5", description = "Initial value")
		})
public class ServletInitialValue extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private int numberOfrequests;
    
	@Override
	public void init(ServletConfig config) throws ServletException {
    	numberOfrequests = Integer.parseInt(config.getInitParameter("initialRequestNumber"));		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter printWriter = response.getWriter();
		printWriter.println("Requests: " + numberOfrequests);
		numberOfrequests++;
	}


}
