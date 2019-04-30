package com.ualbany.hw1.problem1;

public class EmployeeTest 
{
	public static void main(String[] args)
	{
		// Create employees
		Employee emp1 = new Employee("Steve", "Rodgers", 9000.00);
		Employee emp2 = new Employee("Luke", "Skywalker", 20000.00);
		
		// Print initial salaries
		System.out.println("Employee Salaries:");
		System.out.printf(emp1.getFullName() + ": $%.2f\n", emp1.getYearSalary());
		System.out.printf(emp2.getFullName() + ": $%.2f\n", emp2.getYearSalary());
		
		// Apply 10% raise
		System.out.println("\nApplying 10% Raise...\n");
		emp1.raiseSalary(10.0);
		emp2.raiseSalary(10.0);
		
		// Print salaries after applying the raise
		System.out.println("Employee Salaries:");
		System.out.printf(emp1.getFullName() + ": $%.2f\n", emp1.getYearSalary());
		System.out.printf(emp2.getFullName() + ": $%.2f\n", emp2.getYearSalary());
	}
}
