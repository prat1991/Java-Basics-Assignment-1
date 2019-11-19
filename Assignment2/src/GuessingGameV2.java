/* Importing libraries */
import java.util.Scanner;

/* Class */
public class GuessingGameV2
{
  /* Main Method */
  public static void main(String args[])
  {
	  /*Instance Variables */
	  /* --------------Code that runs linearly 1x---------- */
	  Scanner scannerObject = new Scanner(System.in); 
	  int genRandNum=1 + (int) (Math.random() * 99); /*calculating random number once between 1-100 */
	  int guessedUserInput = 2;
	  
	  /* Control Structure (for loop runs for a finite times*/
	  /*Code that runs repeatedly linearly and nonlinearly */
	  for (int i = 0; i < 5; i++) 
	  {
		  /* --------------Code that repeated runs linearly 5x---------- */
		  System.out.print("\nPick a number between 1 and 100 -----> "); /*Prompting user for input*/
		  guessedUserInput = scannerObject.nextInt(); /*repeatedly asking for user input 5x/

		  /*Code that repeated runs non-linearly 5x */
		  if (guessedUserInput < 1 || guessedUserInput >100 )
		  {
			  System.out.println("Your guess is not between 1 and 100, please try again");
		  }
		  else if (guessedUserInput > genRandNum)
		  {  
			  System.out.println("Please pick a lower number");
		  }
		  
		  else if (guessedUserInput < genRandNum) 
		  {
			  System.out.println("Please pick a higher number");
		  }
		  
		  else if(guessedUserInput == genRandNum)
		  {
			  System.out.println("You win!");
		  }
	    }  

	  /* --------------Code that runs linearly 1x---------- */
	  scannerObject.close(); /*closing the scanner object because we are done collecting users keyboard input */
	  System.out.println("\nYou lose, the number to guess was " + genRandNum); /*goodbye message to the user */
  }
}




