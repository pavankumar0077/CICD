package com.demo.service;

import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {

	@Override
	public String getYourName(String name) {
		return "Hi " + name ;
		
	}
	

}
