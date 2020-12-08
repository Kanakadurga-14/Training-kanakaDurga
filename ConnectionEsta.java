package com.mvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectionEsta 
{
public static Connection Conectivity() throws ClassNotFoundException, SQLException
{
Class.forName("com.mysql.cj.jdbc.Driver");
String url="jdbc:Mysql://localhost:3306/Rainbow";
String username="root";
String password="Root";
Connection con=DriverManager.getConnection(url, username, password);
return con;
}


}
 