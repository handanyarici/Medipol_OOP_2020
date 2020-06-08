package com.example.student.student.conroller;

import com.example.student.student.model.Course;
import com.example.student.student.model.Department;
import com.example.student.student.model.Instructor;
import com.example.student.student.model.School;
import com.example.student.student.model.Student;
import com.example.student.student.model.SuccessStatus;
import com.example.student.student.util.FileUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;

/**
 * Created by TCHYARICI on 05/12/2020
 */
@RestController
@RequestMapping(path = "/report")
public class ReportController {

	@GetMapping(path = "/display")
	public String createReport(String devamsizlik) {
		return "Htmlden alinan devamsizlik sayisi" + devamsizlik;
	}

	@PostMapping(path = "/post")
	public String createReportPost(Integer devamsizlik) {
		Student[] students = initProcess();
		//devamsizliktan kalan ogrencileri konsol ekranina yazdir
		StringBuilder report = new StringBuilder();
		report.append("<html><head></head><body><ol>");
		report.append("Devamsizliktan kalan ogrenciler asagidaki gibidir. Devamsizlik siniri "+devamsizlik+" olarak belirlenmistir");
		for(Student student:students){
			if(student.getSuccessStatus().getAbsence()>devamsizlik){
				report.append("<li>");
				report.append(student.toString());
				report.append("</li>");
			}
		}
		report.append("</body></html></ol>");
		return report.toString();
	}

	@PostMapping(path = "/admin")
	public String createAdminReport() {
		//TODO:Bu metodun imzası değiştirilmeden içi doldurulacak. Bu metodun içinde initProcess Metodunu kullanmanızı bekliyorum.
		return "";
	}

	private Student[] initProcess(){
		File inputFile = new File("D:\\medipol\\java oop\\w11\\student\\src\\main\\java\\com\\example\\student\\student\\ogrenciler.csv");
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
		return students;
	}
	private Student[] createStudent(String[] studentStrings) {
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
