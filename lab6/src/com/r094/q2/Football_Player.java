package com.r094.q2;
import java.util.Scanner;
public class Football_Player extends Player{
	
	 String sport;
	
		Football_Player(String name, float height) {
		super(name, height);
		this.sport = "Football";
		// TODO Auto-generated constructor stub
	}
		

		public void Sport() {
			System.out.println("I play Football! ");
		}

}
