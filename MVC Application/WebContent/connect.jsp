<%@ page import="java.sql.* " %>
<% 
Connection con=null;
PreparedStatement ps=null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url="jdbc:Mysql://localhost:3306/Rainbow";
String username="root";
String password="Root";
	con=DriverManager.getConnection(url, username, password);
	%>