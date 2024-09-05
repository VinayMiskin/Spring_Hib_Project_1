package com.vinay.services;

import java.util.List;

import com.vinay.controllers.Student;

public interface IStudentService {
	public String saveStudent(Student sbean);
	public List<Student> getAllStudent();
	public String update(Student sbean,Long id);
	public String delete(Long id);
	public Student getStudent(Long id);
	
}
