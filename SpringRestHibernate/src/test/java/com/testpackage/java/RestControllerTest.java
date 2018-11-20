package com.testpackage.java;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.javainterviewpoint.controller.StudentController;
import com.javainterviewpoint.dao.StudentDAO;
import com.javainterviewpoint.dao.StudentDAOImpl;
import com.javainterviewpoint.model.Student;

public class RestControllerTest {
	@Mock
	StudentDAOImpl studentDao;

	@InjectMocks
	StudentController stuC;

	@Before
	public void setUp() {

		MockitoAnnotations.initMocks(this);
		System.out.println("Before method---------------");
	}

	@Test
	public void testMethod1() {
		String result = "Hello";
		Mockito.when(studentDao.getString(Mockito.anyString())).thenReturn("Hello");
		Assert.assertEquals(result, stuC.getA());
		// Assert.assertNotEquals("Hello", stuC.getA());

	}

	@Test
	public void testSave() {
		Student student = new Student();
		student.setAge(20);
		student.setId(10);
		student.setName("cmdcnd");
		studentDao.createStudent(Mockito.any(Student.class));
		Mockito.doNothing().when(studentDao).createStudent(Mockito.any(Student.class));
		stuC.createStudent(student);
	}

	@Test
	public void testgetById() {
		Student student = new Student();
		student.setAge(20);
		student.setId(10);
		student.setName("cmdcnd");

		Mockito.when(studentDao.getStudentById(Mockito.anyLong())).thenReturn(student);
		Assert.assertEquals(student, stuC.getStudentById(10L));
		Assert.assertEquals("cmdcnd", stuC.getStudentById(10L).getName());

	}

	@Test
	public void testgetAll() {
		Student student1 = new Student();
		student1.setAge(20);
		student1.setId(10);
		student1.setName("cmdcnd");
		Student student2 = new Student();
		student2.setAge(20);
		student2.setId(10);
		student2.setName("cmdcnd");
		List<Student> result = new ArrayList<>();
		result.add(student1);
		result.add(student2);

		Mockito.when(studentDao.getAllStudents()).thenReturn(result);
		Assert.assertEquals(result, stuC.getAllStudents());

	}

}
