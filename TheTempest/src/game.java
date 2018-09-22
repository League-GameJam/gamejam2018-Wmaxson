package theTempest;

import java.io.*;
import java.util.Random;
import java.util.Scanner;
public class game {
	

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
	static int hpPot = 0;
	static int atkPot = 0;
	static int spdPot = 0;
	static String monsterName;
	static String monsterWeapon;
	static int monsterAttack;
	static String bp = "";
	static boolean hasPot = false;
	static boolean succ = false;
	/*
	1 = new
	2 = Wind Spirit
	
	
	
	
	
	
	
	*/
	public static void main(String[] args) {
		//fight("treeDerpah", 50, "swung his sword", 0, 0);
	beginGame();
		
	}
	//game
	public static void beginGame() {//defines the hero's class and name
			heroName = choice("You have washed up on the beach of an island with no idea how you got there. You can almost remember one thing. Your name \nwhat is it?"); // Defines the name variable.
			for (int i = 0; i < 1; i++) {
			String HCS = choice( heroName + "! That sounds like the name of a mighty hero.\nYou have a backpack on your back. Let's see what's inside.\nDo you see: a (A rusty broadsword), b(A bow with weak string), or c(A worn down staff ) \n(hint: type either a b or c below");
			if(HCS.equalsIgnoreCase("a")) {
			heroClass = 0;
			weaponName = "sword";
			heroClassName = "Knight";
			heroSpeed = 25;
			heroHp = 25;
			heroMaxHP = 25;
			heroDmg = 7;
			beachVilla();
			} else if(HCS.equalsIgnoreCase("b")) {
			heroClass = 1;
			weaponName = "bow";
			heroClassName = "Archer";
			heroSpeed = 75;
			heroHp = 75;
			heroMaxHP = 25;
			heroDmg = 3;
			beachVilla();
			} else if(HCS.equalsIgnoreCase("c")) {
			heroClass = 2;
			weaponName = "staff";
			heroClassName = "Mage";
			heroSpeed = 50;
			heroHp = 50;
			heroMaxHP = 25;
			heroDmg = 5;
			beachVilla();
			} else {
			choice("I’m sorry I didn't understand. Please repeat that with one of the letters A, B or C. (Type in the word okay to continue)");
				i--;
			}
		}
	}
	public static void beachVilla() { //Would you like to : a (Camp out on the beach) or b (Go into the forest)");

		pathOne = choice("Wow! you must have been a great " + heroClassName + "!\nYou look at your surroundings. Above the trees in the distance there is smoke! There might be a village. You start your journey into the forest.\n(type in anything anything to continue.)");
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
		waitMessage("You arrived at the village. It was chaos. Villagers were running around everywhere. In the center of it all is a giant storm spirit. \n"
	+ "It is blowing strong winds and tornados in every direction"
	+ "\nOne spots you, and runs up to you. "
	+ "\n???: Sir, do you know how to wield a " + weaponName + "? "
	+ "\nYou feel like you know how to use it. You take the " + weaponName + " from him, and run straight towards the eye of the storm\n", 1);
	Boolean didWin = fight("Wind Spirit", 25, "Blasted Air", 30, 6);
	
	if (didWin == false) {
		
	} else if (didWin == true) {
		waitMessage("The villagers cheered as the Wind Spirit slowly faded away. The villager who gave you the " + weaponName  + " came up to you. "
		+ "\n???: You just defeated on of the " + "Tempest\'s Minions" + " He is not going to like that."
		+ "\n???: You should try to defeat him before he reigns terror on us all. I believe in you. "
		+ "\n???: Hey, by the way. What is your name? " + heroName + "? That's a nice name. Sounds like the name of a true hero. My name is Jimmy James. "
		+ "\nJimmy: Im the local blacksmith, If you ever need me, I will be here at the village. "
		+ "\nOn the ground where you defeated the spirit, there lies a " + weaponName + ". "
		+ "\nJimmy: that is yours now. You won it. It's called a trophy"  ,1);
		heroDmg=10;
		heroGold+=30;
		weaponName = "wind " + weaponName;
		try {
			slowText("you got a"+weaponName+"!");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String mountainTrap = choice("You hear thunder. On top of one of the many mountains, there was a giant storm. \n"
		+ "Jimmy: It must be another one of the Tempest's minions. You better go up there quick before they make it to the village! \n"
		+ "say anything to continue.");
		mountain();	
		}
		
	}
	
	public static void mountain() {
		
		String villageChoice = choice("Jimmy: Are you sure? "
				+ "\n... Alright then. If you are going into the mountains, you are going to need some tools. "
				+ "\nYou are going to need the help of my good friend, Bryn Rainbow."
				+ "\nShe is an alchemist, which means she makes potions. Why don't you head over to her shop? "
				+ "\n\nYou look around. The villagers are already rebuilding things. It looks like they have done it before"
				+ "\nSay anything to continue.");
				potShop();

	
	}
	public static void potShop() {
		
		String shopChoice = choice("When you walk into the shop you are greeted by the woman at the counter.\n"
			 + "Bryn: Hello! you must be " + heroName + "! Thank you ever so much for saving the village!\n"
			 + "Is there anything I can do for you? I have a few potions in stock. Would you like some?\n"
			 + "I will even give you one free Health potion in return for saving the village.\n"
			 + "Would you like to buy: a (Health potion), b (Strength potion) or c (a Speed potion)\n"
			 + "Or, If you want, you don't have to buy anything.\n"
			 + "(Type in leave to leave)" );
		hpPot++;
		if (shopChoice.equalsIgnoreCase("leave")  ) {
			bossTwo();
		}
		if (shopChoice.equalsIgnoreCase("a")) {
		String potConf = choice("that will cost you 10 gold. You have " + heroGold + ". Would you like to buy it? (yes or no)");
		if (potConf.equalsIgnoreCase("yes")) {
		
			hpPot++;
			bossTwo();
		}
 } else if (shopChoice.equalsIgnoreCase("b")) {
	 String potConf = choice("that will cost you 10 gold. You have " + heroGold + ". Would you like to buy it? (yes or no)");
		if (potConf.equalsIgnoreCase("yes")) {
			
			atkPot++;
			bossTwo();
		}
 } else if (shopChoice.equalsIgnoreCase("c")) {
	 String potConf = choice("that will cost you 10 gold. You have " + heroGold + ". Would you like to buy it? (yes or no)");
		if (potConf.equalsIgnoreCase("yes")) {
			
			spdPot++;
			bossTwo();
		}                 
		}
		}
    public static void bossTwo () {
    	heroHp = heroMaxHP;
    	 succ = true;
	choice("AROUND AN HOUR LATER\n\n"
			+ "You are a good way up the mountain. The Storm gets larger and larger as you get closer and closer. \n"
			+ "Eventually you are so close you can see the storm clearly. It looks like a storm, but in the center there is a humanoid figure.\n"
			+ "They are wearing a robe, and they are completely white. You also notice they have no pupils. All you can see is the white of their eyes. \n"
			+ "It notices you.\n"
			+ "Spirit: Halt! I am under orders to kill you. Prepare for destruction\n"
			+ "Say anything to continue.");
			fight("Storm Spirit", 50, "shot a bolt of lightning", 74, 9);
			heroHp = heroMaxHP;
			choice("The storm Spirit slowly disintegrates.\n"
				+ "Storm Spirit: I have send a message to the others, they will be here soon. You will not be so lucky.\n"
				+ "On the ground there is a weapon. It's the thunder " + weaponName + "!\n"
				+ "You obtained the thunder" + weaponName + "!\n"
				+ "\n"
				+ "Above you a spirit forms. It looks like a cross between a cloud and a human.\n"
				+ "You have destroyed my brother, I will destroy you.\n"
				+ "Say anything to continue.");
				heroDmg += 5;
			fight("Cloud Spirit", 65, "Sliced you with a wind sword", 99, 13);
			choice("As the last bit of cloud is vapourized, you feel this " + weaponName + ", that the cloud spirit dropped, pulling towards you. \n"
				+ " It floats toward you, and into hovers in front of you.\n"
				+ "The other weapons are released from your backpack, joining the cloud" + weaponName + ", and the fuze together...\n"
				+ "There is a blinding light, and then...\n"
				+ "You obtained the master sword!"
				+ "\n"
				+ "???: Who Dares Destroy My Creatures! \n"
				+ "???: You! You are the one I banished long ago. I will finally be able to finish you off!\n"
				+ "Type In anything to continue.");
			heroHp = heroMaxHP;
			heroDmg +=15;
			fight("The Tempest", 75, "shot a beam of light", 1000, 15);
			choice("As you deliver the final blow, there is an explosion. The villagers cheated and cheered as they saw The Tempest defeated.\n"
				+ "The explosion knocked you all the way down the mountain and into the village square. You could have died, but the master sword protected you!\n"
				+ "However, you where knocked out from the speed you where flying. The villagers carried you into the bed of an unused house. And you drift into a deserved sleep.\n"
				+ "Say anything to End.");
			System.exit(0);
			
	}
	//Tools 
	public static void slowText(String string) throws InterruptedException {
		for (int i = 0; i < string.length(); i++) {
			
			System.out.print(string.charAt(i));
			Thread.sleep(40);
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
			slowText("You entered a battle with " + monsterName + "!");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; monsterCurrentHealth > 0; i++) {
			String oof = null;
			if (succ == false) {
				 oof = choice("Would you like to a (use your " + weaponName + " ) or b(try to dodge the enemy's upcoming attack)");
			} else if (succ == true) {
				 oof = choice("Would you like to a (use your " + weaponName + " ), b(try to dodge the enemy's upcoming attack) or c(use an item)");
			} 
			
			
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
						waitMessage("Everything started to black away. ", 2);
						waitMessage("A voice fills you head. Its telling you, \nWake Up! You are needed! \n You where zipped back to a few minuts before. Don't die this time. ", 2);
						return false;
					} 
					}
					}else if(oof.equalsIgnoreCase("b")) {
				try {
					slowText(monsterName + " " + monsterWeapon + ", but you dodged it!!");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					} else if( oof.equalsIgnoreCase("c")) {
						if (hpPot >= 1 || spdPot >= 1 || spdPot >= 1) {
							hasPot = true;
						} else {
							hasPot = false;
						}
						if (hasPot = true ) {
							String potMessage = "You have \n";
							if (hpPot >= 1) {
								potMessage += hpPot + " Health Potion (To use say \"a\" )\n";
							}
							if (atkPot >= 1) {
								potMessage += atkPot + " Strength Potion(To use say \"b\" )\n";
							}
							if (spdPot >= 1) {
								potMessage += spdPot + " speedPotion (To use say \"c\" )\n";
							}
							potMessage += "Say Cancel to Cancel";
							String trainStation = choice(potMessage); 
							if (trainStation.equalsIgnoreCase("a")) {    
								healPot();
								hpPot--;
							} else if (trainStation.equalsIgnoreCase("b")) {
								dmgPot();
								atkPot--;
							} else if (trainStation.equalsIgnoreCase("c")) {
								speedPot();
								spdPot--;
							} 
							
						} else {
							try {
								slowText("Sorry, you dont have any potions.");
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
						}
					}
		return false;
			}
/*
 * 
 * 
 * 
 * 
 * 
 * 
 *  
*
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 *
 *
 *
 *
 *
 *
 *
 *
 */
	
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
					+ "+ 25 Health");
			heroHp += 25 ;
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

