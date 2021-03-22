package com.r094.q2;
import java.util.Scanner;
public class Cricket_Player extends Player{
	private String sport;

	Cricket_Player(String name, float height) {
		super(name, height);
		this.sport = "Cricket";
		// TODO Auto-generated constructor stub
	}
	public void Sport() {
		System.out.println("I play Cricket! ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Player's name : "); String name = input.next();
		System.out.println("Height? "); Float height = input.nextFloat();
		input.close();
		Cricket_Player myPlayer = new Cricket_Player(name, height);	
		// Display basic data from Parent class, Player.
		myPlayer.aboutPlayer();
		System.out.println(myPlayer.sport);
		Football_Player obj = new Football_Player(name,height);
		obj.aboutPlayer();
		System.out.println(obj.sport);		
	}

}
