import java.util.Random;
import java.util.Scanner;
public class game {
	

	static int heroClass; //This is the class variable. 0 is Knight. 1 is mage. 2 is archer.
	static String heroClassName;
	static String heroName;
	static String pathOne;
	static String hp;
	static int weapon = 0;
	static String monsterName;
	
	/*
	0 = old
	1 = new
	2 = 
	
	
	
	
	
	
	*/
	public static void main(String[] args) {
		fight("treeDerpah", 50);
		beginGame();
		
	}

	public static void beginGame() {//defines the hero's class and name
			heroName = choice("You have washed up on the beach of an island with no idea how you got there. You can almost remember one thing. Your name \nwhat is it?"); // Defines the name variable.
			for (int i = 0; i < 1; i++) {
			String HCS = choice( heroName + "! That sounds like the name of a mighty hero.\nYou have a backpack on your back. Lets see whats inside.\nDo you see: a (A rustey broadsword), b(A bow with weak string), or c(A worn down staff ) \n(hint: type either a b or c below");
			if(HCS.equalsIgnoreCase("a")) {
			heroClass = 0;
			heroClassName = "Knight";
			beachVilla();
			} else if(HCS.equalsIgnoreCase("b")) {
			heroClass = 1;
			heroClassName = "Archer";
			beachVilla();
			} else if(HCS.equalsIgnoreCase("c")) {
			heroClass = 2;
			heroClassName = "Mage";
			beachVilla();
			} else {
			choice("Im sorry I didn't understand. Please repeat that with one of the letters A, B or C. (Type in the word okay to continue)");
				i--;
			}
		}
	}
	public static void beachVilla() { //Would you like to : a (Camp out on the beach) or b (Go into the forest)");

		pathOne = choice("Wow! you must have been a great " + heroClassName + "!\nYou look at your surroundings. Above the trees in the distence there is smoke! There might be a village! \n Would you like to : a (Camp out on the beach) or b (Go into the forest)");
		for (int i = 0; i < 1; i++) {
		
			if (pathOne.equalsIgnoreCase(("a")) ) {
			
			} else if (pathOne.equalsIgnoreCase(("a")) ) { 
			
			
			} else {
				
			choice("Im sorry I didn't understand. Please repeat that with one of the letters, a or b. (Type in the word 'okay' to continue)");
			i--;
		}}
	}
	public static void Villa() { //bossFight
	}
	
	
	
	
	
	//Tools
	public static String choice(String question) { //Asks the user a question, then receives input. 
		System.out.println(question); //asks the question

		Scanner kb = new Scanner(System.in); //scans for input
		
		String in = kb.next(); //turns input into the "in" string 

			
		return in; //returns in.
		} 
	public static boolean stringBool(String strng) { // turns string into a boolean
		
		if(strng.equalsIgnoreCase("Yes") || strng.equalsIgnoreCase("yea") || strng.equalsIgnoreCase("yep") || strng.equalsIgnoreCase("affirmative") || strng.equalsIgnoreCase("uh huh") || strng.equalsIgnoreCase("Yus") || strng.equalsIgnoreCase("Yassssss Queen")) {
			return true;
		} else if(strng.equalsIgnoreCase("No")) {
		
		}
		return true;
	}
	public static boolean fight( String monsterNameTemp, int maxHealth) {
		int currentHealth = maxHealth;
		monsterName = monsterNameTemp;
		choice("You enterd a battle with " + monsterName + "! \n");
		
		
		int DMGdone = useSword();
		currentHealth -= DMGdone;
		System.out.println("You did " + DMGdone + " to " + monsterName);
		return true;
		
	}
	public static int useSword() {
		
		Random random = new Random();
		System.out.println("It sliced through " + monsterName);
		if( weapon == 0 ) {
			int randomInt = random.nextInt(3) + 7;
			return randomInt;
		}
		return 0;
	}
	
}

