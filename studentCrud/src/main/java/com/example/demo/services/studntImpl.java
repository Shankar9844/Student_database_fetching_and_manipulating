package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.student;
import com.example.demo.repository.studentRepository;
@Service
public class studntImpl implements studentServices 
{

	studentRepository srepo;
	
	public studntImpl(studentRepository srepo) {
		super();
		this.srepo = srepo;
	}

	@Override
	public String addStudent(student s)
	{
		srepo.save(s);
		return "student added suessfully";
	}

	@Override
	public student getStudent(String id) 
	{
	    student st	=srepo.findById(id).get();
		return st;
	}

	@Override
	public List<student> getAllStudents() 
	{
	    List<student>  slt= srepo.findAll();
		return slt;
	}

	@Override
	public String updateStudents(student s)
	{
		 srepo.save(s);
		return "updated successfully";
	}

	@Override
	public String deleteStudent(String id)
	{
	srepo.deleteById(id);
		return "deleted successfully";
	}

}
