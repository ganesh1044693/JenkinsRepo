package com.testpackage.java;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.javainterviewpoint.controller.StudentController;

public class RestControllerTest {
	@Autowired
	StudentController stuC;
	
	@Before
	public  void setUp()
	{
		stuC= new StudentController();
		System.out.println("Before method---------------");
	}
	@Test
	public void testMethod1()
	{
		String result= stuC.getA();
		Assert.assertEquals(result, "Hllonsic");
		
	}
	/*@Test
	public void testMethod2()
	{
		String result= stuC.getA();
		Assert.assertEquals(result, "Hllsic");
		
	}*/

}
