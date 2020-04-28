package com.school.model;

/**
 * Created by TCHYARICI on 03/10/2020
 */
public class Student {
	String name;
	int id;
	String schoolNumber;
	SuccessStatus successStatus;

	public Student(String name, String schoolNumber, SuccessStatus successStatus) {
		this.name = name;
		this.schoolNumber = schoolNumber;
		this.successStatus = successStatus;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSchoolNumber() {
		return schoolNumber;
	}

	public void setSchoolNumber(String schoolNumber) {
		this.schoolNumber = schoolNumber;
	}

	public SuccessStatus getSuccessStatus() {
		return successStatus;
	}

	public void setSuccessStatus(SuccessStatus successStatus) {
		this.successStatus = successStatus;
	}
}
