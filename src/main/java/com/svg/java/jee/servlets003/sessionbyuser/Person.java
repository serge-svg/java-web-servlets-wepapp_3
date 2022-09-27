package com.svg.java.jee.servlets003.sessionbyuser;

import java.util.ArrayList;
import java.util.List;

public class Person {

	private String name;
	private List<String> courses = new ArrayList<>();
	
	public List<String> getCourses() {
		return courses;
	}

	public void addCourse(String course) {
		courses.add(course);
	}

	public void deleteCourse(String course) {
		courses.remove(course);
	}
	
	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
