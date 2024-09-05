package com.vinay.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vinay.controllers.Student;
@Repository
public class StudentDAO implements IStudentDAO {
	@Autowired
	SessionFactory factory;
	public String saveStudent(Student sbean) {
		Session s=factory.openSession();
		s.beginTransaction();
		
		s.save(sbean);
		
		s.getTransaction().commit();
		s.close();
		return "Student.Save.Success";
	}

	public List<Student> getAllStudent() {
		Session s=factory.openSession();
		s.beginTransaction();
		
		List<Student> list=s.createQuery("from Student order by name").getResultList();
		
		s.getTransaction().commit();
		s.close();
		return list;
	}

	public String update(Student sbean,Long id) {
		Session s=factory.openSession();
		s.beginTransaction();
		Student student=s.get(Student.class, id);
		student.copyStudent(sbean);
		
		s.getTransaction().commit();
		s.close();
		return "Student.Update.Success";
	}

	public String delete(Long id) {
		Session s=factory.openSession();
		s.beginTransaction();
		
		Student student=s.get(Student.class, id);
		s.delete(student);
		s.getTransaction().commit();
		s.close();
		return "Student.Delete.Success";
	}

	public Student get(Long id) {
		Session s=factory.openSession();
		s.beginTransaction();
		
		Student student=s.get(Student.class, id);
		
		s.getTransaction().commit();
		s.close();
		return student;
	}

}
