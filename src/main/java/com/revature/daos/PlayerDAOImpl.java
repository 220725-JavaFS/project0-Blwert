package com.revature.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.models.Player;
import com.revature.utils.ConnectionUtil;

public class PlayerDAOImpl implements PlayerDAO {
	
	@Override
	public Player getUserID(int id) {
		try(Connection conn = ConnectionUtil.getConnection()){
			String sql = "SELECT * FROM players WHERE player_number = " + id + ";";
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			
			if(result.next()) { 
				Player player = new Player(
						result.getInt("player_number"),
						result.getString("player_name"),
						result.getString("player_class"),
						result.getString("player_subclass")
					);
				return player;
			}

}catch(SQLException e) {
	e.printStackTrace();
}
		return null;
	}

	@Override
	public List<Player> allPlayers() {
		try(Connection conn = ConnectionUtil.getConnection()){
			String sql = "SELECT * FROM players;";
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			
			List<Player> player2 = new ArrayList<>();
			
			while(result.next()) { 
				Player player = new Player(
						result.getInt("player_number"),
						result.getString("player_name"),
						result.getString("player_class"),
						result.getString("player_subclass")
					);
				player2.add(player);
			}
		
		return player2;
		
	}catch(SQLException e) {
	e.printStackTrace();
}
		return null;
	}
	
	
	
	@Override
	public void addPlayer(Player player) {
		try(Connection conn = ConnectionUtil.getConnection()){
			String sql = "INSERT INTO players (player_name, player_class, player_subclass)"
					+ "	VALUES (?, ?, ?);";
			
			PreparedStatement statement = conn.prepareStatement(sql);
						
			int count = 0;
			statement.setString(++count, player.getPlayerName());
			statement.setString(++count, player.getPlayerClass());
			statement.setString(++count, Player.getPlayerSubclass());
			statement.execute();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
	}	
	
	
	
}
