package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.student;
import com.example.demo.services.studentServices;
@RestController
@RequestMapping("/crudss")
public class studentController 
{
    studentServices ss;

	public studentController(studentServices ss) 
	{
		super();
		this.ss = ss;
	}
	@PostMapping
    public String addStudent( @RequestBody student s)
    {
    	return ss.addStudent(s);
    }
	@GetMapping(value="{id}")
	public student getStudnet(@PathVariable("id")  String id)
	{
		 return ss.getStudent(id);
	}
	@GetMapping
	public List<student> getAll()
	{
		return ss.getAllStudents();
	}
	@PutMapping
	public String updateStudent(@RequestBody  student s)
	{
		return ss.updateStudents(s);
	}
	@DeleteMapping(value="{id}")
	public String deleteStudent(@PathVariable("id") String id)
	{
		return ss.deleteStudent(id);
	}
}
