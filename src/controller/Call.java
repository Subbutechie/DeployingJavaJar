package controller;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import entity.Employee;
import service.Functionality;

public class Call {
	
	public static void main(String[] args) {
		
		List<Employee> employees = Arrays.asList(
				new Employee("Subbu", "HR", 92000,25),
			    new Employee("Alice", "IT", 70000, 28),
			    new Employee("Bob", "HR", 50000, 35),
			    new Employee("Charlie", "Finance", 85000, 30),
			    new Employee("David", "IT", 60000, 25),
			    new Employee("Eva", "HR", 52000, 45),
			    new Employee("Frank", "Finance", 90000, 40)
			);
		service.Functionality fun = new Functionality();
		try (Scanner sc = new Scanner(System.in)) {
			while(true) {
				System.out.println("Select number to perform the operation\r");
				System.out.printf("1. List employees grouped by department\r\n"
						+ "\r\n"
						+ "2. Average salary by department\r\n"
						+ "\r\n"
						+ "3. Youngest employee in each department\r\n"
						+ "\r\n"
						+ "4. Filter employees with salary > X\r\n"
						+ "\r\n"
						+ "5. Sort all employees by age\r\n"
						+ "\r\n"
						+ "\r\n"
						+ "6. Sort all employees by salary\r\n"+"\r\n"
						+ "7. Top earner per department\r\n"
						+ "\r\n"
						+ "0. Exit\r\n");
				System.out.println("Enter the number here : ");
				int input = sc.nextInt();
				
				switch(input) {
					case 0: System.out.println("Exiting have a Great Day....");
							System.exit(0);
					case 1: fun.empByDept(employees);
							break;
					case 2: fun.avgSalByDept(employees);
							break;
					case 3: fun.youngestEmp(employees);
							break;
					case 4: System.out.println("Please enter amount : ");
							double salary = sc.nextDouble();
							fun.empBySalaryGreaterThan(employees,salary);
							break;
					case 5: fun.sortByAge(employees);
							break;
					case 6: fun.sortBySalary(employees);
							break;
					case 7: fun.topEarnerByDept(employees);
							break;
					default: System.out.println("Please choose within 0 to 7");
					
					
				}
				
			}
		}
		
		
	}

	

}
