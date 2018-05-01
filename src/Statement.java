import java.util.Scanner;

public class Statement 
{	
	static String user = System.getProperty("user.name");
	static Scanner input = new Scanner(System.in);
	static String option = null;
	
	
	public static void conclusionFinal(String[] args)
	{
		/** Print good bye message. */
		System.out.println("\nThank you for choosing to use our service! \nPlease come back if you want more restaurant information.");
		System.out.println("Hope to talk again! Good bye, "+ user +"!");
		System.exit(0); //End the program
	}
	
	public static void conclusionOption(String[] args)
	{
		int n = 0;
		
		System.out.println("Thank you for choosing to use our service " + user + "!");
		System.out.println("Would you like to see the main menu again? (yes or no)");
		option = input.next();
		while(n!=-1)
		{
			if(option.toLowerCase().equals("yes")){
				Tester.main(args);
				n=-1;
			}
			else if(option.toLowerCase().equals("no")){
				System.out.println("Please come back if you need more information!");
				System.exit(0);
				n = -1;
			}
			else{
				System.out.println("That was not a valid input. Please enter another input");
				option = input.next();
			}
		}	
	}
	
	public static void intro(String[] args) 
	{
		/** Print hello message. */
		System.out.println("Hello, "+ user +"! I am a food bot that can help you  ");
		System.out.println("find a good place to eat or help you calculate your tip!\n");
		System.out.println("Which option would you like to choose: ");
		System.out.println("1) Calculate Tip \n2) Look for a specific restaurant \n3) Recommendations for a restaurant \n4) Exit Program");
	}
}
