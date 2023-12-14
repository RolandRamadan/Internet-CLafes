package main;

import java.sql.Connection;

import database.Connector;

public class Main {

	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		
		Connection con = Connector.getInstance();
	}
	
}
