package service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import entity.Employee;
import shared.ShareMethods;

public class Functionality implements ShareMethods{

	@Override
	public void empByDept(List<Employee> emps) {
		Map<String, List<String>> res = emps.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.mapping(Employee::getName,Collectors.toList())));
		System.out.println("Employees filtered by Department...");
		res.entrySet().stream().forEach(System.out::println);
	}

	@Override
	public void avgSalByDept(List<Employee> emps) {
		
		Map<String, Double> ans = emps.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println("Employees filtered on Average Salary by Department...");
		ans.entrySet().stream().forEach(System.out::println);
	}

	@Override
	public void youngestEmp(List<Employee> emps) {
		
		Optional<Employee> emp = emps.stream().min(Comparator.comparingInt(Employee::getAge));
		System.out.println("Youngest Employee is "+ emp.get());
		
	}

	@Override
	public void empBySalaryGreaterThan(List<Employee> emps, double salary) {
		List<Employee> list =  emps.stream().filter(x -> x.getSalary() > salary).toList();
		List<String> ls = list.stream().map(x -> x.getName()+" - "+x.getSalary()).toList();
		System.out.printf("Employee earning greater than %.2f are %s%n ",salary,ls.toString());
	}

	@Override
	public void sortByAge(List<Employee> emps) {
		String ans =  emps.stream().sorted(Comparator.comparingInt(Employee::getAge)).map(e -> e.getName()+"-"+e.getAge()).collect(Collectors.joining("\n"));
		System.out.println("Employees sorted by age : \n"+ans);
		
	}

	@Override
	public void sortBySalary(List<Employee> emps) {
		String str = emps.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).map(e -> e.getName()+" - "+e.getSalary()).collect(Collectors.joining("\n"));
		
		System.out.print("Employees sorted by Salary: \n"+str);
	}

	@Override
	public void topEarnerByDept(List<Employee> emps) {
		
		Map<String, Optional<Employee>> top = emps.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).
				collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
		System.out.println("Top earner Departement-wise....");
		top.entrySet().stream().forEach(System.out::println);
	}

	
	
}
