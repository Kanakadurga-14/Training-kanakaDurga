package Mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Alterquery {

	public static void main(String[] args)throws ClassNotFoundException , SQLException  {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url="jdbc:Mysql://localhost:3306/jnit";
		String username="root";
		String password="Root";
		Scanner scanner = new Scanner(System.in);
		
		String query="alter table customers add company_name varchar(50)";
		Connection connection =null; 


		Connection con=DriverManager.getConnection(url, username, password);

		Statement st = con.createStatement(); 
		int m = st.executeUpdate(query); 
		if (m == 1) 
		    System.out.println("added successfully : "+query); 
		else
		    System.out.println("insertion failed");  
		
	}

}
