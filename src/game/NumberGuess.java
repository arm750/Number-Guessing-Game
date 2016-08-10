package game;
import java.util.Scanner;
import java.util.Random;
public class NumberGuess {
	private static Scanner scan;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int randnum= rand.nextInt(100);
		int numtry = 0;
		int guess;//players chosen number, guess
		scan = new Scanner(System.in);
		boolean win = false; 
				
		System.out.println("Welcome to the Guessing Game!");
		System.out.println("The computer will generate a random number between 0 and 100, your job is to correctly guess the number.");
		System.out.println("");
		
		while(win ==false)
		{
			System.out.print("Enter a number between 0 and 100:");//Guess
			guess = scan.nextInt();
			numtry++;
					
					if(guess == randnum)//if correct
					{
						win = true;
						
					}//end if 
			
						else if (guess < randnum)//too low
						{
							System.out.println("Guess is too low, try again");
							
							
						}
						
						else if ( guess > randnum)//too high
						{
							System.out.println("Guess is too hight, try again");
							
						}
		}//end while loop
		
		System.out.println("Congratulations, you sucessfully guessed the correct number " +randnum +" in " +numtry +" tries!");
		
		
		
	}

}



