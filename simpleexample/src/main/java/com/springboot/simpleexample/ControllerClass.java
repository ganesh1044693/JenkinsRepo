package com.springboot.simpleexample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {

	@RequestMapping(value = "/message")
	public String getMessage() {
		return "hello";
	}

}
