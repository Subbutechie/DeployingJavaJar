package entity;

public class Employee {
	
	private String name;
	private String department;
	private double salary;
	private int age;
	
	public Employee(){
		
	}

	public Employee(String name, String department, double salary, int age) {
		super();
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + " | " + department +" | " +"$"+ salary+" | Age: "+ age;
	}
	
}
