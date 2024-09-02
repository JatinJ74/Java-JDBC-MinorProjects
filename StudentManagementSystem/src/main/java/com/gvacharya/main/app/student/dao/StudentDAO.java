package com.gvacharya.main.app.student.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.gvacharya.main.app.student.Student;

public class StudentDAO {

private SessionFactory sFactory;
	
	public StudentDAO() {
		sFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	}
	
	public void saveStudent(Student student) {
		try(Session session = sFactory.openSession()){
			Transaction transaction = session.beginTransaction();
			session.save(student);
			transaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deleteStudent(int id) {
		try(Session session = sFactory.openSession()){
			Transaction transaction = session.beginTransaction();
			Student student = session.get(Student.class,id);
			session.delete(student);
			transaction.commit();
		}
	}
	
	public Student getStudent(int id) {
		try(Session session = sFactory.openSession()){
			return session.get(Student.class, id);
		}
	}
	
	public void updateStudent(Student student) {
		try(Session session = sFactory.openSession()){
			Transaction transaction = session.beginTransaction();
			session.update(student);
			transaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	
	
	
}
