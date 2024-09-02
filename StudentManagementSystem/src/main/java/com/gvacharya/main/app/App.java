package com.gvacharya.main.app;

import com.gvacharya.main.app.course.Course;
import com.gvacharya.main.app.student.Student;
import com.gvacharya.main.app.student.dao.StudentDAO;

public class App {
    public static void main( String[] args ){
       
    	
    	StudentDAO studentService = new StudentDAO();
    	
    	Course course1 = new Course();
    	course1.setId(1);
    	course1.setName("Java");
    	course1.setCredits(3);
    	
    	Course course2 = new Course();
    	course2.setId(2);
    	course2.setName("Python");
    	course2.setCredits(2);
    	

    	Student student1 = new Student();
    	
    	student1.setId(1);
    	student1.setName("Rohit");
    	student1.setAge(24);
    	student1.getCourse().add(course1);
    	student1.getCourse().add(course2);
    	studentService.saveStudent(student1);
    }
}
