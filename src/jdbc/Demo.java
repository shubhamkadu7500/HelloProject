package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jdbcURL = "jdbc:mysql://localhost:3306/demoDB?useSSL=false";
		String username = "root";
		String password = "password";
		Connection conn = null;
		
		try {
			System.out.println("connection to DB----");
			conn = DriverManager.getConnection(jdbcURL,username,password);
			System.out.println("Connection is successfull");
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		System.out.println();

	}

}
