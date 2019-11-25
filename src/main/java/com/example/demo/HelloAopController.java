package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloAopController {

	@RequestMapping("/test1")
	public String input1() {
		return "test1";
	}

	@RequestMapping("/test2")
	public String input2() {
		return "test2";
	}

}
