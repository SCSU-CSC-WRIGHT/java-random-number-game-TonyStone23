package labNumberFour;

import java.util.Scanner;
import java.util.Random;

public class Game {
	
	public static void main(String [] args) {
		
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		
		System.out.println("What level would you like to play?");
		System.out.println("Easy = 1");
		System.out.println("Medium = 2");
		System.out.println("Hard = 3");
	
		try {
			//determining level
			int max;
			int level = s.nextInt();
			
			if (level == 1) {
				max = 50;
			} else if (level == 2) {
				max = 100;
			} else {
				max = 500;
			}
			
			//start game, get random number
			System.out.println("guess a number between 1 and " + max);
			int num = r.nextInt(max) + 1;
			
			//game loop
			for(int i = 0; i < 11; i++) {
				//the user gets 10 guesses
				if (i == 10) {
					System.out.print("Sorry, you've run out of attempts! The number was " + num + ".");
					break;
				}
				System.out.println("Enter a guess: ");
				int guess = s.nextInt();
				//game logic
				if (guess > num) {
					System.out.println("Too high!");
				}else if (guess < num) {
					System.out.println("Too low!");
				}else{
					System.out.println("Congratulations! You guessed the number!");
					break;
				}
			}
		//handle exception	
		}catch (Exception e) {
			System.out.println("That is not an integer, please restart with only integer inputs.");
		}
		//close scanner
		s.close();
	}

}
