package com.svg.java.jee.servlets001.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletNameForm")
public class ServletNameForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter printWriter = response.getWriter();
		printWriter.println("<html>");
		printWriter.println("<body>");
		printWriter.println("<form method='post' action='ServletShowData'>");
		printWriter.println("<input type='hidden' name='name' value='" +request.getParameter("name") + "'>");
		printWriter.println("Age: <input type='text' name='age'/>");
		printWriter.println("<input type='submit' value='accept' />");
		printWriter.println("</form>");
		printWriter.println("</body>");
		printWriter.println("</html>");
	}

}
