package Mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateQuery {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url="jdbc:Mysql://localhost:3306/jnit";
		String username="root";
		String password="Root";
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter company  name"); 
		String company_name = scanner.next();
		
		
		
		String query1="update customers set '"+company_name+"' ";
		Connection connection =null; 


		Connection con=DriverManager.getConnection(url, username, password);

		Statement st = con.createStatement(); 
		int m = st.executeUpdate(query1); 
		if (m == 1) 
		    System.out.println("inserted successfully : "+query1); 
		else
		    System.out.println("insertion failed");  
}
}