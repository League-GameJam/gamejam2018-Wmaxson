import java.util.Random;
import java.util.Scanner;
public class game {
	

	static int heroClass; //This is the class variable. 0 is Knight. 1 is archer. 2 is mage.
	static String heroClassName;
	static String heroName;
	static String pathOne;
	static int heroHp = 100;
	static int heroWeapon = 0;
	static int heroSpeed = 0;
	static String monsterName;
	static String monsterWeapon;
	static int monsterAttack;
	
	/*
	0 = old
	1 = new
	2 = 
	
	
	
	
	
	
	*/
	public static void main(String[] args) {
		fight("treeDerpah", 50, "swung his sword");
		//beginGame();
		
	}

	public static void beginGame() {//defines the hero's class and name
			heroName = choice("You have washed up on the beach of an island with no idea how you got there. You can almost remember one thing. Your name \nwhat is it?"); // Defines the name variable.
			for (int i = 0; i < 1; i++) {
			String HCS = choice( heroName + "! That sounds like the name of a mighty hero.\nYou have a backpack on your back. Lets see whats inside.\nDo you see: a (A rustey broadsword), b(A bow with weak string), or c(A worn down staff ) \n(hint: type either a b or c below");
			if(HCS.equalsIgnoreCase("a")) {
			heroClass = 0;
			heroClassName = "Knight";
			heroSpeed = 25;
			
			beachVilla();
			} else if(HCS.equalsIgnoreCase("b")) {
			heroClass = 1;
			heroClassName = "Archer";
			heroSpeed = 75;
			beachVilla();
			} else if(HCS.equalsIgnoreCase("c")) {
			heroClass = 2;
			heroClassName = "Mage";
			heroSpeed = 50;
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
				
			choice("Im sorry I didn't understand. Please repeat that with one of the letters, a or b.");
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
	public static void fight( String monsterNameTemp, int monsterMaxHealth, String monsterWeaponTemp, int monsterSpeed, int monsterAttackTemp ) {
		monsterWeapon = monsterWeaponTemp;
		int monsterCurrentHealth = monsterMaxHealth;
		monsterAttack = monsterAttackTemp;
		monsterName = monsterNameTemp;
		boolean tryToDodge = false;
		System.out.println("You enterd a battle with " + monsterName + "!");
		for (int i = 0; monsterCurrentHealth > 0; i++) {
			tryToDodge = false;
			String oof = choice("Would you like to a (use your sword) or, b(try to dodge the enemys upcoming attack)  ");
			if (oof.equalsIgnoreCase("a")) {
				int  DMGdone = useSword();
				monsterCurrentHealth -= DMGdone;
				if (monsterCurrentHealth < 0) {
					System.out.println("You did " + DMGdone + " Damage to " + monsterName);
					System.out.println("You have defeated " + monsterName + "!");
			//return true;
				} else {
					System.out.println("You did " + DMGdone + " to " + monsterName + ". They have " + monsterCurrentHealth + "/" + monsterMaxHealth +" health left");
				} 
			}else if(oof.equalsIgnoreCase("b")) {
				tryToDodge = true;
			}
			if(tryToDodge = true && monsterSpeed < heroSpeed) {
				System.out.println(monsterName + "swung his " + monsterWeapon + " ,but you dodged it!!");
			} else if(tryToDodge = false) {
				mnstrUseWeapon();
			}
			
		//return false;
		}
	}
	public static int useWeapon() {
		if(heroClass == 0) { 
			return useSword();
		} else if(heroClass == 1) { 
			return useBow();
		} else if(heroClass == 2) { 
			return useStaff();
		} else {
			return 0;
		}
		
	
		
	}
	public static int useSword() {
		
		Random random = new Random();
		System.out.println("It sliced through " + monsterName);
		if( heroWeapon == 0 ) {
			int randomInt = random.nextInt(3) + 7;
			
			return randomInt;
		}
		return 0;
	}
	public static int useBow() {
	
	Random random = new Random();
	System.out.println("It peirced " + monsterName);
	if( heroWeapon == 0 ) {
		int randomInt = random.nextInt(3) + 7;
		
		return randomInt;
	}
	return 0;
}
	public static int useStaff() {

	
	Random random = new Random();
	System.out.println("It's magic blasted " + monsterName);
	if( heroWeapon == 0 ) {
		int randomInt = random.nextInt(3) + 7;
		
		return randomInt;
	}
	return 0;
}
	public static int mnstrUseWeapon() {
		Random random = new Random();
		System.out.println(monsterName + " " + monsterWeapon + " at " +heroName);
			int randomInt = random.nextInt(monsterAttack/3) + monsterAttack;
			return randomInt;
	}
	
}


