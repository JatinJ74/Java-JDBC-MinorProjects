package com.gvacharya.main.app.student;

import java.util.List;

import javax.persistence.*;

import com.gvacharya.main.app.course.Course;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	private int age;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "student")
	private List<Course> course;

	public Student(int id, String name, int age, List<Course> course) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.course = course;
	}

	public Student() {
		
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", course=" + course + "]";
	}
	
	

	
	
	
	
}
