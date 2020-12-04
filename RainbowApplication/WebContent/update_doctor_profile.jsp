 <!DOCTYPE html>
<html>
<head>
<title>DOCTOR HOME PAGE</title>
</head>
<body bgcolor="Lavender">
<br><br>
<center><h1>WELCOME TO THE DOCTOR HOME</h1></center>
<br><br>
<a href="doctor_Home.html">HOME</a>
<a href="doctor_Profile.jsp">PROFILE</a>
<a href="index.html">LOGOUT</a>
<br><br>
<%@ page import="java.sql.* " %>
<% 
Connection con=null;
PreparedStatement ps=null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url="jdbc:Mysql://localhost:3306/Rainbow";
String username="root";
String password="Root";
	con=DriverManager.getConnection(url, username, password);
	int doctor_id=Integer.parseInt(request.getParameter("doctor_id"));
	ps=con.prepareStatement("select * from Doctor where doctor_id=?");
	ps.setInt(1,doctor_id);
	ResultSet rs=ps.executeQuery();
	if(rs.next()){
	%>
	<form action="./doctor_profile_update.jsp"  align="center">
<input type= "hidden" name="doctor_id" value="<%=rs.getInt("doctor_id") %>>">	
<input type= "text" name="doctor_name" value="<%=rs.getString("doctor_name") %>>">
<input type="email" name="email" value="<%=rs.getString("email") %>>">
<input type="number" name="phoneno" value="<%=rs.getString("phoneno") %>>">
<select name= "specilisation">
<option value ="<%=rs.getString("specilisation")%>>"><%=rs.getString("specilisation") %></option>
<option value ="DENTAL"> DENTAL</option>
<option value="DIABETES">DIABETES</option>
<option value="GASTROENTEROLOGISTS">GASTROENTEROLOGISTS</option>
<option value="CARDIOLOGIST">CARDIOLOGIST</option>
</select> 
<input type="submit" value="update">
</form>
<%}%>