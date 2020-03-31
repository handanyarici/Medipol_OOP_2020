package com.school.model;

/**
 * Created by TCHYARICI on 03/10/2020
 */
public class Department {
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addInstructor(Instructor instructor){

	}

	public void removeInstructor(Instructor instructor){

	}

	public Instructor getIntructor(Integer id){
		return null;
	}

	public Instructor[] getAllInstructors(){
		return null;
	}
}
