package com.revature.controllers;

import java.util.Random;
import java.util.Scanner;

import com.revature.models.Entity;
import com.revature.models.Player;
import com.revature.services.EntityService;
import com.revature.services.PlayerService;

public class Creation {
	
	public String Class;
	public String Subclass;
	private String Name;
	public int HealthPotion;
	Player player = new Player();
	PlayerService q = new PlayerService();
	Menu start = new Menu();
	Random r = new Random();

	
	public void Char() {

	Scanner y = new Scanner(System.in);
	
	System.out.println("Welcome Adventurer! What is your name?");
	String tho = y.nextLine();
	player.setPlayerName(tho.toString());
		System.out.println("Which class would you like to play as? \n1. A Warrior? \n2. A Mage? \n3. An Artillerist?");
			
		Scanner cho = new Scanner(System.in);
		String gath = cho.nextLine();
			if(gath.equals("1")) {
				player.setPlayerClass("Warrior");
				System.out.println("1. Berzerker? \n2. Dual Swordsman? \n3. Knight Lancer?");
				String pu = cho.nextLine();
				 if(pu.equals("1")) {
					 player.setPlayerSubclass("Berzerker");
					 q.addPlayer(player);
					 
					 
					 startAdventure();
				 }
				 else if(pu.equals("2")) {
					 player.setPlayerSubclass("Dual Swordsman");
					 q.addPlayer(player);
					 
					 startAdventure();
				 }
				 else if(pu.equals("3")) {
					 player.setPlayerSubclass("Knight Lancer");
					 q.addPlayer(player);
					 
					 startAdventure();
				 }
			}else if(gath.equals("2")) {				
				player.setPlayerClass("Mage");
				System.out.println("1. Warlock? \n2. Elementalist? \n3. Bard?");
				String bu = cho.nextLine();
				 if(bu.equals("1")) {
					 player.setPlayerSubclass("Warlock");
					 q.addPlayer(player);
					 
					 startAdventure();
				 }
				 else if(bu.equals("2")) {
					 player.setPlayerSubclass("Elementalist");
					 q.addPlayer(player);
					 
					 startAdventure();
				 }
				 else if(bu.equals("3")) {
					 player.setPlayerSubclass("Bard");
					 q.addPlayer(player);
					 
					 startAdventure();
				 }
			}else if(gath.equals("3")) {
				
				player.setPlayerClass("Artillerist");
				System.out.println("1. Sharpshooter? \n2. Cannoner? \n3. Archer?");
				String au = cho.nextLine();
				 if(au.equals("1")) {
					 player.setPlayerSubclass("Sharpshooter");
					 q.addPlayer(player);
					 
					 startAdventure();
				 }
				 else if(au.equals("2")) {
					 player.setPlayerSubclass("Cannoner");
					 q.addPlayer(player);
					 
					 startAdventure();
				 }
				 else if(au.equals("3")) {
					 player.setPlayerSubclass("Archer");
					 q.addPlayer(player);
					 
					startAdventure();
				 }
			}
	}
	
	void startAdventure(){
		System.out.println("Which biome would you like to start you adventure in? "
				+ "\n1. Forest?"
				+ "\n2. Coast?"
				+ "\n3. Desert?"
				+ "\n4. Ruined Metropolis?"
				+ "\n5. Mountainside?"
				+ "\n0. Exit?");
		
		Scanner h = new Scanner(System.in);
		String co = h.nextLine();
		switch(co) {
				case "1" :
					Forest();
					break;
				case "2" :
					Coast();
					break;
				case "3" :
					Desert();
					break;
				case "4" :
					Metropolis();
					break;
				case "5" :
					Mountainside();
		}
	
	}
	
	void Forest() {
		switch(player.getPlayerClass()) {
				
		case "Warrior" :
			HealthPotion = 0;
			ForestBattle();
			break;
			
		case "Artillerist" :
			HealthPotion = 0;			
			ForestBattle();
			break;
			
		case "Mage" :
			HealthPotion = 1;			
			ForestBattle();
			break;
			}
	}
	
	void Coast() { 
		switch(player.getPlayerClass()) {
		case "Warrior" :
			HealthPotion = 1;
			CoastBattle();
			
		case "Artillerist" :
			HealthPotion = 0;	
			CoastBattle();
			
		case "Mage" :
			HealthPotion = 1;			
			CoastBattle();
			} 
	}
	
	void Desert() {
		switch(player.getPlayerClass()) {
		case "Warrior" :
			HealthPotion = 1;
		//	DesertBattle();
			
		case "Artillerist" :
			HealthPotion = 1;			
		//	DesertBattle();
			
		case "Mage" :
			HealthPotion = 2;			
		//	DesertBattle();
			} 
	}
	
	void Metropolis() { 
		switch(player.getPlayerClass()) {
		case "Warrior" :
			HealthPotion = 2;
		//	MetropolisBattle();
			
		case "Artillerist" :
			HealthPotion = 2;			
		//	MetropolisBattle();
			
		case "Mage" :
			HealthPotion = 3;			
	//		MetropolisBattle();
			} 
	}
	
	void Mountainside() { 
		switch(player.getPlayerClass()) {
		case "Warrior" :
			HealthPotion = 3;
		//	MountainBattle();
			
		case "Artillerist" :
			HealthPotion = 3;			
		//	MountainBattle();
			
		case "Mage" :
			HealthPotion = 4;			
		//	MountainBattle();
			}
	}
	
	EntityService e = new EntityService();
		
	void ForestBattle(){
		Entity enemey = e.getEnemey(1);
		int hp = enemey.getHealthPool();
		int ph = player.getHealthPool();
		int ad = enemey.getAttackDamage();
		double att = player.getAttackDamage();
		Entity enemey2 = e.getEnemey(1);
		int hp2 = enemey2.getHealthPool();
		int ad2 = enemey2.getAttackDamage();
		Entity boss = e.getBoss(5);
		int hp3 = boss.getHealthPool();
		int ad3 = boss.getAttackDamage();
		Player.getPlayerSubclass();
		player.getSubClassAttack1();
		String one = player.setSubClassAttack1();
		player.getSubClassAttack2();
		String two = player.setSubClassAttack2();
		player.getSubClassAttack3();
		String three = player.setSubClassAttack3();
		System.out.println("On your adventure in the forest, you encounter a " + enemey.getAlias() + " and it engages in combat! \n\nHow do you retaliate?");

		BattleLoop:
		while(enemey.getHealthPool() >= 0) {
		Scanner cho = new Scanner(System.in);
		
		System.out.println("1." + one + "?    " + "2." + two + "?"
				+ "\n3." + three + "?    " + "4. Use Health Potion?");
		
		String gath = cho.nextLine();
		
		DecisionSwitch:
			switch(gath) {
			case "1": 
				hp -= att;
				ph -= ad;
				
			System.out.println(one + " did " + att + " damage!");			
			System.out.println("The " + enemey.getAlias() + " attacks and does " + ad + " damage!");
			System.out.println("The " + enemey.getAlias() + " now has " + hp + " HP and you now have " + ph + " HP");
			
				if(ph <= 0) {
					System.out.println("You are too weak to continue!");
					break BattleLoop;
				}else if(hp <= 0) {
					System.out.println("The " + enemey.getAlias() + " was defeated!");
					break BattleLoop;
				}
			System.out.println("\nHow shall you continue?");
			break DecisionSwitch;
			
			
			case "2": 
				hp -= att;
				ph -= ad;	
			System.out.println(two + " did " + att + " damage!");
			System.out.println("The " + enemey.getAlias() + " attacks and does " + ad + " damage!");
			System.out.println("The " + enemey.getAlias() + " now has " + hp + " HP and you now have " + ph + " HP");
				if(ph <= 0) {
					System.out.println("You are too weak to continue!");
					break BattleLoop;
				}else if(hp <= 0) {
					System.out.println("The " + enemey.getAlias() + " was defeated!");
					break BattleLoop;
				}
			System.out.println("\nHow shall you continue?");
			break DecisionSwitch;
				
			case "3":
				hp -= att;
				ph -= ad;
			System.out.println(three + " did " + att + " damage!");
			System.out.println("The " + enemey.getAlias() + " attacks and does " + ad + " damage!");
			System.out.println("The " + enemey.getAlias() + " now has " + hp + " HP and you now have " + ph + " HP");
				if(ph <= 0) {
					System.out.println("You are too weak to continue!");
					break BattleLoop;
				}else if(hp <= 0) {
					System.out.println("The " + enemey.getAlias() + " was defeated!");
					break BattleLoop;
				}
			System.out.println("\nHow shall you continue?");
			break DecisionSwitch;
				
			case "4":
				if(HealthPotion > 0) {
					ph += 50;
					ph -= ad;
				HealthPotion -= 1;
			System.out.println("You drank a health potion and restored 50 HP! \nYou now have " + HealthPotion + " health potions remaining.");
			System.out.println("The " + enemey.getAlias() + " attacks and does " + ad + " damage!");
			System.out.println("The " + enemey.getAlias() + " now has " + hp + " HP and you now have " + ph + " HP");
				if(ph <= 0) {
					System.out.println("You are too weak to continue!");
					break BattleLoop;
				}else if(hp <= 0) {
					System.out.println("The " + enemey.getAlias() + " was defeated!");
					break BattleLoop;
				}	
			System.out.println("\nHow shall you continue?");
			break DecisionSwitch;
			}else {
				System.out.println("You have no health potions remaining!");
				break DecisionSwitch;
			}
			}
		
			}
		
		System.out.println("\nAs you continue your adventure in the forest, you encounter a " + enemey2.getAlias() + " and it engages in combat! \n\nHow do you retaliate?");
			
			Battle2Loop:
			while(ph >= 0) {
				
			Scanner ham = new Scanner(System.in);
			System.out.println("1." + one + "?    " + "2." + two + "?"
					+ "\n3." + three + "?    " + "4. Use Health Potion?");
			
			String burg = ham.nextLine();
			
			DecisionSwitch:
				switch(burg) {
				case "1": 
					hp2 -= att;
					ph -= ad2;
					
				System.out.println(one + " did " + att + " damage!");			
				System.out.println("The " + enemey2.getAlias() + " attacks and does " + ad2 + " damage!");
				System.out.println("The " + enemey2.getAlias() + " now has " + hp2 + " HP and you now have " + ph + " HP");
					if(ph <= 0) {
						System.out.println("You are too weak to continue!");
						break Battle2Loop;
					}else if(hp2 <= 0) {
						System.out.println("The " + enemey2.getAlias() + " was defeated!");
						break Battle2Loop;
					}
				System.out.println("\nHow shall you continue?");
				break DecisionSwitch;
					
				case "2": 
					hp2 -= att;
					ph -= ad2;	
				System.out.println(two + " did " + att + " damage!");
				System.out.println("The " + enemey2.getAlias() + " attacks and does " + ad2 + " damage!");
				System.out.println("The " + enemey2.getAlias() + " now has " + hp2 + " HP and you now have " + ph + " HP");
					if(ph <= 0) {
						System.out.println("You are too weak to continue!");
						break Battle2Loop;
					}else if(hp2 <= 0) {
						System.out.println("The " + enemey2.getAlias() + "was defeated!");
						break Battle2Loop;
					}
				System.out.println("\nHow shall you continue?");
				break DecisionSwitch;
					
				case "3":
					hp2 -= att;
					ph -= ad2;
				System.out.println(three + " did " + att + " damage!");
				System.out.println("The " + enemey2.getAlias() + " attacks and does " + ad2 + " damage!");
				System.out.println("The " + enemey2.getAlias() + " now has " + hp2 + " HP and you now have " + ph + " HP");
					if(ph <= 0) {
						System.out.println("You are too weak to continue!");
						break Battle2Loop;
					}else if(hp2 <= 0) {
						System.out.println("The " + enemey2.getAlias() + " was defeated!");
						break Battle2Loop;
					}
				System.out.println("\nHow shall you continue?");
				break DecisionSwitch;
					
				case "4":
					if(HealthPotion > 0) {
						ph += 50;
						ph -= ad2;
					HealthPotion -= 1;
				System.out.println("You drank a health potion and restored 50 HP! \nYou now have " + HealthPotion + " health potions remaining.");
				System.out.println("The " + enemey2.getAlias() + " attacks and does " + enemey2.getAlias() + " damage!");
				System.out.println("The " + enemey2.getAlias() + " now has " + hp2 + " HP and you now have " + ph + " HP");
					if(ph <= 0) {
						System.out.println("You are too weak to continue!");
						break Battle2Loop;
					}else if(hp2 <= 0) {
						System.out.println("The " + enemey2.getAlias() + " was defeated!");
						break Battle2Loop;
					}	
				System.out.println("\nHow shall you continue?");
				break DecisionSwitch;
				}else {
					System.out.println("You have no health potions remaining!");
					break DecisionSwitch;
				}
				}
			}
			System.out.println("\nYou encounter an epic enemey! " + boss.getAlias() + " engages in combat! \n\nHow do you retaliate?");
			
			Battle3Loop:
			while(hp3 >= 0) {
				
			Scanner kim = new Scanner(System.in);
			System.out.println("1." + one + "?    " + "2." + two + "?"
					+ "\n3." + three + "?    " + "4. Use Health Potion?");
			
			String ron = kim.nextLine();
			
			DecisionSwitch:
				switch(ron) {
				case "1": 
					hp3 -= att;
					ph -= ad3;
					
				System.out.println(one + " did " + att + " damage!");			
				System.out.println("The " + boss.getAlias() + " attacks and does " + ad3 + " damage!");
				System.out.println("The " + boss.getAlias() + " now has " + hp3 + " HP and you now have " + ph + " HP");
					if(ph <= 0) {
						System.out.println("You are too weak to continue!");
						break Battle3Loop;
					}else if(hp3 <= 0) {
						System.out.println("The " + boss.getAlias() + " was defeated!");
						break Battle3Loop;
					}
				System.out.println("\nHow shall you continue?");
				break DecisionSwitch;
					
				case "2": 
					hp3 -= att;
					ph -= ad3;	
				System.out.println(two + " did " + att + " damage!");
				System.out.println("The " + boss.getAlias() + " attacks and does " + ad3 + " damage!");
				System.out.println("The " + boss.getAlias() + " now has " + hp3 + " HP and you now have " + ph + " HP");
					if(ph <= 0) {
						System.out.println("You are too weak to continue!");
						break Battle3Loop;
					}else if(hp3 <= 0) {
						System.out.println("The " + boss.getAlias() + " was defeated!");
						break Battle3Loop;
					}
				System.out.println("\nHow shall you continue?");
				break DecisionSwitch;
					
				case "3":
					hp3 -= att;
					ph -= ad3;
				System.out.println(three + " did " + att + " damage!");
				System.out.println("The " + boss.getAlias() + " attacks and does " + ad3 + " damage!");
				System.out.println("The " + boss.getAlias() + " now has " + hp3 + " HP and you now have " + ph + " HP");
					if(ph <= 0) {
						System.out.println("You are too weak to continue!");
						break Battle3Loop;
					}else if(hp3 <= 0) {
						System.out.println("The " + boss.getAlias() + " was defeated!");
						break Battle3Loop;
					}
				System.out.println("\nHow shall you continue?");
				break DecisionSwitch;
					
				case "4":
					if(HealthPotion > 0) {
						ph += 50;
						
						ph -= ad3;
					HealthPotion -= 1;
				System.out.println("You drank a health potion and restored 50 HP! \nYou now have " + HealthPotion + " health potions remaining.");
				System.out.println("The " + boss.getAlias() + " attacks and does " + ad3 + " damage!");
				System.out.println("The " + boss.getAlias() + " now has " + hp3 + " HP and you now have " + ph + " HP");
					if(ph <= 0) {
						System.out.println("You are too weak to continue!");
						break Battle3Loop;
					}else if(hp3 <= 0) {
						System.out.println("The " + boss.getAlias() + " was defeated!");
						break Battle3Loop;
					}	
				System.out.println("\nHow shall you continue?");
				break DecisionSwitch;
				}else {
					System.out.println("You have no health potions remaining!");
					break DecisionSwitch;
				} 
				 
			
			}
			} 
			}
	
	void CoastBattle(){
		int f = 0;
		Entity enemey = e.getEnemey(2);
		int hp = enemey.getHealthPool();
		int ph = player.getHealthPool();
		int ad = enemey.getAttackDamage();
		int att = player.getAttackDamage();
		Entity enemey2 = e.getEnemey(2);
		int hp2 = enemey2.getHealthPool();
		int ad2 = enemey2.getAttackDamage();
		Entity boss = e.getBoss(2);
		int hp3 = boss.getHealthPool();
		int ad3 = boss.getAttackDamage();
		Player.getPlayerSubclass();
		player.getSubClassAttack1();
		String one = player.setSubClassAttack1();
		player.getSubClassAttack2();
		String two = player.setSubClassAttack2();
		player.getSubClassAttack3();
		String three = player.setSubClassAttack3();
		
		
		AreaLoop:
			
			while(f <= 0) {
				System.out.println("On your adventure on the coast, you encounter a " + enemey.getAlias() + " and it engages in combat! \n\nHow do you retaliate?");
		BattleLoop:
		while(enemey.getHealthPool() >= 0) {
		Scanner cho = new Scanner(System.in);
		
		System.out.println("1." + one + "?    " + "2." + two + "?"
				+ "\n3." + three + "?    " + "4. Use Health Potion?");
		
		String gath = cho.nextLine();
		
		DecisionSwitch:
			switch(gath) {
			case "1":
				
				hp -= att * 0.6;
				ph -= ad;
				
			System.out.println(one + " did " + att * 0.6 + " damage!");			
			System.out.println("The " + enemey.getAlias() + " attacks and does " + ad + " damage!");
			System.out.println("The " + enemey.getAlias() + " now has " + hp + " HP and you now have " + ph + " HP");
			
				if(ph <= 0) {
					System.out.println("You are too weak to continue!");
					f++;
					break AreaLoop;
					
				}else if(hp <= 0) {
					System.out.println("The " + enemey.getAlias() + " was defeated!");
					break BattleLoop;
				}
			System.out.println("\n\nHow shall you continue?");
			break DecisionSwitch;
			
			
			case "2": 
				
				hp -= att * 1.2;
				ph -= ad;	
			System.out.println(two + " did " + att * 1.2 + " damage!");
			System.out.println("The " + enemey.getAlias() + " attacks and does " + ad + " damage!");
			System.out.println("The " + enemey.getAlias() + " now has " + hp + " HP and you now have " + ph + " HP");
				if(ph <= 0) {
					System.out.println("You are too weak to continue!");
					f++;
					break AreaLoop;
				}else if(hp <= 0) {
					System.out.println("The " + enemey.getAlias() + " was defeated!");
					break BattleLoop;
				}
			System.out.println("\n\nHow shall you continue?");
			break DecisionSwitch;
				
			case "3":
				
				hp -= att;
				ph -= ad;
			System.out.println(three + " did " + att + " damage!");
			System.out.println("The " + enemey.getAlias() + " attacks and does " + ad + " damage!");
			System.out.println("The " + enemey.getAlias() + " now has " + hp + " HP and you now have " + ph + " HP");
				if(ph <= 0) {
					System.out.println("You are too weak to continue!");
					f++;
					break AreaLoop;
				}else if(hp <= 0) {
					System.out.println("The " + enemey.getAlias() + " was defeated!");
					break BattleLoop;
				}
			System.out.println("\n\nHow shall you continue?");
			break DecisionSwitch;
				
			case "4":
				if(HealthPotion > 0) {
					ph += 50;
					ph -= ad;
				HealthPotion -= 1;
			System.out.println("You drank a health potion and restored 50 HP! \nYou now have " + HealthPotion + " health potions remaining.");
			System.out.println("The " + enemey.getAlias() + " attacks and does " + ad + " damage!");
			System.out.println("The " + enemey.getAlias() + " now has " + hp + " HP and you now have " + ph + " HP");
				if(ph <= 0) {
					System.out.println("You are too weak to continue!");
					f++;
					break AreaLoop;
				}else if(hp <= 0) {
					System.out.println("The " + enemey.getAlias() + " was defeated!");
					break BattleLoop;
				}	
			System.out.println("\nHow shall you continue?");
			break DecisionSwitch;
			}else {
				System.out.println("You have no health potions remaining!");
				break DecisionSwitch;
			}
			}
		
			}
		
		System.out.println("\nAs you continue your adventure along the coast, you encounter a " + enemey2.getAlias() + " and it engages in combat! \n\nHow do you retaliate?");		
			Battle2Loop:
			while(hp2 >= 0) {
					
			Scanner ham = new Scanner(System.in);
			System.out.println("1." + one + "?    " + "2." + two + "?"
					+ "\n3." + three + "?    " + "4. Use Health Potion?");
			
			String burg = ham.nextLine();
			
			DecisionSwitch:
				switch(burg) {
				case "1":
					
					hp2 -= att * 1.5;
					ph -= ad2;
					
				System.out.println(one + " did " + att * 1.5 + " damage!");			
				System.out.println("The " + enemey2.getAlias() + " attacks and does " + ad2 + " damage!");
				System.out.println("The " + enemey2.getAlias() + " now has " + hp2 + " HP and you now have " + ph + " HP");
					if(ph <= 0) {
						System.out.println("You are too weak to continue!");
						f++;
						break AreaLoop;
					}else if(hp2 <= 0) {
						System.out.println("The " + enemey2.getAlias() + " was defeated!");
						break Battle2Loop;
					}
				System.out.println("\nHow shall you continue?");
				break DecisionSwitch;
					
				case "2":
					
					hp2 -= att;
					ph -= ad2;	
				System.out.println(two + " did " + att + " damage!");
				System.out.println("The " + enemey2.getAlias() + " attacks and does " + ad2 + " damage!");
				System.out.println("The " + enemey2.getAlias() + " now has " + hp2 + " HP and you now have " + ph + " HP");
					if(ph <= 0) {
						System.out.println("You are too weak to continue!");
						f++;
						break AreaLoop;
					}else if(hp2 <= 0) {
						System.out.println("The " + enemey2.getAlias() + "was defeated!");
						break Battle2Loop;
					}
				System.out.println("\nHow shall you continue?");
				break DecisionSwitch;
					
				case "3":
					
					hp2 -= att * 0.7;
					ph -= ad2;
				System.out.println(three + " did " + att * 0.7 + " damage!");
				System.out.println("The " + enemey2.getAlias() + " attacks and does " + ad2 + " damage!");
				System.out.println("The " + enemey2.getAlias() + " now has " + hp2 + " HP and you now have " + ph + " HP");
					if(ph <= 0) {
						System.out.println("You are too weak to continue!");
						f++;
						break AreaLoop;
					}else if(hp2 <= 0) {
						System.out.println("The " + enemey2.getAlias() + " was defeated!");
						break Battle2Loop;
					}
				System.out.println("\nHow shall you continue?");
				break DecisionSwitch;
					
				case "4":
					if(HealthPotion > 0) {
						ph += 50;
						ph -= ad2;
					HealthPotion -= 1;
				System.out.println("You drank a health potion and restored 50 HP! \nYou now have " + HealthPotion + " health potions remaining.");
				System.out.println("The " + enemey2.getAlias() + " attacks and does " + enemey2.getAlias() + " damage!");
				System.out.println("The " + enemey2.getAlias() + " now has " + hp2 + " HP and you now have " + ph + " HP");
					if(ph <= 0) {
						System.out.println("You are too weak to continue!");
						f++;
						break AreaLoop;
					}else if(hp2 <= 0) {
						System.out.println("The " + enemey2.getAlias() + " was defeated!");
						break Battle2Loop;
					}	
				System.out.println("\nHow shall you continue?");
				break DecisionSwitch;
				}else {
					System.out.println("You have no health potions remaining!");
					break DecisionSwitch;
				}
				}
			
			}
			
			System.out.println("\nYou encounter an epic enemey! " + boss.getAlias() + " engages in combat! \n\nHow do you retaliate?");
			Battle3Loop:				
			while(hp3 >= 0) {
				
			Scanner kim = new Scanner(System.in);
			System.out.println("1." + one + "?    " + "2." + two + "?"
					+ "\n3." + three + "?    " + "4. Use Health Potion?");
			
			String ron = kim.nextLine();
			
			DecisionSwitch:
				switch(ron) {
				case "1": 
					
					hp3 -= att;
					ph -= ad3;
					
				System.out.println(one + " did " + att + " damage!");			
				System.out.println("The " + boss.getAlias() + " attacks and does " + ad3 + " damage!");
				System.out.println("The " + boss.getAlias() + " now has " + hp3 + " HP and you now have " + ph + " HP");
					if(ph <= 0) {
						System.out.println("You are too weak to continue!");
						f++;
						return;
					}else if(hp3 <= 0) {
						System.out.println("The " + boss.getAlias() + " was defeated!");
						break Battle3Loop;
					}
				System.out.println("\nHow shall you continue?");
				break DecisionSwitch;
					
				case "2":
					
					hp3 -= att;
					ph -= ad3;	
				System.out.println(two + " did " + att + " damage!");
				System.out.println("The " + boss.getAlias() + " attacks and does " + ad3 + " damage!");
				System.out.println("The " + boss.getAlias() + " now has " + hp3 + " HP and you now have " + ph + " HP");
					if(ph <= 0) {
						System.out.println("You are too weak to continue!");
						f++;
						return;
					}else if(hp3 <= 0) {
						System.out.println("The " + boss.getAlias() + " was defeated!");
						break Battle3Loop;
					}
				System.out.println("\nHow shall you continue?");
				break DecisionSwitch;
					
				case "3":
					
					hp3 -= att * 1.3;
					ph -= ad3;
				System.out.println(three + " did " + att * 1.3 + " damage!");
				System.out.println("The " + boss.getAlias() + " attacks and does " + ad3 + " damage!");
				System.out.println("The " + boss.getAlias() + " now has " + hp3 + " HP and you now have " + ph + " HP");
					if(ph <= 0) {
						System.out.println("You are too weak to continue!");
						f++;
						return;
					}else if(hp3 <= 0) {
						System.out.println("The " + boss.getAlias() + " was defeated!");
						break Battle3Loop;
					}
				System.out.println("\nHow shall you continue?");
				break DecisionSwitch;
					
				case "4":
					if(HealthPotion > 0) {
						ph += 50;
						
						ph -= ad3;
					HealthPotion -= 1;
				System.out.println("You drank a health potion and restored 50 HP! \nYou now have " + HealthPotion + " health potions remaining.");
				System.out.println("The " + boss.getAlias() + " attacks and does " + ad3 + " damage!");
				System.out.println("The " + boss.getAlias() + " now has " + hp3 + " HP and you now have " + ph + " HP");
					if(ph <= 0) {
						System.out.println("You are too weak to continue!");
						f++;
						return;
					}else if(hp3 <= 0) {
						System.out.println("The " + boss.getAlias() + " was defeated!");
						break Battle3Loop;
					}	
				System.out.println("\nHow shall you continue?");
				break DecisionSwitch;
				}else {
					System.out.println("You have no health potions remaining!");
					break DecisionSwitch;
				} 
				}
			}
			System.out.println("\n\nCongratulations on Completing this Area!");
			break AreaLoop;
			}
			 
			}

		}
	