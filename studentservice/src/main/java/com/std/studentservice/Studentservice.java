package com.std.studentservice;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class Studentservice {
	@Autowired
	private StudentRepository repo;
	//insert value
	public void save(Student std)
	{
		repo.save(std);
	}
	//show all records
	public List<Student> getALlStudent(){
		return repo.findAll();
		
	}
	// show particular record
	public Student getStudentById(Integer id) {
		return repo.findById(id).orElse(null);
	}
	
	

}
