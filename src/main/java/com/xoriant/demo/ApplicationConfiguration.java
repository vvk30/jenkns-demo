package com.xoriant.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kulkarni_vs
 *
 */
@RestController
public class ApplicationConfiguration {
	/**
	 * @return string
	 */
	@RequestMapping("/hello")
	public final String hello() {
		return "Hello World again";
	}


	//This is just a test build
}
