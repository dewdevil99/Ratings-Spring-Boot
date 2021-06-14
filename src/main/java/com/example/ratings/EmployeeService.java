package com.example.ratings;

import java.util.*;

public interface EmployeeService{
	public abstract void saveEmployee(Employee employee);
	public abstract List<Employee> top5employees();
}