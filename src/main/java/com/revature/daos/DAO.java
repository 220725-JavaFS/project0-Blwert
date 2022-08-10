package com.revature.daos;

import com.revature.models.Entity;

public interface DAO {
	
	public Entity  getEnemey(int difficulty); 
	
	
	public Entity getBoss(int difficulty);

}
