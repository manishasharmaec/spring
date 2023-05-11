package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepo;
import com.example.demo.service.StudentService;

@RestController
public class StuController {
    @Autowired
	private StudentService stuService;
    
    @PostMapping("/save")
    public Student saveStu(@RequestBody Student student) {
    	return stuService.save(student);
    }
//    @GetMapping("/getStudent/{id}")
//    public Student getStudent(@PathVariable int id) {
//    	return stuService.getStudent(id);
//    }
    @PostMapping("/saveAll")
    public List<Student> saveAllStudents(@RequestBody List<Student> student){
    	return stuService.saveAllStudents(student);
    }
    @GetMapping("/getAll")
    public List<Student> getAllStudent() {
    	return stuService.getStudent();
    } 
    @PutMapping("/updateStudent/{id}")
    public Student updateStudent(@RequestBody Student student) {
		return stuService.updateStudent(student);
    	
    }
    @DeleteMapping("/deleteAll")
    public String deleteAll() {
		return stuService.deleteAll();
    	
    }
    
}
