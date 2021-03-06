package com.r094.q5;

public class Employee {
	private String name;
	private  String empid;
	private  Float salary;
	
	Employee(){
		name="";
		empid="";
		salary=0.0f;
	}
	
	Employee(String name, String empid, Float salary){
		this.name = name;
		this.empid = empid;
		this.salary = salary;
		System.out.println("Employee defined!");
	}
	
	protected String getName() {
		return this.name;
	}
	
	protected Float getSalary() {
		return this.salary;
	}
	
	protected void increaseSalary(Float inc) {
		this.salary += (inc*this.salary);
	}

}
