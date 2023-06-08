package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class student 
{
	@Id
     String id;
     String name;
     String company;
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public student(String id, String name, String company) {
		super();
		this.id = id;
		this.name = name;
		this.company = company;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", company=" + company + "]";
	}

     
}
