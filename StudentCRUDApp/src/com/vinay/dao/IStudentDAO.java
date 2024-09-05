package com.vinay.dao;

import java.util.List;

import com.vinay.controllers.Student;

public interface IStudentDAO {
	public String saveStudent(Student sbean);
	public List<Student> getAllStudent();
	public String update(Student sbean,Long id);
	public String delete(Long id);
	public Student get(Long id);
}
