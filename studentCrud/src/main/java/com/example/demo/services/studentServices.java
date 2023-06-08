package com.example.demo.services;

import java.util.List;

import com.example.demo.entity.student;

public interface studentServices 
{
    String addStudent(student s);
    student getStudent(String id);
    List<student > getAllStudents();
    String updateStudents(student s);
    String deleteStudent(String id);
}
