package Mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Delete {

	public static void main(String[] args) throws ClassNotFoundException, SQLException  {
		// TODO Auto-generated method stub
		String url="jdbc:Mysql://localhost:3306/jnit";
		String username="root";
		String password="Root";
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter id no"); 
		int emp_id = scanner.nextInt(); 
		
		String query2="delete from  Employee_detalis where "+emp_id+" ";
		Connection connection =null; 


		Connection con=DriverManager.getConnection(url, username, password);

		Statement st = con.createStatement(); 
		int m = st.executeUpdate(query2); 
		if (m == 1) 
		    System.out.println("deleted  successfully ="+query2); 
		
		}  

		

	}

