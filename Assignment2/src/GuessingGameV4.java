/* Importing libraries */
import java.util.Scanner;

/* Class */
public class GuessingGameV4
{
      /*Scope for Instance Variables */
	  /* --------------Code that runs linearly 1x---------- */
	  Scanner scannerObject = new Scanner(System.in); /*object is an instance of the class */
	  int genRandNum= 1 + (int) (Math.random() * 99); /*variable initialization and declaration */
	  int guessedUserInput; /*variable initialization and declaration */
	  int i;
	
  /* Main Method */
  public static void main(String args[])
  {
	  GuessingGameV4 object = new GuessingGameV4();
	  
	  
	  
	  /*Scope for Local Variables */
	  
	  /* Control Structure (for loop runs for a finite times*/
	  /*Code that runs repeatedly linearly and nonlinearly */
	  System.out.println(object.genRandNum);
	  for (object.i = 0; object.i < 5; object.i++) 
	  {
		  /* --------------Code that repeated runs linearly 5x---------- */
		  
		  /*USED FOR DEBUGGING PURPOSES ONLY: System.out.println(genRandNum);*/
		  
		  System.out.print("\n\nPick a number between 1 and 100 -----> "); /*Prompting user for input*/
		  object.guessedUserInput = object.scannerObject.nextInt(); /*repeatedly asking for user input 5x/ */

		  /*Code that repeated runs non-linearly 5x */
		  if (object.guessedUserInput < 1 || object.guessedUserInput >100 )
		  {
			  /*USED FOR DEBUGGING PURPOSES ONLY: System.out.print("Attempt: " + i); */
			  System.out.println("Your guess is not between 1 and 100, please try again");
			  object.i--;
			  continue;
		  }
		  else if (object.guessedUserInput > object.genRandNum)
		  {  
			  /*USED FOR DEBUGGING PURPOSES ONLY: System.out.print("Attempt: " + i); */
			  if (object.i >= 5)
			  {
				  break;
			  }
			  System.out.println("Please pick a lower number");
			  System.out.print("Try: " + object.i);
		  }
		  
		  else if (object.guessedUserInput < object.genRandNum) 
		  {
			  /*USED FOR DEBUGGING PURPOSES ONLY: System.out.print("Attempt: " + i); */
			  if (object.i >= 5)
			  {
				  break;
			  }
			  System.out.println("Please pick a higher number");
			  System.out.print("Try: " + object.i);
		  }
		  
		  else if (object.guessedUserInput == object.genRandNum)
		  {
			  /*USED FOR DEBUGGING PURPOSES ONLY: System.out.print("Attempt: " + i); */
			  System.out.println("\nYou win!");
			  System.out.print("Try: " + object.i);
			  break; 
		  }	
		  
	    }  
	  
      System.out.println("\n\nYou lose, the number to guess was " + object.genRandNum);

	  
	  /*Specified outside the for loop to prevent "Illegal State Exception" Errors */
	  object.scannerObject.close(); /*closing the scanner object because we are done collecting users keyboard input */
  }
}

