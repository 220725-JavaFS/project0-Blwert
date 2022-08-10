package com.revature.daos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.revature.models.Entity;
import com.revature.utils.ConnectionUtil;

public class DAOImpl implements DAO {

	@Override
	public Entity getEnemey(int difficulty) {
		try(Connection conn = ConnectionUtil.getConnection()){
			String sql = "SELECT * FROM enemies WHERE difficulty = " + difficulty + "AND is_boss = FALSE ORDER BY RANDOM() LIMIT 1;";
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			
			if(result.next()) {
				Entity entity = new Entity(
						result.getInt("health_pool"),
						result.getInt("attack_damage"),
						result.getString("alias"),
						result.getInt("difficulty")
);
				return entity;
				}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public Entity getBoss(int difficulty) {
		try(Connection conn = ConnectionUtil.getConnection()){
			String sql = "SELECT * FROM enemies WHERE difficulty = " + difficulty + "AND is_boss = TRUE ORDER BY RANDOM() LIMIT 1;";
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			
			if(result.next()) {
				Entity entity = new Entity(
						result.getInt("health_pool"),
						result.getInt("attack_damage"),
						result.getString("alias"),
						result.getInt("difficulty")
);
				return entity;
				}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
