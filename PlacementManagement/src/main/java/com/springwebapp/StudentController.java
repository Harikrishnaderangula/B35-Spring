package com.springwebapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.NoSuchElementException;
@RestController
public class StudentController {


	@Autowired
	private StudentService service;

	//creation
	@PostMapping("/student")
	public void add(@RequestBody Student s)
	{
		 service.create(s);
	}
	//deletion
	@DeleteMapping("/student/{id}")
	public void delete(@PathVariable Integer id)
	{
		service.delete(id);
	}
	//Retrieve with all the records
	@GetMapping("/Student")
	public List<Student>List()
	{
		return service.listAll();
	}
	//Retrieve with specified id
	@GetMapping("/student/{id}")
	public ResponseEntity<Student> get(@PathVariable Integer id)
	{
		try {
		Student s=service.retrieve(id);
		return new ResponseEntity<Student>(s,HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
		}
	}
	// updation
	@PutMapping("/student/{id}")
	public ResponseEntity<Student> update(@RequestBody Student s,@PathVariable Integer id)
	{
		try {
		Student s1=service.retrieve(id);
		service.create(s);
		return new ResponseEntity<Student>(s,HttpStatus.OK);
		
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
		}
	}
	
	
	
	
	
	
	
	
}
