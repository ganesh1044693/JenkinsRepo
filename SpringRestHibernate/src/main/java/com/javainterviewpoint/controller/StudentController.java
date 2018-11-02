package com.javainterviewpoint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.javainterviewpoint.dao.StudentDAOImpl;
import com.javainterviewpoint.model.Student;

@RestController
public class StudentController
{
    @Autowired
    private StudentDAOImpl studentDAOImpl;
    
    /*** Creating a new Student ***/
    @RequestMapping(value="/create", method=RequestMethod.POST, 
            produces="application/json", consumes="application/json")
    public void createStudent(@RequestBody Student student)
    {
        studentDAOImpl.createStudent(student);
    }
    
    /*** Retrieve a single Student ***/
    @RequestMapping(value="/student/{id}",produces="application/json",
            method=RequestMethod.GET)
    public Student getStudentById(@PathVariable("id") long id)
    {
        Student student = studentDAOImpl.getStudentById(id);
        return student;
    }
    
    /*** Retrieve all Students ***/
    @RequestMapping(value="/students",produces="application/json",
            method=RequestMethod.GET)
    public List<Student> getAllStudents()
    {
        List<Student> studentList = studentDAOImpl.getAllStudents();
        return studentList;
    }
    /*** Retrieve all Students ***/
    @RequestMapping(value="/studentss",produces="application/json",
            method=RequestMethod.GET)
    public List<Student> getAllStudentss()
    {
        List<Student> studentList = studentDAOImpl.getAllStudents();
        return studentList;
    }
    /*** Retrieve all Students ***/
    @RequestMapping(value="/studentsss",produces="application/json",
            method=RequestMethod.GET)
    public List<Student> getAllStudentsss()
    {
        List<Student> studentList = studentDAOImpl.getAllStudents();
        return studentList;
    }
    
    
    
    
}
