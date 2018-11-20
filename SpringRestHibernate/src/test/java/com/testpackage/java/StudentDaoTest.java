package com.testpackage.java;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.javainterviewpoint.dao.StudentDAOImpl;

public class StudentDaoTest {

	StudentDAOImpl daoImpl;

	@Before
	public void setup() {
		daoImpl = new StudentDAOImpl();
	}

	@Test
	public void testGetString() {
		
		String expected= "Hello";
		Assert.assertEquals(expected, daoImpl.getString(expected));

	}

}
