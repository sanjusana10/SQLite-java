package net.codejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLiteDemo {

	public static void main(String[] args) {
		String jdbcUrl="jdbc:sqlite:/C:\\sqlite\\sqlite_tools\\usersdb.db";
        try {
			Connection connection= DriverManager.getConnection(jdbcUrl);
			String sql="SELECT * From movie";
			Statement statement=connection.createStatement();
			
			ResultSet result=statement.executeQuery(sql);
			
			while(result.next()) {
				String name= result.getString("name");
				String actor= result.getString("actor");
				String actress= result.getString("actress");
				String director= result.getString("director");
				int year=result.getInt("year");
				
				System.out.println(name +"|"+actor+ "|" +actress+ "|" +director+ "|" +year);
			}
			
        } catch (SQLException e) {
			System.out.println("Error in Sqlite database connection");
			e.printStackTrace();
		}
	}

}
