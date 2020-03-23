package com.example.caldemo.service;

import com.example.caldemo.dto.CalculatorDto;

public interface CalculatorService {
	/*
	 * Method to calculate sum.
	 */
	public Integer sum(CalculatorDto calc);
	
	/*
	 * Method to calculate difference.
	 */
	public Integer diff(CalculatorDto calc);
}
