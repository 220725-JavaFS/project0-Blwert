package com.revature.models;

import java.util.Objects;
import com.revature.models.classes.Classes;
public class Player {
	
	Classes q = new Classes();
	private int playerNumber;
	private String playerName;
	private String playerClass;
	private static String playerSubclass;
	private int healthPool;
	private int attackDamage;
	private int healthPotion;
	public String a1;
	public String a2;
	public String a3;
	
	
	public int getPlayerNumber() {
		return playerNumber;
	}
	public void setPlayerNumber(int playerNumber) {
		this.playerNumber = playerNumber;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getPlayerClass() {
		return playerClass;
	}
	public void setPlayerClass(String playerClass) {
		this.playerClass = playerClass;
	}
	public static String getPlayerSubclass() {
		return playerSubclass;
	}
	public void setPlayerSubclass(String playerSubclass) {
		Player.playerSubclass = playerSubclass;
	}
	
	public void playerHealth() {
		System.out.println("My health is" + healthPool);
	}
	
	
	public Player(String playerName, String playerClass, String playerSubclass) {
		super();
		this.playerName = playerName;
		this.playerClass = playerClass;
		Player.playerSubclass = playerSubclass;
	}
	public Player(int playerNumber, String playerName, String playerClass, String playerSubclass) {
		super();
		this.playerNumber = playerNumber;
		this.playerName = playerName;
		this.playerClass = playerClass;
		Player.playerSubclass = playerSubclass;
	}
	public Player() {
		super();
	}
	@Override
	public int hashCode() {
		return Objects.hash(playerClass, playerName, playerNumber, playerSubclass);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		return Objects.equals(playerClass, other.playerClass) && Objects.equals(playerName, other.playerName)
				&& playerNumber == other.playerNumber && Objects.equals(playerSubclass, other.playerSubclass);
	}
	@Override
	public String toString() {
		return "Player [playerNumber=" + playerNumber + ", playerName=" + playerName + ", playerClass=" + playerClass
				+ ", playerSubclass=" + playerSubclass + "]";
	}
	public int getHealthPotion() {
		return healthPotion;
	}
	public void setHealthPotion(int healthPotion) {
		this.healthPotion = healthPotion;
	}
	public int getAttackDamage() {
		if (playerClass.equals("Mage")) {			
			this.attackDamage = 45;
		}else if(playerClass.equals("Warrior")) {			
			this.attackDamage = 50;
		}else if (playerClass.equals("Artillerist")) {			
			this.attackDamage = 60;
		}		
		return attackDamage;
	}
	public void setAttackDamage(int attackDamage) {
		this.attackDamage = attackDamage;
	}
	public int getHealthPool() {
		if (playerClass.equals("Mage")) {			
			this.healthPool = 150;
		}else if(playerClass.equals("Warrior")) {			
			this.healthPool = 200;
		}else if (playerClass.equals("Artillerist")) {			
			this.healthPool = 175;
				}
		return healthPool;
	}
	public void setHealthPool(int healthPool) {
		this.healthPool = healthPool;
	}
	
	public String setSubClassAttack1() {
		return a1;
		}
	
	public void getSubClassAttack1() {
		if(Player.getPlayerSubclass().equals("Berzerker")){
			this.a1 = "Fury Strike";
		}else if(Player.getPlayerSubclass().equals("Dual Swordsman")) {
			this.a1 = "Piercing Strike";
		}else if(Player.getPlayerSubclass().equals("Knight Lancer")) {
			this.a1 = "Shield Bash";
		}else if(Player.getPlayerSubclass().equals("Warlock")) {
			this.a1 = "Runestorm";
		}else if(Player.getPlayerSubclass().equals("Elementalist")) {
			this.a1 = "Fire Tornado";
		}else if(Player.getPlayerSubclass().equals("Bard")) {
			this.a1 = "Resonating Strike";
		}else if(Player.getPlayerSubclass().equals("Sharpshooter")) {
			this.a1 = "Bullet Rain";
		}else if(Player.getPlayerSubclass().equals("Cannoner")) {
			this.a1 = "Cannon Barrage";
		}else if(Player.getPlayerSubclass().equals("Archer")) {
			this.a1 = "Switfshot";			
		}
	}
	
	public String setSubClassAttack2() {
		return a2;
		}
	
	public void getSubClassAttack2() {
		if(Player.getPlayerSubclass().equals("Berzerker")){
			this.a2 = "Howling Roar";
		}else if(Player.getPlayerSubclass().equals("Dual Swordsman")) {
			this.a2 = "Backstab";
		}else if(Player.getPlayerSubclass().equals("Knight Lancer")) {
			this.a2 = "Sword Thrust";
		}else if(Player.getPlayerSubclass().equals("Warlock")) {
			this.a2 = "Mystic Eruption";
		}else if(Player.getPlayerSubclass().equals("Elementalist")) {
			this.a2 = "Ice Blade";
		}else if(Player.getPlayerSubclass().equals("Bard")) {
			this.a2 = "Dissonance";
		}else if(Player.getPlayerSubclass().equals("Sharpshooter")) {
			this.a2 = "Quick Draw";
		}else if(Player.getPlayerSubclass().equals("Cannoner")) {
			this.a2 = "Charged Shot";
		}else if(Player.getPlayerSubclass().equals("Archer")) {
			this.a2 = "Explosive Arrow";	
		}
	}
	
	public String setSubClassAttack3() {
		return a3;
		}
	
	public void getSubClassAttack3() {
		if(Player.getPlayerSubclass().equals("Berzerker")){
			this.a3 = "Vicious Strike";
		}else if(Player.getPlayerSubclass().equals("Dual Swordsman")) {
			this.a3 = "Crossing Slash";
		}else if(Player.getPlayerSubclass().equals("Knight Lancer")) {
			this.a3 = "Charging Strike";
		}else if(Player.getPlayerSubclass().equals("Warlock")) {
			this.a3 = "Demonic Cut";
		}else if(Player.getPlayerSubclass().equals("Elementalist")) {
			this.a3 = "Lightning Storm";
		}else if(Player.getPlayerSubclass().equals("Bard")) {
			this.a3 = "Chaotic Chords";
		}else if(Player.getPlayerSubclass().equals("Sharpshooter")) {
			this.a3 = "Headshot";
		}else if(Player.getPlayerSubclass().equals("Cannoner")) {
			this.a3 = "Missle Blast";
		}else if(Player.getPlayerSubclass().equals("Archer")) {
			this.a3 = "Arrow to the Knee";
		}
	}
			
		
	
	
	public Player(int playerNumber) {
		super();
		this.playerNumber = playerNumber;
	}
	

}
