<!DOCTYPE html>
<html>
<head>
<title>DOCTOR HOME PATIENT PAGE</title>
</head>
<body bgcolor="Lavender">
<br><br>
<center><h1>WELCOME TO THE  PATIENT HOME</h1></center>
<br><br><br>
<a href="doctor_Home.html">HOME</a>
<a href="Patient_Profile.jsp">PROFILE</a>
<a href="index.html">LOGOUT</a>
<br><br><br>  
<%@ page import="java.sql.* " %>
<table border="2" align="center" widtg="300" heigth="400" cellpadding="20">
<tr><td>id</td>
<td>name</td>
<td>password</td>
<td>email</td>
<td>phoneno</td>
<td>specilisation</td></tr>

<% 
Connection con=null;
PreparedStatement ps=null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url="jdbc:Mysql://localhost:3306/Rainbow";
String username="root";
String password="Root";
	con=DriverManager.getConnection(url, username, password);
	 String email=(String)session.getAttribute("semail");
	ps=con.prepareStatement("select * from Patient where email=?");
	ps.setString(1,email);
	ResultSet rs=ps.executeQuery();
	while(rs.next()){
%>
<tr> <td> <%=rs.getInt("id") %> </td>  
<td> <%=rs.getString("name") %></td>
<td> <%=rs.getString("password") %></td>
<td> <%=rs.getString("email") %></td>
<td><%=rs.getInt("phoneno") %></td>
<td> <%=rs.getString("specilisation") %></td>
</tr>
<%}  %>
</table>
</body>
</html>

