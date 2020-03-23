package com.example.caldemo.serviceImpl;

import org.springframework.stereotype.Service;

import com.example.caldemo.dto.CalculatorDto;
import com.example.caldemo.service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {

	@Override
	public Integer sum(CalculatorDto calc) {
		calc.setResult(calc.getX()+calc.getY());
		return calc.getResult();
	}

	@Override
	public Integer diff(CalculatorDto calc) {
		calc.setResult(calc.getX()-calc.getY());
		return calc.getResult();
	}

}
