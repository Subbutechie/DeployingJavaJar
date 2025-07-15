package shared;

import java.util.List;

import entity.Employee;

public interface ShareMethods {
	void empByDept(List<Employee> emps);
	void avgSalByDept(List<Employee> emps);
	void youngestEmp(List<Employee> emps);
	void empBySalaryGreaterThan(List<Employee> emps,double salary);
	void sortByAge(List<Employee> emps);
	void sortBySalary(List<Employee> emps);
	void topEarnerByDept(List<Employee> emps);
	
	

}
