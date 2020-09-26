package com.java.oops;

public class Employee {
	int id;
	String name;
	String grade;
	int salary;

	public Employee(int id) {
		this.id = id;
	}

	public Employee(String name,String grade) {
		this.name = name;
		this.grade = grade;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {
		Employee emp = new Employee("dshh","A");
		emp.setName("Rahul");
		emp.setSalary(40000);
		emp.getName();
		emp.getSalary();
		emp.getId();
	}

}
