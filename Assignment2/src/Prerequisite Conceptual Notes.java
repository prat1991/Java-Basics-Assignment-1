
public class MyNotes
{
	public static void main(String[] args) 
	{
		System.out.println("\n---------------Linear Downwards Code Execution(Executes once) ---------------------\n");
		int counter = 0;
		System.out.println("Welcome to my Console Game App");
		System.out.println("you are starting on try#: "+counter);

		
		System.out.println("\n---------------Non Linear Repeated Code Execution(Executed repeatedly)---------------------\n");
		/*CONTROL STRUCTURES ALTER THE DEFAULT TOP DOWN FLOW OF PROGRAMMING */
		while (counter < 10) 
		{
			counter++;
			System.out.println("Running the game; you are on try#: "+counter);
			
			if(counter == 1)
			{
				System.out.println("you are on special try " + counter);
			}
			else if (counter == 3)
			{
				System.out.println("you are on special try " + counter);				
			}
			else
			{
				System.out.println("you are on default try " + counter);			
			}
			
			
			/*makes the while loop behave like a for loop */
			if (counter == 5) 
				break;
		}
		
		System.out.println("\n---------------Linear Downwards Code Execution (Executes once) ---------------------\n");
		System.out.println("you ended on try#: "+counter);
		System.out.println("Thank you for using my Console Game App");
	}
}








