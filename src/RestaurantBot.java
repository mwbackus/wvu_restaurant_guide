/** 
 * Restaurant Bot
 * Michael Backus
 * CS110 2/11/2018
 */

import java.util.stream.Stream;

public class RestaurantBot {


	//Bot data declarations
	String nameBot; //name of bot
	public Boolean end_bot; //variable for ending conversation
	String[] exitMessages = {"exit", "bye", "good-bye", "goodbye", "good bye", "no"};
	String[] foodKinds = {"american", "asian", "european", "mexican", "mediterranean", "vegetarian"};
	String[] foodTypes = {"fast food", "grab and go", "casual", "organic"};
	
	
	String user = System.getProperty("user.name");
	

	//Default Constructor
	RestaurantBot(){
		nameBot = "EvansdaleStudent";
		end_bot = false;
	}
	
	//Constructor w/ provided name
	RestaurantBot(String name){
		nameBot = name;
		end_bot = false;
	}
	
	
	//Methods of Restaurant Bot
	public void greet_user() {
		/** Print hello message. */
		System.out.println("Hello, "+this.user+"! I am a food bot that will help you discover the");
		System.out.println("closest places to eat on and near the Evansdale Campus!\n");
	}
		
	public void good_bye() {
		/** Print good bye message. */
		System.out.println("\nHope to talk again! Good bye, "+this.user+"!");
		System.exit(0); //End the program
	}
	
	public void display_results(String result) {
		/** Display the output of the bot's search */
		if (result == null) {
			System.out.println("I'm sorry, I did not find anything for you!");
			return;
		} else {
			System.out.println("I found you something!\n");
			System.out.println(result);
		}
	}

	public void print_options(String[] food_array) {
		/** Print out to the user the pre-defined options. */
		for (int i=0; i<food_array.length; i++) {
			System.out.print( this.initCap(food_array[i]) );
			if ( ((i+1) % 4.0 != 0) && (i < (food_array.length-1)) ) {
				System.out.print(" | "); //Only print 3 bars every line
			} else {
				System.out.print("\n");
			}
		}
		System.out.print("\n");
	}
	
	public boolean is_in_string_array(String[] array_name, String user_response) {
		/** Check if user response is in array_name */
		boolean contains = Stream.of(array_name).anyMatch(x 
				-> x.equals(user_response.toLowerCase())); //Search array
		if (contains) { //A match has been found
			return true;
		} else {
			return false;
		}
	}
	
	public String initCap(String inputString) {
		/** Initial capitalization of kinds/types of food*/
	    if (inputString == null || inputString.length() == 0) {
	        return inputString;
	    }
	    return inputString.substring(0, 1).toUpperCase() + inputString.substring(1);
	}
	
}
	