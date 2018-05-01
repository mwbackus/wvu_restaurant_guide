/** 
 * Restaurant Bot
 * Michael Backus
 * CS110 2/11/2018
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RestaurantBotMain {

	public static void main(String[] args) { 
		//** TEST BOT PROGRAM */
		
		//Instantiate a new bot, run it!
		RestaurantBot BotA = new RestaurantBot("Restaurant_Bot_01");
		String user_input_kind = "";
		String user_input_type = "";
		Scanner input = new Scanner(System.in);
		String restart_bot = "yes";
		String combined ="";
		
		//Make new HashMap
		Map<String, String> restaurant = new HashMap<String, String>();
		
		
		//American style entries
	    restaurant.put("american fast food", "Burger King\nMountainlair\nM-W 7:30am - 10:00pm"
	    		+ "\nTh-F 7:30am -9:00pm\nSat 12:00pm - 9:00pm\nSun 3:00pm 9:00pm\nhttps://www."
	    		+ "bk.com/\n\nChick-Fil-A"
	    		+ "\nMountainlair\nM-W 7:30am - 10:00pm\nTh-F 7:30am - 9:00pm\nSat 12:00 - 9:00pm"
	    		+ "\nhttps://www.chick-fil-a.com\n\nTwo Birds Chicken\nEvansdale Crossing\n11:00am - "
	    		+ "9:00pm\nhttp://www.twobirdsrestaurant.com\n\nHugh Baby's BBQ"
	    		+ "\nEvansdale Crossing\n11:00am - 9:00pm\nhttps://www.hughbabys.com");
	    restaurant.put("american grab and go", "Bits & Bytes\nEngineering Building\nM-F 7:30am"
	    		+ " - 3:30pm\nhttps://diningservices.wvu.edu/about/locations/dining-halls/cafe-"
	    		+ "evansdale\n\nSummitt Grab 'n Go\nSummitt Hall South\nM-F 11:00am - 9:00pm\nhttp"
	    		+ "s://diningservices.wvu.edu/about/locations/dining-halls/summit-cafe");
	    restaurant.put("american casual", "Summit Cafe\nSummit Hall South\nM-F 7:00am - "
	    		+ "7:00pm\nSat-Sun 11:00am - 6:30pm\nhttps://diningservices.wvu.edu/about/locations"
	    		+ "/dining-halls/summit-cafe\n\nWhich Wich?\nM-W 10:30am - 10:00pm"
	    		+ "\nTh-F 10:30am - 9:00pm\nSat 12:00pm - 9:00pm\nSun 2:00pm - 9:00pm\nhtt"
	    		+ "ps://www.whichwich.com\n\n"
	    		+ "Boreman Bistro\nBoreman Hall South\nM-F 11:00am - 7:00pm\nSat & Sun 9:00am"
	    		+ " - 7:00pm\nhttps://diningservices.wvu.edu/about/locations/dining-halls/boreman-"
	    		+ "bistro\n\nThe Terrace Room\nStalnaker Hall\nM-Th 11:00am - 8:00pm\nF 11:00am"
	    		+ " - 2:00pm\nSat & Sun 10:00am - 2:00pm\nhttps://diningservices.wvu.edu/about/locat"
	    		+ "ions/dining-halls/terrace-room");
	    restaurant.put("american organic", "Summit Cafe\nSummit Hall South\nM-F 7:00am - 7:00pm"
	    		+ "\nSat-Sun 11:00am - 6:30pm\n"
	    		+ "https://diningservices.wvu.edu/about/locations/dining-halls/summit-cafe\n" 
	    		+ "\nWhich Wich?\nM-W 10:30am - 10:00pm\nTh-F 10:30am"
	    		+ " - 9:00pm\nSat 12:00pm - 9:00pm\nSun 2:00pm - 9:00pm\nhttps://www.whichwich.com");
	    
	    //Asian style entries
	    restaurant.put("asian grab and go", "Saikou Sushi\nMountainlair\nM-4 10:00am - "
	    		+ "7:00pm\nSat 2:00pm-9:00pm\nhttp://www.saikousushi.com\n"
	    		+ "\n\nDa Vinci's\nEvansdale Library\nM-Th 8:00am - 9:00pm\nF 8:00am - "
	    		+ "2:00pm\nSun 2:00pm - 9:00pm\nhttps://diningservices.wvu.edu/about/locations/dining"
	    		+ "-halls/cafe-evansdale");
	    restaurant.put("asian casual", "Saikou Sushi\nMountainlair\nM-4 10:00am - 7:00pm\nSat "
	    		+ "2:00pm-9:00pm\nhttp://www.saikousushi.com\n"
	    		+ "\n\nDa Vinci's\nEvansdale Library\nM-Th 8:00am - 9:00pm\nF 8:00am - 2:00pm\nSun "
	    		+ "2:00pm - 9:00pm\nhttps://diningservices.wvu.edu/about/locations/dining-halls/cafe-evansdale");

	    //European style entries
	    restaurant.put("european fast food", "Sbarro Italian\nMountainlair\nM-W 10:30am - 10:"
	    		+ "00pm\nTh-F 10:30am"
	    		+ " - 9:00pm\nSat 12:00pm - 9:00pm\nSun 2:00pm - 9:00pm\nhttps://sbarro.com\n\nDa "
	    		+ "Vinci's\nEvansdale Library\nM-Th "
	    		+ "8:00am - 9:00pm\nF 8:00am - 2:00pm\nSun 2:00pm - 9:00pm\nhttps://diningservices.wvu.edu/"
	    		+ "about/locations/dining-halls/cafe-evansdale");
	    restaurant.put("european casual", "Sbarro Italian\nMountainlair\nM-W 10:30am - 10:00"
	    		+ "pm\nTh-F 10:30am"
	    		+ " - 9:00pm\nSat 12:00pm - 9:00pm\nSun 2:00pm - 9:00pm\nhttps://sbarro.com\n\nDa "
	    		+ "Vinci's\nEvansdale Library\nM-Th"
	    		+ " 8:00am - 9:00pm\nF 8:00am - 2:00pm\nSun 2:00pm - 9:00pm\nhttps://diningservices.wvu.e"
	    		+ "du/about/locations/dining-halls/cafe-evansdale");
	    restaurant.put("european organic", "Da Vinci's\nEvansdale Library\nM-Th 8:00am - 9:"
	    		+ "00pm\nF 8:00am"
	    		+ " - 2:00pm\nSun 2:00pm - 9:00pm\nhttps://diningservices.wvu.edu/about/locations/dining"
	    		+ "-halls/cafe-evansdale");

	    //Mexican style entries
	    restaurant.put("mexican casual", "Little Donkey\nEvansdale Crossing\n11:00am - 9:00"
	    		+ "pm\nhttp://www.thelittledonkey.com");
	    restaurant.put("mexican fast food", "Little Donkey\nEvansdale Crossing\n11:00am - 9:00"
	    		+ "pm\nhttp://www.thelittledonkey.com");
	    
	    //Mediterranean style entries
	    restaurant.put("mediterranean casual", "Taziki's\nEvansdale Crossing\n11:00am - 9:00"
	    		+ "pm\nhttp://tazikiscafe.com");
	    restaurant.put("mediterranean organic", "Taziki's\nEvansdale Crossing\n11:00am - 9:00"
	    		+ "pm\nhttp://tazikiscafe.com");
	    restaurant.put("mediterranean grab and go", "Taziki's\nEvansdale Crossing\n11:00am - "
	    		+ "9:00pm\nhttp://tazikiscafe.com");
	    
	    //Vegetarian style entries
	    restaurant.put("vegetarian organic", "Juice Bar\nEvansdale Crossing\n7:00am - 3:00pm"
	    		+ "\n\nThe Greenhouse\nStudent Health and CPASS\nM-F 8:00am - 4:30pm\n\nTaziki's"
	    		+ "\nEvansdale Crossing\n11:00am - 9:00pm\nhttp://tazikiscafe.com");
	    restaurant.put("vegetarian grab and go", "Juice Bar\nEvansdale Crossing\n7:00am - "
	    		+ "3:00pm\nhttp://ilovejuicebar.com");
	    restaurant.put("vegetarian casual", "Juice Bar\nEvansdale Crossing\n7:00am - 3:00"
	    		+ "pm\nhttp://ilovejuicebar.com"
	    		+ "\n\nThe Greenhouse\nStudent Health and CPASS\nM-F 8:00am - 4:30pm\n\nTaziki's"
	    		+ "\nEvansdale Crossing\n11:00am - 9:00pm\nhttp://tazikiscafe.com/menu-item");

	    
	    //******************************************************************************************************

		//PROGRAM FLOW
		BotA.greet_user(); //Greet user

		do { //While end_bot flag is false, continue conversation
			
			//Get the first input from the user
			System.out.println("What kind of food are you interested in? "
					+ "Here are some options:"); //Ask user what kind
			BotA.print_options(BotA.foodKinds);
			user_input_kind = input.nextLine();
			
			//Validate user input
			while (BotA.is_in_string_array(BotA.foodKinds, user_input_kind) == false) {
				//Is the response an exit message?
				if (BotA.is_in_string_array(BotA.exitMessages, user_input_kind)){

					System.out.println("I'm sorry to see you go so early!");
					BotA.good_bye(); //End conversation
				} else {
					//Try again for user input
					System.out.println("That is not a valid response. Try again?\nSelect from the following: \n");
					BotA.print_options(BotA.foodKinds);
					user_input_kind=input.nextLine();
				}
			}
			
			System.out.println("What type of food are you interested in? "
					+ "Here are some options:"); //Ask user what type
			BotA.print_options(BotA.foodTypes);
			user_input_type = input.nextLine();
			
			//Validate user input
			while (BotA.is_in_string_array(BotA.foodTypes, user_input_type) == false) {
				//Is the response an exit message?
				if (BotA.is_in_string_array(BotA.exitMessages, user_input_type)){
					System.out.println("I'm sorry to see you go so early!");
					BotA.good_bye(); //End conversation
				} else {
					//Try again for user input
					System.out.println("That is not a valid response. Try again?\nSelect from the following: \n");
					BotA.print_options(BotA.foodTypes);
					user_input_type=input.nextLine();
				}
			}
			
			//Evaluate and display results
			combined = (user_input_kind + " " + user_input_type).toLowerCase();
			String choice = (restaurant.get(combined));

			//Print out the user choice
			BotA.display_results(choice);
			

			//Check if user wants to restart
			System.out.println("\nDo you want to restart?");
			restart_bot=input.nextLine();
			if (BotA.is_in_string_array(BotA.exitMessages, restart_bot)) {
				Statement.conclusionOption(args);
			}

			} while (BotA.end_bot == false); //End program

		
		//End the conversation
		input.close();
		BotA.good_bye();

	}
}
