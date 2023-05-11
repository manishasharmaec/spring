package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepo;
import com.example.demo.service.StudentService;
@Service
public class StuServiceImpl implements StudentService{
    
	@Autowired
	private StudentRepo stuRepo;
	
	@Override
	public Student save(Student student) {
		return stuRepo.save(student);
	}

	//@Override
//	public Student getStudent(int id) {
//		
//		return stuRepo.findById(id).get();
//	}

	@Override
	public List<Student> saveAllStudents(List<Student> student) {
		return stuRepo.saveAll(student);
	}

	@Override
	public List<Student> getStudent() {
		return stuRepo.findAll();
	}

	@Override
	public Student updateStudent(Student student) {
		Student s=stuRepo.findById(student.getStuId()).orElse(null);
		s.setStuName(student.getStuName());
		return stuRepo.save(s);
	}
	@Override
	public String deleteAll() {
		stuRepo.deleteAll();
		return "successfully delete";
		
	}
	
}
