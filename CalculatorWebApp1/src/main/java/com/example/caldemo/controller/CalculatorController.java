package com.example.caldemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.caldemo.dto.CalculatorDto;
import com.example.caldemo.service.CalculatorService;

@RestController
public class CalculatorController {
	
	@Autowired
	private CalculatorService calcService;
	
	/*
	 * Method to calculate sum.
	 */
	@PostMapping("/api/add")
	public Integer sum(@RequestBody CalculatorDto calc) {
		return calcService.sum(calc);
	}
	
	/*
	 * Method to calculate difference.
	 */
	@PostMapping("/api/diff")
	public Integer diff(@RequestBody CalculatorDto calc) {
		return calcService.diff(calc);
	}
	

}
