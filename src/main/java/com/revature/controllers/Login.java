package com.revature.controllers;

import java.util.List;
import java.util.Scanner;

import com.revature.models.Player;
import com.revature.services.PlayerService;

public class Login {
		// Login for Admin Access
		private Scanner in = new Scanner(System.in);
		private PlayerService todo = new PlayerService();
				
		public void Register() {			
			String choice = "";
		GameLoop:
		while(!in.equals("$")) {
			List<Player> player = todo.playerList();
			for (Player a : player) {				
			}
				}
		}  

}

