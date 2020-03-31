package com.school.model;

/**
 * Created by TCHYARICI on 03/24/2020
 */
public class StudentNotFoundException extends Exception {

	public StudentNotFoundException(String courseId) {
	}

	public String toString(){
		return "Ogrenci bulunamadi hatasi";
	}
}
