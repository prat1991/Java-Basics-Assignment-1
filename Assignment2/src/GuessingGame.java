/* Importing the Scanner class in Java so that we can use the nextint method for collecting the users int input from the keyboard */
import java.util.Scanner;

public class GuessingGame
{
  public static void main(String args[])
  {
	  /*Instance Variables (Specifying variables here means that we can use them anywhere in the code without getting variable undefined errors*/
	  Scanner scannerObject = new Scanner(System.in); 
	  int genRandNum=1;
	  int guessedUserInput = 2;
	  int tries = 0;
	  
	  /*Code that runs invariantly once */
	  System.out.println("\n----------------Welcome to the Random Number Generator Guessing Game -------------------");
	  System.out.println("Game is starting on try#: "+tries);
	  System.out.println("----------------------------------------------------------------\n");
	  while(guessedUserInput != genRandNum)
	  {
		  /*Code that runs invariantly per each try */
		  System.out.print("Pick a number between 1 and 100 (guess what number the computer chose: ");
		  guessedUserInput = scannerObject.nextInt(); /*Using the scanner classes nextInt() method for collecting the users int keyboard input*/
		  genRandNum = 1 + (int) (Math.random() * 99); /*genRandNum is not undefined because genRandNum was specified as an Instance Variable*/
		  
		  /*Code that runs variantly per each try */
		  if (guessedUserInput > genRandNum)
		  {  
			  System.out.println("You are on try#: "+tries);
			  System.out.println("Computer Picked: " + genRandNum);
			  System.out.println("You guessed that the computer chose: " + guessedUserInput);
			  System.out.println("Please pick a lower number; your guess is incorrect");
			  System.out.println("Try#: "+tries + " is finished");
			  tries++;
			  System.out.println("Now you are starting try#: "+tries);
			  System.out.println("-----------------------------");

		  }
		  else if (guessedUserInput < genRandNum) 
		  {
			  System.out.println("You are on try#: "+tries);
			  System.out.println("Computer Picked: " + genRandNum);
			  System.out.println("You guessed that the computer chose: " + guessedUserInput);
			  System.out.println("Please pick a higher number; your guess is correct");
			  System.out.println("Try#: "+tries + " is finished");
			  tries++;
			  System.out.println("Now you are starting try#: "+tries);
			  System.out.println("-----------------------------");

		  }
		  else 
		  {
			  System.out.println("You are on try#: "+tries);
			  System.out.println("Computer Picked: " + genRandNum);
			  System.out.println("You guessed that the computer chose: " + guessedUserInput);
			  System.out.println("Try#: "+tries + " is finished");
			  System.out.println("You win; you guess is correct");
			  tries++;
			  System.out.println("Now you are starting try#: "+tries);
			  System.out.println("-----------------------------");

		  }
		  
		  /*makes the while loop behave like a for loop */
		  if (tries == 5)
			  break;
	  }
	  /*Code that runs invariantly once */
	  scannerObject.close(); /*closing the scanner object because we are done collecting users keyboard input */
	  System.out.println("Game ended on try#: "+tries);
	  System.out.println("\n----------------Thank you for playing the Random Number Generator Guessing Game -------------------");
  }
}


