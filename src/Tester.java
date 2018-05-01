import java.util.Scanner;

public class Tester {
		static	Scanner input = new Scanner(System.in);

			public static void main(String[] args) {
				while(true) {
				Statement.intro(args);
				String Ans = input.nextLine();
				
				if(Ans.equalsIgnoreCase("1")) {
				TipBot_modified.main(args);
				continue;
				}
					
				else if(Ans.equalsIgnoreCase("2")) {
					IsItClosed.definedSearch(args);
				}
				
				else if(Ans.equalsIgnoreCase("3")) {
					RestaurantBotMain.main(args);
				}
				
				else if(Ans.equalsIgnoreCase("4")) {
					Statement.conclusionFinal(args);
				}
			}
		}
}
