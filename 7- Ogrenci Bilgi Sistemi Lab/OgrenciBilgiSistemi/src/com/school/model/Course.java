package com.school.model;

/**
 * Created by TCHYARICI on 03/24/2020
 */
public class Course extends Object{
	private int courseId;
	private String courseName;
	private Student[] students;

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}
}
