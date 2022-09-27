package com.svg.java.jee.servlets003.sessionbyuser;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ServletPerson")
public class ServletPerson extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		String personName = request.getParameter("name");
		Person person = new Person(personName);
		session.setAttribute("person", person);
	
		PrintWriter printWriter = response.getWriter();
		printWriter.println("<html>");
		printWriter.println("<body>");
		printWriter.println("Registered person: " + personName);
		printWriter.println("<a href='CourseForm.html'>CourseForm</a>");
		printWriter.println("</body>");
		printWriter.print("</html>");

	}

}
