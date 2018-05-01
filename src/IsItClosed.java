import java.util.Scanner;
import java.awt.Color;

public class IsItClosed 
{
	static ImageUtils utils = new ImageUtils();
	
	public static void definedSearch(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
	System.out.println("\rFor now I only know dining locations that are affiliated with West Virginia University."
			+ "\nHopefuly in the future the one who made me will actually add more locations, but he is really lazy.\nSo...");
		
	while (true)
	{
		System.out.println("\rWhat place in Morgantown are you wondering the opening hours for?\n"
				+ "If you have no more locations you want to know about just type 'done'.\n"
				+ "If you want a list of locations I know please enter 'list'."
				+ "Then you can search by the number!");
		String location = input.nextLine();
		if (location.equalsIgnoreCase("done"))
		{
			break;
		}
		
		else if (location.equalsIgnoreCase("list"))
		{
			while (true)
			{
				System.out.println("What campus dining location are you looking for?");
				String campus = input.nextLine();
			if  (campus.equalsIgnoreCase("Evansdale"))
			{
			System.out.println("Here is a list of the locations I can provide times for!\n"
					+ "0 Panini Pete's\n"
					+ "1 Juice Bar\n"
					+ "2 Little Donkey\n"
					+ "3 Hugh-Baby's\n"
					+ "4 Taziki's\n"
					+ "5 Two Birds"
					+ "13 Cafe Evansdale\n"
					+ "15 Cavanaugh's"
					+ "16 da Vinci's"
					+ "17 Park Place"
					+ "18 Bits & Bytes"
					+ "19 Brew'n Gold Cafe"
					+ "20 The Greenhouse"
					+ "21 Lyon's Den");
				break;
			}
			else if (campus.equalsIgnoreCase("downtown"))
			{
				System.out.println("Here is a list of the locations I can provide times for!\n"
						+ "4 Taziki's\n"
						+ "6 Burger King\n"
						+ "7 Chick-fil-a\n"
						+ "8 Hatfields\n"
						+ "9 Sabarro\n"
						+ "10 Saikou Sushi\n"
						+ "11 Which Wich\n"
						+ "12 Boreman Bistro\n"
						+ "14 Summit Cafe\n"
						+ "22 Suumit Grab'n Go"
						+ "24 Eliza's\n"
						+ "25 Terrace Room\n");
				break;
			}
			}
			continue;
		}
		
		else if ((location.equalsIgnoreCase("Panini Pete's")) ||
		(location.equalsIgnoreCase("0")))
		{
			Color[][] orig = utils.loadImage("Pictures/PaniniPetes.PNG");
			
			utils.addImage(orig, "Panini Pete's");
			utils.display();
			
			System.out.println("If you wish to see their menu go to:http://www.paninipetes.com/menu/ "
					+ "\n hours for this dining location are:\n"
					+ "Monday - Friday  7:30am - 9pm\r\n" + 
					"\r\n" + 
					"Saturday & Sunday  11:00am - 9pm\r\n" + 
					"\r\n" + 
					"Hours subject to seasonal change.\r");
			
		while(true) {	
			System.out.println("Continue?(Yes/No)");
			
		 String Ans = input.nextLine();
		 if (Ans.equalsIgnoreCase("yes")) {
		    	break;
		    }
		    else if(Ans.equalsIgnoreCase("no")) {
		    	System.out.println("OK, system shutting down.");
		    	Statement.conclusionOption(args);
		    }
		    else {
		    	continue;
		    }
		}
		utils.closeImages();
		continue;
		
		}
		
		else if ((location.equalsIgnoreCase("Juice Bar")) ||
		(location.equalsIgnoreCase("1")))
		{
			
			Color[][] orig = utils.loadImage("Pictures/JuiceBar.PNG");
			
			utils.addImage(orig, "Juice Bar");
			utils.display();
			
			System.out.println("If you wish to see their menu go to: http://ilovejuicebar.com/our-menu/"
					+ "\nthe opening hours for this location is:\r"
					+ "m ñ f  7:30 am ñ 9 pm\r\n" + 
					"sat  11 am ñ 9 pm\r\n" + 
					"sun  11 am  ñ 9 pm\r");
			
			while(true) {	
				System.out.println("Continue?(Yes/No)");
				
			 String Ans = input.nextLine();
			 if (Ans.equalsIgnoreCase("yes")) {
			    	break;
			    }
			    else if(Ans.equalsIgnoreCase("no")) {
			    	System.out.println("OK, system shutting down.");
			    	Statement.conclusionOption(args);
			    }
			    else {
			    	continue;
			    }
			}
			utils.closeImages();
			continue;
			
		}
		else if ((location.equalsIgnoreCase("Little Donkey")) ||
		(location.equalsIgnoreCase("2")))
		{
			Color[][] orig = utils.loadImage("Pictures/LittleDonkey.PNG");
			
			utils.addImage(orig, "Little Donkey");
			utils.display();

			System.out.println("If you wish to see their menu go to: https://www.thelittledonkey.com/\n"
					+ "The opening hours for this location are:\r"
					+ "Sun-Thurs 11am-9:30pm\r"
					+ "Fri-Sat 11am-10:30pm\r");
			
			while(true) {	
				System.out.println("Continue?(Yes/No)");
				
			 String Ans = input.nextLine();
			 if (Ans.equalsIgnoreCase("yes")) {
			    	break;
			    }
			    else if(Ans.equalsIgnoreCase("no")) {
			    	System.out.println("OK, system shutting down.");
			    	Statement.conclusionOption(args);
			    }
			    else {
			    	continue;
			    }
			}
			utils.closeImages();
			continue;
		}
		
		else if ((location.equalsIgnoreCase("Hugh-Baby's")) ||
		(location.equalsIgnoreCase("3")))
		{

			Color[][] orig = utils.loadImage("Pictures/Hugh-Baby's.PNG");
			
			utils.addImage(orig, "Hugh-Baby's");
			utils.display();
			
			System.out.println("If you wish to see their menu go to: https://www.hughbabys.com/menu-1/\n"
					+ "this location's open hours are:\r"
					+ "11am-9pm, Seven Days a Week\r");
			
			while(true) {	
				System.out.println("Continue?(Yes/No)");
				
			 String Ans = input.nextLine();
			 if (Ans.equalsIgnoreCase("yes")) {
			    	break;
			    }
			    else if(Ans.equalsIgnoreCase("no")) {
			    	System.out.println("OK, system shutting down.");
			    	Statement.conclusionOption(args);
			    }
			    else {
			    	continue;
			    }
			}
			utils.closeImages();
			continue;
		}
		
		else if ((location.equalsIgnoreCase("Taziki's")) ||
				(location.equalsIgnoreCase("4")))
		{

			Color[][] orig = utils.loadImage("Pictures/Taziki's.PNG");
			
			utils.addImage(orig, "Taziki's");
			utils.display();
			
			System.out.println("If you wish to see their menu go to: http://tazikiscafe.com/menu-item/"
					+ "\nthis location is open on the Evnsdale location:\r"
					+ "MON - SAT:	11:15 AM - 8:45 PM\r\n" + 
					"SUN:	12 PM - 8:45 PM\r\n" + 
					"\rFor the Downtown location:\r\n"+
					"MON - WED:	11:15 AM - 9:45 PM\r\n" + 
					"THU - SAT:	11:15 AM - 8:45 PM\r\n" + 
					"SUN:	2:15 PM - 8:45 PM\r");
			
			while(true) {	
				System.out.println("Continue?(Yes/No)");
				
			 String Ans = input.nextLine();
			 if (Ans.equalsIgnoreCase("yes")) {
			    	break;
			    }
			    else if(Ans.equalsIgnoreCase("no")) {
			    	System.out.println("OK, system shutting down.");
			    	Statement.conclusionOption(args);
			    }
			    else {
			    	continue;
			    }
			}
			utils.closeImages();
			continue;
		}
		
		else if ((location.equalsIgnoreCase("Two Birds")) ||
				(location.equalsIgnoreCase("5")))
		{
Color[][] orig = utils.loadImage("Pictures/TwoBirds.PNG");
			
			utils.addImage(orig, "Two Birds");
			utils.display();
			
			System.out.println("If you wish to see their menu go to: http://www.twobirdsrestaurant.com/menu/ "
					+ "\nThis locations times are:\n\r"
					+ "Mon- Fri 7:30 to 9:00\r\n" + 
					"Sat & Sun 11:00 to 9:00\r");
			
			while(true) {	
				System.out.println("Continue?(Yes/No)");
				
			 String Ans = input.nextLine();
			 if (Ans.equalsIgnoreCase("yes")) {
			    	break;
			    }
			    else if(Ans.equalsIgnoreCase("no")) {
			    	System.out.println("OK, system shutting down.");
			    	Statement.conclusionOption(args);
			    }
			    else {
			    	continue;
			    }
			}
			utils.closeImages();
			continue;
		}
		else if ((location.equalsIgnoreCase("Burger King")) ||
				(location.equalsIgnoreCase("6")))
		{
			Color[][] orig = utils.loadImage("Pictures/BurgerKind.PNG");
			
			utils.addImage(orig, "Burger King");
			utils.display();

			
			System.out.println("If you wish to see their menu go to: https://www.bk.com/menu \n"
					+ "Here are the times for this location:"
					+ "/nMonday - Friday\r\n" + 
					"7:30 am ñ 9:00 pm\r\n" + 
					"Saturday\r\n" + 
					"Noon ñ 9:00 pm\r\n" + 
					"Sunday\r\n" + 
					"3:00 pm ñ 9:00 pm\n");
			
			while(true) {	
				System.out.println("Continue?(Yes/No)");
				
			 String Ans = input.nextLine();
			 if (Ans.equalsIgnoreCase("yes")) {
			    	break;
			    }
			    else if(Ans.equalsIgnoreCase("no")) {
			    	System.out.println("OK, system shutting down.");
			    	Statement.conclusionOption(args);
			    }
			    else {
			    	continue;
			    }
			}
			utils.closeImages();
			continue;
		}
			
		else if ((location.equalsIgnoreCase("Chick-Fil-A")) ||
				(location.equalsIgnoreCase("7")))
		{
			Color[][] orig = utils.loadImage("Pictures/Chick.PNG");
			
			utils.addImage(orig, "Chick-Fil-A");
			utils.display();

			System.out.println("If you wish to see their menu go to: https://www.chick-fil-a.com/\n"
					+ "This locations operating hours are:\n"
					+ "Monday - Friday\r\n" + 
					"7:30 am ñ 9:00 pm\r\n" + 
					"Saturday\r\n" + 
					"Noon ñ 9:00 pm\r\n" + 
					"Sunday\r\n" + 
					"Closed\r");
			
			while(true) {	
				System.out.println("Continue?(Yes/No)");
				
			 String Ans = input.nextLine();
			 if (Ans.equalsIgnoreCase("yes")) {
			    	break;
			    }
			    else if(Ans.equalsIgnoreCase("no")) {
			    	System.out.println("OK, system shutting down.");
			    	Statement.conclusionOption(args);
			    }
			    else {
			    	continue;
			    }
			}
			utils.closeImages();
			continue;
		}
		else if ((location.equalsIgnoreCase("Hatfields")) ||
				(location.equalsIgnoreCase("8")))
		{
			Color[][] orig = utils.loadImage("Pictures/Hatfields.PNG");
			
			utils.addImage(orig, "Hatfields");
			utils.display();
			
			System.out.println("If you wish to see their menu go to: https://diningservices.wvu.edu/menus/hatfields-weekly-menus"
					+ "\n The hours of operation for this location are:"
					+ "Monday ñ Friday\r\n" + 
					"Breakfast: 7:15 am - 10:00 am\r\n" + 
					"Lunch: 11:00 am - 2:00 pm\r\n" + 
					"Saturday, Sunday & Holidays\r\n" + 
					"Closed\r");
			
			while(true) {	
				System.out.println("Continue?(Yes/No)");
				
			 String Ans = input.nextLine();
			 if (Ans.equalsIgnoreCase("yes")) {
			    	break;
			    }
			    else if(Ans.equalsIgnoreCase("no")) {
			    	System.out.println("OK, system shutting down.");
			    	Statement.conclusionOption(args);
			    }
			    else {
			    	continue;
			    }
			}
			utils.closeImages();
			continue;
		}
		
		else if ((location.equalsIgnoreCase("Sabarro")) ||
				(location.equalsIgnoreCase("9")))
		{

			Color[][] orig = utils.loadImage("Pictures/sabarro.PNG");
			
			utils.addImage(orig, "Sabarro");
			utils.display();
			
			System.out.println("If you wish to see their menu go to: https://sbarro.com/menu/"
					+ "\n The hours that this location is open are:"
					+ "Monday - Thursday\r\n" + 
					"10:30 am ñ 10:00 pm\r\n" + 
					"Friday\r\n" + 
					"10:30 am ñ 9:00 pm\r\n" + 
					"Saturday\r\n" + 
					"Noon ñ 9:00 pm\r\n" + 
					"Sunday\r\n" + 
					"2:00 pm ñ 9:00 pm");
			
			while(true) {	
				System.out.println("Continue?(Yes/No)");
				
			 String Ans = input.nextLine();
			 if (Ans.equalsIgnoreCase("yes")) {
			    	break;
			    }
			    else if(Ans.equalsIgnoreCase("no")) {
			    	System.out.println("OK, system shutting down.");
			    	Statement.conclusionOption(args);
			    }
			    else {
			    	continue;
			    }
			}
			utils.closeImages();
			continue;
		}
		else if ((location.equalsIgnoreCase("Saikou Sushi")) ||
				(location.equalsIgnoreCase("10")))
		{
			Color[][] orig = utils.loadImage("Pictures/SaikouSushi.PNG");
			
			utils.addImage(orig, "Saikou Sushi");
			utils.display();
			
			System.out.println("If you wish to see their menu go to: http://www.saikousushi.com/Menu-Items.html\n"
					+ "This locations operation hours are:\n"
					+ "Monday ñ Friday\r\n" + 
					"10:00 am - 7:00 pm\r\n" + 
					"Saturday\r\n" + 
					"Noon - 7:00 pm\r\n" + 
					"Sunday\r\n" + 
					"Closed\r");
			
			while(true) {	
				System.out.println("Continue?(Yes/No)");
				
			 String Ans = input.nextLine();
			 if (Ans.equalsIgnoreCase("yes")) {
			    	break;
			    }
			    else if(Ans.equalsIgnoreCase("no")) {
			    	System.out.println("OK, system shutting down.");
			    	Statement.conclusionOption(args);
			    }
			    else {
			    	continue;
			    }
			}
			utils.closeImages();
			continue;
		}
		
		else if ((location.equalsIgnoreCase("Which Wich")) ||
				(location.equalsIgnoreCase("11")))
		{
			Color[][] orig = utils.loadImage("Pictures/WhichWich.PNG");
			
			utils.addImage(orig, "Which Wich");
			utils.display();

			
			System.out.println("If you wish to see their menu go to: https://www.whichwich.com/menu/\n"
					+ "This locations operating hours are:"
					+ "Monday - Thursday\r\n" + 
					"10:30 am ñ 10:00 pm\r\n" + 
					"Friday\r\n" + 
					"10:30 am ñ 9:00 pm\r\n" + 
					"Saturday\r\n" + 
					"Noon ñ 9:00 pm\r\n" + 
					"Sunday\r\n" + 
					"2:00 pm ñ 9:00 pm\r");
			
			while(true) {	
				System.out.println("Continue?(Yes/No)");
				
			 String Ans = input.nextLine();
			 if (Ans.equalsIgnoreCase("yes")) {
			    	break;
			    }
			    else if(Ans.equalsIgnoreCase("no")) {
			    	System.out.println("OK, system shutting down.");
			    	Statement.conclusionOption(args);
			    }
			    else {
			    	continue;
			    }
			}
			utils.closeImages();
			continue;
		}
		
		else if ((location.equalsIgnoreCase("Boreman Bistro")) ||
				(location.equalsIgnoreCase("12")))
		{
			Color[][] orig = utils.loadImage("Pictures/Bistro.PNG");
			
			utils.addImage(orig, "Boreman Bistro");
			utils.display();
			
			System.out.println("If you wish to see their menu go to: https://diningservices.wvu.edu/about/locations/dining-halls/boreman-bistro"
					+ "\nThe operating hours are:\n"
					+ "Monday - Friday\r\n" + 
					"11:00 am - 7:00 pm\r\n" + 
					"Saturday, Sunday & Holidays\r\n" + 
					"9:00 am - 7:00 pm/r");
			
			while(true) {	
				System.out.println("Continue?(Yes/No)");
				
			 String Ans = input.nextLine();
			 if (Ans.equalsIgnoreCase("yes")) {
			    	break;
			    }
			    else if(Ans.equalsIgnoreCase("no")) {
			    	System.out.println("OK, system shutting down.");
			    	Statement.conclusionOption(args);
			    }
			    else {
			    	continue;
			    }
			}
			utils.closeImages();
			continue;
		}
		
		else if ((location.equalsIgnoreCase("Cafe Evansdale")) ||
				(location.equalsIgnoreCase("13")))
		{
			Color[][] orig = utils.loadImage("Pictures/Evansdale.PNG");
			
			utils.addImage(orig, "Cafe Evansdale");
			utils.display();
			
			System.out.println("If you wish to see their menu go to: https://diningservices.wvu.edu/about/locations/dining-halls/cafe-evansdale\n"
					+ "The operating hours for this location are:\r"
					+ "Monday - Thursday\r\n" + 
					"7:00 am ñ 8:00 pm\r\n" + 
					"Friday\r\n" + 
					"7:00 am ñ 6:30 pm\r\n" + 
					"Saturday & Holidays\r\n" + 
					"9:00 am ñ 6:30 pm\r\n" + 
					"Sunday\r\n" + 
					"9:00 am ñ 7:30 pm\r");
			
			while(true) {	
				System.out.println("Continue?(Yes/No)");
				
			 String Ans = input.nextLine();
			 if (Ans.equalsIgnoreCase("yes")) {
			    	break;
			    }
			    else if(Ans.equalsIgnoreCase("no")) {
			    	System.out.println("OK, system shutting down.");
			    	Statement.conclusionOption(args);
			    }
			    else {
			    	continue;
			    }
			}
			utils.closeImages();
			continue;
		}
		
		else if ((location.equalsIgnoreCase("Summit Cafe")) ||
				(location.equalsIgnoreCase("14")))
		{
			Color[][] orig = utils.loadImage("Pictures/Summit.PNG");
			
			utils.addImage(orig, "Summit Cafe");
			utils.display();
			
			System.out.println("If you wish to see their menu go to: https://diningservices.wvu.edu/about/locations/dining-halls/summit-cafe\r\n" + 
					""
					+ "\nThe operating hours are:\n"
					+ "Monday ñ Friday\r\n" + 
					"7:00 am - 7:00 pm\r\n" + 
					"Saturday, Sunday & Holidays\r\n" + 
					"11:00 am - 6:30 pm\r");
			
			while(true) {	
				System.out.println("Continue?(Yes/No)");
				
			 String Ans = input.nextLine();
			 if (Ans.equalsIgnoreCase("yes")) {
			    	break;
			    }
			    else if(Ans.equalsIgnoreCase("no")) {
			    	System.out.println("OK, system shutting down.");
			    	Statement.conclusionOption(args);
			    }
			    else {
			    	continue;
			    }
			}
			utils.closeImages();
			continue;
		}
		
		else if ((location.equalsIgnoreCase("Terrace Room")) ||
				(location.equalsIgnoreCase("25")))
		{
			Color[][] orig = utils.loadImage("Pictures/Terrace.PNG");
			
			utils.addImage(orig, "Terrace Room");
			utils.display();
			
			System.out.println("If you wish to see their menu go to: https://diningservices.wvu.edu/about/locations/dining-halls/terrace-room\n"
					+ "The operating hours of this location are:\n"
					+ "Monday ñ Thursday\r\n" + 
					"11:00 am - 8:00 pm\r\n" + 
					"Friday\r\n" + 
					"11:00 am ñ 2:00 pm\r\n" + 
					"Saturday, Sunday & Holidays\r\n" + 
					"10:00am - 2:00pm\r");
			
			while(true) {	
				System.out.println("Continue?(Yes/No)");
				
			 String Ans = input.nextLine();
			 if (Ans.equalsIgnoreCase("yes")) {
			    	break;
			    }
			    else if(Ans.equalsIgnoreCase("no")) {
			    	System.out.println("OK, system shutting down.");
			    	Statement.conclusionOption(args);
			    }
			    else {
			    	continue;
			    }
			}
			utils.closeImages();
			continue;
		}
		
		else if ((location.equalsIgnoreCase("CAVANAUGH'S")) ||
				(location.equalsIgnoreCase("15")))
		{
			Color[][] orig = utils.loadImage("Pictures/Cavanaugh's.PNG");
			
			utils.addImage(orig, "CAVANAUGH'S");
			utils.display();

			System.out.println("This is located on the medical campus.\n"
					+ "The operating hours of this location are:\r"
					+ "Monday - Friday\r\n" + 
					"7:00 am - 4:30 pm\r\n" + 
					"Saturday, Sunday & Holidays\r\n" + 
					"Closed\r");
			
			while(true) {	
				System.out.println("Continue?(Yes/No)");
				
			 String Ans = input.nextLine();
			 if (Ans.equalsIgnoreCase("yes")) {
			    	break;
			    }
			    else if(Ans.equalsIgnoreCase("no")) {
			    	System.out.println("OK, system shutting down.");
			    	Statement.conclusionOption(args);
			    }
			    else {
			    	continue;
			    }
			}
			utils.closeImages();
			continue;
		}
		
		else if ((location.equalsIgnoreCase("Da Vinci's")) ||
				(location.equalsIgnoreCase("16")))
		{
			Color[][] orig = utils.loadImage("Pictures/da Vinci's.PNG");
			
			utils.addImage(orig, "Da Vinci's");
			utils.display();
			
			System.out.println("Small coffee shop located in the Evensdale library."
					+ "\nOperating hours:\n"
					+ "Monday ñ Thursday\r\n" + 
					"8:00 am - 9:00 pm\r\n" + 
					"Friday\r\n" + 
					"8:00 am ñ 2:00 pm\r\n" + 
					"Saturday & Holidays\r\n" + 
					"Closed\r\n" + 
					"Sunday\r\n" + 
					"2:00 pm - 9:00 pm\r");
			
			while(true) {	
				System.out.println("Continue?(Yes/No)");
				
			 String Ans = input.nextLine();
			 if (Ans.equalsIgnoreCase("yes")) {
			    	break;
			    }
			    else if(Ans.equalsIgnoreCase("no")) {
			    	System.out.println("OK, system shutting down.");
			    	Statement.conclusionOption(args);
			    }
			    else {
			    	continue;
			    }
			}
			utils.closeImages();
			continue;
		}
		
		else if ((location.equalsIgnoreCase("Park Place")) ||
				(location.equalsIgnoreCase("17")))
		{
			
			Color[][] orig = utils.loadImage("Pictures/ParkPlace.PNG");
			
			utils.addImage(orig, "Park Place");
			utils.display();

			System.out.println("The go to place for Oakland residence that do not want to leave the comfort of their home.\n"
					+ "Operating hours are:\n"
					+ "Monday-Thursday\r\n" + 
					"7am - 9pm\r\n" + 
					"Friday \r\n" + 
					"7am - 7pm\r\n" + 
					"Saturday & Sunday\r\n" + 
					"11am - 7pm\r");
			
			while(true) {	
				System.out.println("Continue?(Yes/No)");
				
			 String Ans = input.nextLine();
			 if (Ans.equalsIgnoreCase("yes")) {
			    	break;
			    }
			    else if(Ans.equalsIgnoreCase("no")) {
			    	System.out.println("OK, system shutting down.");
			    	Statement.conclusionOption(args);
			    }
			    else {
			    	continue;
			    }
			}
			utils.closeImages();

			continue;
		}
		
		else if ((location.equalsIgnoreCase("Bits & Bytes")) ||
				(location.equalsIgnoreCase("18")))
		{
			Color[][] orig = utils.loadImage("Pictures/Bits&Bytes.PNG");
			
			utils.addImage(orig, "Bits & Bytes");
			utils.display();
			
			System.out.println("Engineers go to for a quick byte to eat.\n"
					+ "Operating hours are:\n"
					+ "Monday ñ Friday\r\n" + 
					"7:30 am - 4:00 pm\r\n" + 
					"Saturday, Sunday & Holidays\r\n" + 
					"Closed\r");
			
			while(true) {	
				System.out.println("Continue?(Yes/No)");
				
			 String Ans = input.nextLine();
			 if (Ans.equalsIgnoreCase("yes")) {
			    	break;
			    }
			    else if(Ans.equalsIgnoreCase("no")) {
			    	System.out.println("OK, system shutting down.");
			    	Statement.conclusionOption(args);
			    }
			    else {
			    	continue;
			    }
			}
			utils.closeImages();
			continue;
		}
		
		else if ((location.equalsIgnoreCase("Brew 'N Gold Cafe")) ||
				(location.equalsIgnoreCase("19")))
		{
			Color[][] orig = utils.loadImage("Pictures/Brew'NGold.PNG");
			
			utils.addImage(orig, "Brew 'N Gold Cafe");
			utils.display();
			
			System.out.println("Towers grab 'n go.\n"
					+ "Monday ñ Friday\r\n" + 
					"7:00 am - 9:00 pm\r");
			
			while(true) {	
				System.out.println("Continue?(Yes/No)");
				
			 String Ans = input.nextLine();
			 if (Ans.equalsIgnoreCase("yes")) {
			    	break;
			    }
			    else if(Ans.equalsIgnoreCase("no")) {
			    	System.out.println("OK, system shutting down.");
			    	Statement.conclusionOption(args);
			    }
			    else {
			    	continue;
			    }
			}
			utils.closeImages();
			continue;
		}
		
		else if ((location.equalsIgnoreCase("The Greenhouse")) ||
				(location.equalsIgnoreCase("20")))
		{
			System.out.println("Located in the CPASS building over looking the out door rec fields.\n"
					+ "Operating hours are:\n"
					+ "Monday ñ Friday\r\n" + 
					"8:30 am - 3:00 pm\r");
				continue;
		}
		
		else if ((location.equalsIgnoreCase("Lyon's Den")) ||
				(location.equalsIgnoreCase("21")))
		{
			System.out.println("Evensdale residents late night snack grab.\n"
					+ "Operating hours:\n"
					+ "Sunday ñ Thursday\r\n" + 
					"7:00 pm - 1:00 am\r\n" + 
					"Friday, Saturday & Holidays\r\n" + 
					"Closed\r");
			
			while(true) {	
				System.out.println("Continue?(Yes/No)");
				
			 String Ans = input.nextLine();
			 if (Ans.equalsIgnoreCase("yes")) {
			    	break;
			    }
			    else if(Ans.equalsIgnoreCase("no")) {
			    	System.out.println("OK, system shutting down.");
			    	Statement.conclusionOption(args);
			    }
			    else {
			    	continue;
			    }
			}
			utils.closeImages();
			   continue;
			}
			
			else if ((location.equalsIgnoreCase("Summit Grab 'N Go")) ||
					(location.equalsIgnoreCase("22")))
			{
				System.out.println("It's in the name.\n"
						+ "Operating hours are:\n"
						+ "Monday ñ Friday\r\n" + 
						"11 am - 9:00 pm\r\n" + 
						"Saturday, Sunday & Holidays\r\n" + 
						"Closed\r");
				
				while(true) {	
					System.out.println("Continue?(Yes/No)");
					
				 String Ans = input.nextLine();
				 if (Ans.equalsIgnoreCase("yes")) {
				    	break;
				    }
				    else if(Ans.equalsIgnoreCase("no")) {
				    	System.out.println("OK, system shutting down.");
				    	Statement.conclusionOption(args);
				    }
				    else {
				    	continue;
				    }
				}
				utils.closeImages();
				continue;
			}
		
			else if ((location.equalsIgnoreCase("WaterFront Cafe")) ||
					(location.equalsIgnoreCase("23")))
			{
				System.out.println("WaterFront Cafe: Oof the page is litteraly blank. Gj you know this place, it is hidden within this code!\n\r");
				
				while(true) {	
					System.out.println("Continue?(Yes/No)");
					
				 String Ans = input.nextLine();
				 if (Ans.equalsIgnoreCase("yes")) {
				    	break;
				    }
				    else if(Ans.equalsIgnoreCase("no")) {
				    	System.out.println("OK, system shutting down.");
				    	Statement.conclusionOption(args);
				    }
				    else {
				    	continue;
				    }
				}
				utils.closeImages();
				continue;
			}
			
			else if ((location.equalsIgnoreCase("Eliza's")) ||
					(location.equalsIgnoreCase("24")))
			{
				
				Color[][] orig = utils.loadImage("Pictures/Eliza's.PNG");
				
				utils.addImage(orig, "Eliza's");
				utils.display();

				System.out.println("A quick snack while in the downtown library.\n"
						+ "The time of operation for this location:\n"
						+ "Monday ñ Wednesday\r\n" + 
						"8:00 am - 12:00 am\r\n" + 
						"Thursday\r\n" + 
						"8:00 am ñ 9:00 pm\r\n" + 
						"Friday\r\n" + 
						"8:00 am ñ 2:00 pm\r\n" + 
						"Sunday\r\n" + 
						"3:00 pm - 12:00 am\r");
				
				while(true) {	
					System.out.println("Continue?(Yes/No)");
					
				 String Ans = input.nextLine();
				 if (Ans.equalsIgnoreCase("yes")) {
				    	break;
				    }
				    else if(Ans.equalsIgnoreCase("no")) {
				    	System.out.println("OK, system shutting down.");
				    	Statement.conclusionOption(args);
				    }
				    else {
				    	continue;
				    }
				}
				utils.closeImages();
				continue;
			}
		
		else
		{
			System.out.println("I'm sorry but I do not know that location.\n"
					+ "Please check your spelling.\n"
					+ "Some locations need an exact name for me to understand.\n"
					+ "I also do not know everything,\nso there is a chance that the dude who made me missed a place and ill let him know\n"
					+ "(I actually can not sorry, he doesnt know how to program that).");
		}
	}
  }
}


