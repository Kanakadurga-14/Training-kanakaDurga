package Mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Countquery {

	public static void main(String[] args)throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String url="jdbc:Mysql://localhost:3306/jnit";
		String username="root";
		String password="Root";
		Scanner scanner = new Scanner(System.in);
	
		String query="select count(customer_id) from customers";
				Connection connection =null; 
		Connection con=DriverManager.getConnection(url, username, password);

		Statement st = con.createStatement(); 
		ResultSet rs = st.executeQuery(query);
		while( rs.next())
		{
		    System.out.println(rs.getInt(1));
		}
	
	}

}
 