package HA4;

import java.util.Scanner;
import java.util.Random;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the best Game Ever!!");
		System.out.println("You will get 3 Questions");
		System.out.println("each Question gives you 5 Points but....");
		System.out.println("the Last Question will give you a random Point");
		System.out.println("Before we start, let's know a little bit about you");
		System.out.println("What's your Name?");
		String name = scanner.nextLine();
		System.out.println("How old are you?");
		int age = scanner.nextInt();
		scanner.nextLine();

		System.out.println("Who's your Uncle? Hint: Abed");
		String uncle = scanner.nextLine();

		if (uncle.equalsIgnoreCase("Abed")) {
			System.out.println("Good job Nigga, Let's start the Game .");

		} else {
			System.out.println("False! You can't play this game until you provide the correct answer.");
			return;
		}

		
		
		int points=0;
		System.out.println("What is the color of the Sun?");
		String sun=scanner.nextLine();
			if(sun.equalsIgnoreCase("White")){
				System.out.println("hmmmmmm");
				points+=5;
			     }else {
			    	 System.out.println("hmmmmmm");
			     }
			System.out.println("when was the internet invented");
			int internet=scanner.nextInt();
			scanner.nextLine();
				if(internet==1990){
					System.out.println("hmmmmmm ");
					points+=5;
				     }else {
				    	 System.out.println("hmmmmmm ");
				     }
				System.out.println("What is the speed of the Sound in km\\h");
				int sound=scanner.nextInt();
				scanner.nextLine();
				Random random=new Random();
				int x=random.nextInt(10)+1;
					if(sound==1235){
						System.out.println("hmmmmmm");
						points+=x;
					     }else {
					    	 System.out.println("hmmmmmm");
					     }
					 System.out.println("Game Over!");
					 System.out.print("Sooo;");
					 System.out.print(" "+ name);
					 System.out.print(" ");
					 System.out.println("the game is over");
				     System.out.println("Total Points: " + points);
				     System.out.println("Please share us how Points u got in the Group :) dont lie");
	}
}
