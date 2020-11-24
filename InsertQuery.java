package Mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
		
public class InsertQuery {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
String url="jdbc:Mysql://localhost:3306/jnit";
String username="root";
String password="Root";
Scanner scanner = new Scanner(System.in);
System.out.println("enter id no"); 
int emp_id = scanner.nextInt(); 
System.out.println("enter name"); 
String emp_name = scanner.next();
System.out.println("enter salary"); 
double emp_salary =  scanner.nextDouble(); 
System.out.println("enter age");
int emp_age=scanner.nextInt();
System.out.println("enter  company name"); 
String company_name = scanner.next();
String query="insert into Employee_detalis values(" +emp_id+",'"+emp_name+"',"+emp_salary+","+emp_age+" ,'"+company_name+"')";
Connection connection =null; 


Connection con=DriverManager.getConnection(url, username, password);

Statement st = con.createStatement(); 
int m = st.executeUpdate(query); 
if (m == 1) 
    System.out.println("inserted successfully : "+query); 
else
    System.out.println("insertion failed");  
}  

}
