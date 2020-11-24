package Mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Connectionusingscanner {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Url");
		String url=scanner.next();
		System.out.println("Enter UserName");
		String userName = scanner.next();
		System.out.println("Enter Password");
		String password = scanner.next();
		Connection connection = null;
	try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con  = DriverManager.getConnection(url, userName, password);
			if (con != null)
			{
				System.out.println("Successfullly connected to MySQL ");
			}
			else 
			{
				System.out.println("Failed to connect to MySQL ");
			}
			

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}	
         catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
