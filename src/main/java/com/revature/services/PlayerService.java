package com.revature.services;

import java.util.List;

import com.revature.daos.PlayerDAO;
import com.revature.daos.PlayerDAOImpl;
import com.revature.models.Player;

public class PlayerService {

	private PlayerDAO dao = new PlayerDAOImpl();
	
	public List<Player> playerList(){
		return dao.allPlayers();
	}
	
	public void addPlayer(Player player) {
		dao.addPlayer(player);
		}
	
}
