package com.in28minutes.microservices.limitsservice.controller;

import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.microservices.limitsservice.bean.Limits;

@RestController
public class LimitsController {
	
	
	public Limits retrieveLimits() {
		return new Limits(1,1000);
		
	}
}
