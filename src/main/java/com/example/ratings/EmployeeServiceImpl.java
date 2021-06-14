package com.example.ratings;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public void saveEmployee(Employee employee) {
		employeeRepository.save(employee);
	}
	
	@Override
	public List<Employee> top5employees(){
		return employeeRepository.findTop5ByOrderByRatingDesc();
	}
}