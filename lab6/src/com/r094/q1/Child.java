package com.r094.q1;

public class Child extends Parent{
	String childName;
	
	Child(){
		super();
		childName = "My Son";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj = new Child();
		//System.out.println("Parent --> "+Parent);
		System.out.println("Child --> "+obj.childName);

	}

}
