package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Student;

public interface StudentService {
	
	public Student save(Student student);

	//public Student getStudent(List<Student> student);

	public List<Student> saveAllStudents(List<Student> student);

	public List<Student> getStudent();

	public Student updateStudent(Student student);

	public String deleteAll();

}
