package com.vinay.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinay.controllers.Student;
import com.vinay.dao.IStudentDAO;
@Service
public class StudentService implements IStudentService {
	@Autowired
	IStudentDAO dao;
	public String saveStudent(Student sbean) {
		
		return dao.saveStudent(sbean);
	}

	public List<Student> getAllStudent() {
		
		return dao.getAllStudent();
	}

	public String update(Student sbean,Long id) {
		
		return dao.update(sbean, id);
	}

	public String delete(Long id) {
		
		return dao.delete(id);
	}

	public Student getStudent(Long id) {
		
		return dao.get(id);
	}

	

}
