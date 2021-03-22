package com.r094.q5;

public class Manager extends Employee{

		// manager attributes.
		private String department;
		
		Manager(String name, String empid, Float salary, String department){
			super(name,empid,salary);
			this.department = department;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager myManager = new Manager("Martin", "E-101", 50000.99f, "Sales");
		System.out.println("Name -> " + myManager.getName()); 
		System.out.println("Salary -> " + myManager.getSalary());
		System.out.println("Incrementing salary by 15%");
		myManager.increaseSalary(15.0f); 
		System.out.println("New Salary -> Rs."+ myManager.getSalary() + "/- only.");

	}

}
