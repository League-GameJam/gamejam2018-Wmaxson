package oof;

import java.io.*;
import java.util.Random;
import java.util.Scanner;
public class oof {
	

	static int heroClass; //This is the class variable. 0 is Knight. 1 is archer. 2 is mage.
	static String heroClassName;
	static String heroName;
	static String weaponName;
	static String pathOne;
	static int heroMaxHP = 50;
	static int heroHp = 50;
	static int heroWeapon = 0;
	static int heroSpeed = 0;
	static int heroDmg = 5;
	static int heroGold =0;
	static String monsterName;
	static String monsterWeapon;
	static int monsterAttack;
	static String bp = "";
	/*
	1 = new
	2 = Wind Spirit
	
	
	
	
	
	
	
	*/
	public static void main(String[] args) {
		
		//fight("treeDerpah", 50, "swung his sword");
		beginGame();
		
		
	}
	//game
	public static void beginGame() {//defines the hero's class and name
			heroName = choice("You have washed up on the beach of an island with no idea how you got there. You can almost remember one thing. Your name \nwhat is it?"); // Defines the name variable.
			for (int i = 0; i < 1; i++) {
			String HCS = choice( heroName + "! That sounds like the name of a mighty hero.\nYou have a backpack on your back. Lets see whats inside.\nDo you see: a (A rustey broadsword), b(A bow with weak string), or c(A worn down staff ) \n(hint: type either a b or c below");
			if(HCS.equalsIgnoreCase("a")) {
			heroClass = 0;
			weaponName = "sword";
			heroClassName = "Knight";
			heroSpeed = 25;
			heroHp = 25;
			heroDmg = 7;
			beachVilla();
			} else if(HCS.equalsIgnoreCase("b")) {
			heroClass = 1;
			weaponName = "bow";
			heroClassName = "Archer";
			heroSpeed = 75;
			heroHp = 75;
			heroDmg = 3;
			beachVilla();
			} else if(HCS.equalsIgnoreCase("c")) {
			heroClass = 2;
			weaponName = "staff";
			heroClassName = "Mage";
			heroSpeed = 50;
			heroHp = 50;
			heroDmg = 5;
			beachVilla();
			} else {
			choice("Im sorry I didn't understand. Please repeat that with one of the letters A, B or C. (Type in the word okay to continue)");
				i--;
			}
		}
	}
	public static void beachVilla() { //Would you like to : a (Camp out on the beach) or b (Go into the forest)");

		pathOne = choice("Wow! you must have been a great " + heroClassName + "!\nYou look at your surroundings. Above the trees in the distence there is smoke! There might be a village. You start your journey into the forest.\n(type in anything anything to continue.)");
		for (int i = 0; i < 1; i++) {
		
			if (pathOne.equalsIgnoreCase(("sad")) ) {
			
				System.out.println("Ik right? me too m89");
				
			} else if (pathOne.equalsIgnoreCase(("okay")) ) { 
			
			villa();
				
			} else {
				
				villa();
			i--;
		}}
	}
	public static void villa() { // First Fight
		int a = 1;
		waitMessage("You arived at the village. It was chaos. Villagers where running around everywhere. In the center of it all is a giant storm spirit. \n"
	+ "It is blowing strong winds and tornados in every direction"
	+ "\nOne spots you, and runs up to you. "
	+ "\n???: Sir, do you know how to weild a " + weaponName + "? "
	+ "\nYou feel like you know how to use it. You take the " + weaponName + " from him, and run strait twords the eye of the storm\n", 1);
	Boolean didWin = fight("Wind Spirit", 25, "Blasted Air", 30, 6);
	
	if (didWin == false) {
		
	} else if (didWin == true) {
		waitMessage("The villagers cheered as the Wind Spirit slowly faded away. The villager who gave you the " + weaponName  + " came up to you. "
		+ "\n???: You just defeated on of the " + "Tempest\'s Minions" + " He is not going to like that."
		+ "\n???: You should try to defeat him before he reins terror on us all. I belive in you. "
		+ "\n???: Hey, by the way. What is your name? " + heroName + "? Thats a nice name. Sounds like the name of a true hero. My name is Jimmy James. "
		+ "\nJimmy: Im the local blacksmith, If you ever need me, I will be here at the village. "
		+ "\nOn the ground where you defeated the spirit, there lies a " + weaponName + ". "
		+ "\nJimmy: that is yours now. You won it. Its called a trophy"  ,1);
		heroDmg=10;
		heroGold+=30;
		weaponName = "wind " + weaponName;
		try {
			slowText("you got a"+weaponName+"!");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String mountainTrap = choice("You hear thunder. On top of one of the many mountens, there was a giant storm. \n"
		+ "Jimmy: It must be another one of the tempests minions. You better go up there quick before they make it to the village! \n"
		+ "Jimmy: Or... maybe we could let them, come to us... I could talk to the villagers about setting up defences. \n"
		+ "Jimmy: Its risky... but it could work. What would you like to do " + heroName + "?\n"
		+ "Would you like to: A (Let them come to us), or B (Fight them alone.)");
		
		if (mountainTrap.equalsIgnoreCase("a")) {
			
		} else if (mountainTrap.equalsIgnoreCase("b")) {
		mountain();	
		}
		
	}
	}
	public static void mountain() {
		
		String villageChoice = choice("Jimmy: Are you sure? "
				+ "\n... Alright then. If you are going into the mountains, you are going to need some tools. "
				+ "\nYou are going to need the help of my good friend, Bryn Rainbow."
				+ "\nShe is an alchmist, which means she makes potions. Why dont you head over to her shop? "
				+ "\n\nYou look around. The villagers are already rebuilding things. It looks like they have done it before"
				+ "\nWould you like to: "
				+ "\na (Talk to some of the villagers making houses)"
				+ "\nb (Help the villagers)"
				+ "\nor c (Go to Dr. Rainbows shop) "
				+ "\n\n[Warning. If you choose c, you wont be able to go back to choices a or b. Maybe you should do a or b first.]");
		
				if (villageChoice.equalsIgnoreCase("a")) {
					
				} else if (villageChoice.equalsIgnoreCase("b")) {
					
				} else if (villageChoice.equalsIgnoreCase("c")) {
					
				} 
	
	}
	public static void trap() {
		
	}
	public static void potShop() {
		String shopChoice = choice("When you walk into the shop you are greeted by the woman at the counter.\n"
			 + "Bryn: Hello! you must be " + heroName + "! Thank you ever so much for saving the village!\n"
			 + "Is there anything I can do for you? I have a few potions in stock. Would you like some?\n"
			 + "I will even give you one free Health potion in return for saving the village.\n"
			 + "Would you like to buy: a (Health potion), b (Strength potion) or c (a Speed potion)" );
		if (shopChoice.equalsIgnoreCase("a")) {
		choice("that will cost you 10 gold. You have " + heroGold + ". Would you like to buy it? (yes or no)");
 } else if (shopChoice.equalsIgnoreCase("b")) {
	 	choice("that will cost you 10 gold. You have " + heroGold + ". Would you like to buy it? (yes or no)");
 } else if (shopChoice.equalsIgnoreCase("b")) {
	 	choice("that will cost you 10 gold. You have " + heroGold + ". Would you like to buy it? (yes or no)");                  
		}
		
		}
	//Tools
	public static void slowText(String string) throws InterruptedException {
		for (int i = 0; i < string.length(); i++) {
			
			System.out.print(string.charAt(i));
			Thread.sleep(30);
		}
		System.out.println("");
		
	}
	public static String choice(String question) { //Asks the user a question, then receives input. 
		try {
			slowText(question);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //asks the question

		Scanner kb = new Scanner(System.in); //scans for input
		
		String in = kb.next(); //turns input into the "in" string 

			
		return in; //returns in.
		} 
	public static void waitMessage (String message, int time) {
		
		try {
			slowText(message);
			Thread.sleep(time * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	public static boolean stringBool(String strng) { // turns string into a boolean
		
		if(strng.equalsIgnoreCase("Yes") || strng.equalsIgnoreCase("yea") || strng.equalsIgnoreCase("yep") || strng.equalsIgnoreCase("affirmative") || strng.equalsIgnoreCase("uh huh") || strng.equalsIgnoreCase("Yus") || strng.equalsIgnoreCase("Yassssss Queen")) {
			return true;
		} else if(strng.equalsIgnoreCase("No")) {
		
		}
		return true;
	}
	public static boolean fight( String monsterNameTemp, int monsterMaxHealth, String monsterWeaponTemp, int monsterSpeed, int monsterAttackTemp ) {
		monsterWeapon = monsterWeaponTemp;
		int monsterCurrentHealth = monsterMaxHealth;
		monsterAttack = monsterAttackTemp;
		monsterName = monsterNameTemp;
		try {
			slowText("You enterd a battle with " + monsterName + "!");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; monsterCurrentHealth > 0; i++) {
			String oof = choice("Would you like to a (use your " + weaponName + " ), b(try to dodge the enemys upcoming attack) or c(use an item)");
			if (oof.equalsIgnoreCase("a")) {
				int  DMGdone = useSword();
				monsterCurrentHealth -= DMGdone;
				if (monsterCurrentHealth <= 0) {
					try {
						slowText("You did " + DMGdone + " Damage to " + monsterName);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					try {
						slowText("You have defeated " + monsterName + "!\n");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					return true;
					} else {
					try {
						slowText("You did " + DMGdone + " to " + monsterName + ". They have " + monsterCurrentHealth + "/" + monsterMaxHealth +" health left");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					int dmgTaken = mnstrUseWeapon();
					heroHp-=dmgTaken;
					try {
						slowText("You took " + dmgTaken + "/" + heroMaxHP + " Damage! You have " + heroHp + " left.");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if(heroHp <= 0) {
						waitMessage("Everything started to black away. ", 10);
						waitMessage("A voice fills you head. Its telling you, \nWake Up! You are needed! \n You where zipped back to a few minuts before. Don't die this time. ", 10);
						return false;
					} 
					}
					}else if(oof.equalsIgnoreCase("b")) {
				try {
					slowText(monsterName + " " + monsterWeapon + " ,but you dodged it!!");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
//						} else if( oof.equalsIgnoreCase("c")) {
//						if (bp.equals("")) {
//							
//						} else if
						}
					}
		return false;
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
		try {
			slowText("It sliced through " + monsterName);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if( heroWeapon == 0 ) {
			int randomInt = random.nextInt(heroDmg/2) + heroDmg;
			
			return randomInt;
		}
		return 0;
	}
	public static int useBow() {
	
	Random random = new Random();
	try {
		slowText("It peirced " + monsterName);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	if( heroWeapon == 0 ) {
		int randomInt = random.nextInt(3) + 7;
		
		return randomInt;
	}
	return 0;
}
	public static int useStaff() {

	
	Random random = new Random();
	try {
		slowText("It's magic blasted " + monsterName);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	if( heroWeapon == 0 ) {
		int randomInt = random.nextInt(3) + 7;
		
		return randomInt;
	}
	return 0;
}
	public static int mnstrUseWeapon() {
		
		Random random = new Random(); {
		try {
			slowText(monsterName + " " + monsterWeapon + " at " +heroName);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			int randomInt = random.nextInt(monsterAttack/3) + monsterAttack;
			return randomInt;

		}
	}
	public static void dmgPot() {
		try {
			slowText("You consumed the Strength potion!\n"
					+ "+ 5 Damage");
			heroDmg += 5 ;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void healPot() {
		try {
			slowText("You consumed the Health potion!\n"
					+ "+ 5 Health");
			heroHp += 5 ;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void speedPot() {
		try {
			slowText("You consumed the Speed potion!\n"
					+ "+ 10 Speed! ");
			heroSpeed += 10 ;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



}
