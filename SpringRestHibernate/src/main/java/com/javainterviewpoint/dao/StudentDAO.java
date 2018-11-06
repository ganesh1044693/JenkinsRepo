package com.javainterviewpoint.dao;

import java.util.List;

import com.javainterviewpoint.model.Student;

public interface StudentDAO
{
    public void createStudent(Student student);
    
    public Student getStudentById(long id);
    public List<Student> getAllStudents();
    
    public String getString(String s);
    
   
}
