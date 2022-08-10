package com.revature.models.classes;

public class Classes {
	private int healthPool;
	private int attackDamage;
	private String playerClass;
	
	
	public int getHealthPool() {
		this.playerClass = "Mage";
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
	public int getAttackDamage() {
		this.playerClass = "";
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
	public String getPlayerClass() {
		return playerClass;
	}
	public void setPlayerClass(String playerClass) {
		this.playerClass = playerClass;
	}
	
	}
