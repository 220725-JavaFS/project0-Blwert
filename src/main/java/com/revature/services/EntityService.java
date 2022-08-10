package com.revature.services;

import com.revature.daos.DAO;
import com.revature.daos.DAOImpl;
import com.revature.models.Entity;

public class EntityService {
	
	private DAO fred = new DAOImpl();
	
	public Entity getEnemey(int difficulty) {
		return fred.getEnemey(difficulty);
	}
	
	public Entity getBoss(int difficulty) {
		return fred.getBoss(difficulty);
	}

}
