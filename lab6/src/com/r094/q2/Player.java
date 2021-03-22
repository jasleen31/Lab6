package com.r094.q2;

public class Player {
	
	protected String name;
	protected float height;
	
	Player(String name, float height){
		this.name = name;
		this.height = height;
	}
	protected void aboutPlayer() {
		System.out.println("~~Player Data~~ (From Parent Class)"
							+ "\nName -> " + this.name 
							+ "\nHeight ->" + this.height + "Ft");
	}

}
