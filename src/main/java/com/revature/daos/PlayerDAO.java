package com.revature.daos;

import java.util.List;

import com.revature.models.Player;


public interface PlayerDAO {
	
	public Player getUserID(int id);
	
	List<Player> allPlayers();
	
	public abstract void addPlayer(Player player);

}
