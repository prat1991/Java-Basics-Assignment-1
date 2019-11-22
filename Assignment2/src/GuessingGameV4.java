/* Importing libraries */
import java.util.Scanner;

/* Class */
public class GuessingGameV4
{
      /*Scope for Instance Variables */
	  /* --------------Code that runs linearly 1x---------- */
	  static Scanner scannerObject = new Scanner(System.in); /*object is an instance of the class */
	  static int genRandNum= 1 + (int) (Math.random() * 99); /*variable initialization and declaration */
	  static int guessedUserInput; /*variable initialization and declaration */
	  static int i;
	
  /* Main Method */
  public static void main(String args[])
  {

      /*Scope for Local Variables */
	  
	  /* Control Structure (for loop runs for a finite times*/
	  /*Code that runs repeatedly linearly and nonlinearly */
	  for (i = 1; i < 6; i++) 
	  {
		  /* --------------Code that repeated runs linearly 5x---------- */
		  
		  /*USED FOR DEBUGGING PURPOSES ONLY: System.out.println(genRandNum);*/
		  
		  System.out.print("\n\nPick a number between 1 and 100 -----> "); /*Prompting user for input*/
		  guessedUserInput = scannerObject.nextInt(); /*repeatedly asking for user input 5x/ */

		  /*Code that repeated runs non-linearly 5x */
		  if (guessedUserInput < 1 || guessedUserInput >100 )
		  {
			  /*USED FOR DEBUGGING PURPOSES ONLY: System.out.print("Attempt: " + i); */
			  System.out.println("Your guess is not between 1 and 100, please try again");
			  i--;
			  continue;
		  }
		  else if (guessedUserInput > genRandNum)
		  {  
			  /*USED FOR DEBUGGING PURPOSES ONLY: System.out.print("Attempt: " + i); */
			  if (i >= 5)
			  {
				  break;
			  }
			  System.out.println("Please pick a lower number");
			  System.out.print("Try: " + i);
		  }
		  
		  else if (guessedUserInput < genRandNum) 
		  {
			  /*USED FOR DEBUGGING PURPOSES ONLY: System.out.print("Attempt: " + i); */
			  if (i >= 5)
			  {
				  break;
			  }
			  System.out.println("Please pick a higher number");
			  System.out.print("Try: " + i);
		  }
		  
		  else if (guessedUserInput == genRandNum)
		  {
			  /*USED FOR DEBUGGING PURPOSES ONLY: System.out.print("Attempt: " + i); */
			  System.out.println("\nYou win!");
			  System.out.print("Try: " + i);
			  break; 
		  }	
		  
	    }  
	    
	  /*-----SPECIFIED OUTSIDE THE FOR LOOP-------- */
	  scannerObject.close(); /*closing the scanner object because we are done collecting users keyboard input */

	  if (guessedUserInput != genRandNum && i <=5)
	  {
		  System.out.println("\n\nYou lose, the number to guess was " + genRandNum);
	  }
  }
}


