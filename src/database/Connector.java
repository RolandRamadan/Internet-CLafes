package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Connector {
	private static Connection instance = null;
	
	private Connector() {

	}
	
	public static synchronized Connection getInstance() {
		String USERNAME = "root";
		String PASSWORD = "";
		String HOST = "localhost:3306" ;
		String DATABASE = "allosdatabase";
		String URL = String.format("jdbc:mysql://%s/%s", HOST, DATABASE);
		
		if (instance == null) {
			try {
				instance = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return instance;
	}
}
