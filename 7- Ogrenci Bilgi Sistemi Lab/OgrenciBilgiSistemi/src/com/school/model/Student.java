package com.school.model;

import java.util.Objects;

/**
 * Created by TCHYARICI on 03/10/2020
 */
public class Student extends Member{
	private String name;
	private int id;
	private String schoolNumber;
	private SuccessStatus successStatus;

	public Student(String name, String schoolNumber, SuccessStatus successStatus) {
		this.name = name;
		this.schoolNumber = schoolNumber;
		this.successStatus = successStatus;
	}

	public Student(String schoolNumber) {
		this.schoolNumber = schoolNumber;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Student student = (Student) o;
		return schoolNumber.equals(student.schoolNumber);
	}

	@Override
	public int hashCode() {
		return Objects.hash(schoolNumber);
	}

	@Override
	public String toString() {
		return "Ogrenci{" +
				"Isim ='" + name + '\'' +
				", Ogrenci Numarasi ='" + schoolNumber + '\'' +
				'}';
	}
}
