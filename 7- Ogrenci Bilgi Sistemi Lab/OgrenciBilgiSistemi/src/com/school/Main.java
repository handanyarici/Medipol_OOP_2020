package com.school;

import com.school.model.Course;
import com.school.model.Department;
import com.school.model.Instructor;
import com.school.model.School;
import com.school.model.Student;
import com.school.model.SuccessStatus;
import com.school.util.FileUtil;

import java.io.File;
import java.io.IOException;

/**
 * Created by TCHYARICI on 03/24/2020
 */
public class Main {
	public static final int limit = 12;
	public static void main(String args[]) {
		File inputFile = new File("src\\com\\school\\ogrenciler.csv");
		String content = FileUtil.readFile(inputFile, true);
		School school = new School();
		Department department = new Department();
		department.setId(1);
		department.setName("Bilgisayar Programciligi");
		school.addDepartment(department);

		String[] studentStrings = content.split(System.lineSeparator());
		Course course = new Course();
		course.setCourseName("Nesne Yonelimli Programlama");
		Student[] students = createStudent(studentStrings);
		course.setStudents(students);
		//devamsizliktan kalan ogrencileri konsol ekranina yazdir
		StringBuilder report = new StringBuilder();
		report.append("Devamsizliktan kalan ogrenciler asagidaki gibidir. Devamsizlik siniri 12 olarak belirlenmistir");
		for(Student student:students){
			if(student.getSuccessStatus().getAbsence()>limit){
				report.append(System.lineSeparator());
				report.append(student.toString());
			}
		}
		String filename="rapor" + System.currentTimeMillis() + ".txt";
		File outputFile = new File("src\\com\\school\\"+ filename);
		try {
			FileUtil.writeFile(outputFile, report.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static Student[] createStudent(String[] studentStrings) {
		Student[] students = new Student[studentStrings.length];
		Instructor instructor = new Instructor();
		instructor.setMebisUsername("handan");
		for (int i = 0; i < studentStrings.length; i++) {
			String[] studentline = studentStrings[i].split(",");
			SuccessStatus successStatus = new SuccessStatus(Integer.parseInt(studentline[8]));
			Student student = new Student(studentline[3],studentline[2],successStatus);
			student.setId(Integer.parseInt(studentline[0]));
			student.setSuccessStatus(successStatus);
			students[i] = student;
			student.setMebisUsername(student.getName());
		}
		return students;
	}
}
