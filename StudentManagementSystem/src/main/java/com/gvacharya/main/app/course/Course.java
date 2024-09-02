package com.gvacharya.main.app.course;

import javax.persistence.*;

import com.gvacharya.main.app.student.Student;

@Entity
public class Course {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	private int credits;

	@OneToMany(cascade = CascadeType.ALL)
	private Student student;

	public Course(int id, String name, int credits) {
		this.id = id;
		this.name = name;
		this.credits = credits;
	
	}

	public Course() {
	
	}

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

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}


	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", credits=" + credits + "]";
	}
	
	
	
	
}
