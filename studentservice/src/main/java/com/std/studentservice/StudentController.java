package com.std.studentservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@Autowired
	private Studentservice service;
	@PostMapping("/studentservice")
	public void add(@RequestBody Student std)
	{
		service.save(std);
	}
	
	@GetMapping("/studentservice")
	public List<Student> getAllStudent()
	{
		return service.getALlStudent();
	
	}
	@GetMapping("/studentservice/(id)")
	public Student getStudentById(@PathVariable Integer id)
	{
		return service.getStudentById(id);
	}
	
	
	

}
