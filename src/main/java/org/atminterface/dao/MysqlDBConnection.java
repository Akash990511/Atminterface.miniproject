package org.atminterface.dao;
import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;

	public class MysqlDBConnection {
		
		static final String DB_URL="jdbc:mysql://localhost:3306/";
		static final String DB_USER="root";
		static final String DB_PASSWORD="root";
		static final String DB_NAME="atm";

		public static Connection dbconnect() throws ClassNotFoundException
		{
			Connection connection=null;
			
			try 
			{		
				connection = DriverManager.getConnection(DB_URL+DB_NAME, DB_USER, DB_PASSWORD);	
			} 
			catch (SQLException e) 
			{		
				System.out.println("Connection Error!!");
			}
			
			return connection;
		
		}

	}
