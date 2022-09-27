package com.svg.java.jee.servlets003.sessionbyuser;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ServletCourse")
public class ServletCourse extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		HttpSession session = request.getSession();
		Person person = (Person) session.getAttribute("person");
		
		if(request.getParameter("course")!=null) {
			person.addCourse(request.getParameter("course"));
		}
		PrintWriter printWriter = response.getWriter();
		printWriter.print("<html>");
		printWriter.print("<body>");
		if (person != null) {			
			for(String course : person.getCourses()) {
				printWriter.println("<p>Course: " + course + "</p>");			
			}
		}else{
			printWriter.println("Empty session");
		}
		printWriter.print("<a href='CourseForm.html'>Return</a>");
		printWriter.print("</body>");
		printWriter.print("</html>");

	}

}
