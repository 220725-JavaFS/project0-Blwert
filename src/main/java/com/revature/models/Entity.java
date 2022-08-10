package com.revature.models;

import java.util.Objects;

public class Entity {
	
	private int healthPool;
	private int attackDamage;
	private String alias;
	private int difficulty;
	
	
	public Entity(int healthPool, int attackDamage, String alias, int difficulty) {
		super();
		this.healthPool = healthPool;
		this.attackDamage = attackDamage;
		this.alias = alias;
		this.difficulty = difficulty;
	}


	public Entity() {
		super();
	}


	public int getDifficulty() {
		return difficulty;
	}


	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}


	public int getHealthPool() {
		return healthPool;
	}


	public void setHealthPool(int healthPool) {
		this.healthPool = healthPool;
	}


	public int getAttackDamage() {
		return attackDamage;
	}


	public void setAttackDamage(int attackDamage) {
		this.attackDamage = attackDamage;
	}


	public String getAlias() {
		return alias;
	}


	public void setAlias(String alias) {
		this.alias = alias;
	}


	@Override
	public int hashCode() {
		return Objects.hash(alias, attackDamage, difficulty, healthPool);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Entity other = (Entity) obj;
		return Objects.equals(alias, other.alias) && attackDamage == other.attackDamage
				&& difficulty == other.difficulty && healthPool == other.healthPool;
	}


	@Override
	public String toString() {
		return "Entity [healthPool=" + healthPool + ", attackDamage=" + attackDamage + ", alias=" + alias
				+ ", difficulty=" + difficulty + "]";
	}

	
	
}
