package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.service.DemoService;

@RestController
@RequestMapping("/name")
public class DemoController {
	
	@Autowired
	DemoService demoService;
	
	@GetMapping("/{name}")
	public String getYourName(@PathVariable String name) {
		return demoService.getYourName(name);
	}
	
	@GetMapping("/hello")
	public String printHello() {
		return "Hello";
	}
//	
//	@GetMapping("/{name}/{age}")
//	public void details(@PathVariable("name") String name, @PathVariable("age") int age) {
////		return " name " + " , " + "age";
//		System.out.println(name);
//		System.out.println(age);
//	}

}
