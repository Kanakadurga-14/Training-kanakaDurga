<!DOCTYPE html>
<html>
<head>
<title>DOCTOR HOME PAGE</title>
</head>
<body bgcolor=" Lavender ">
<br><br>
<center><h1>WELCOME TO THE DOCTOR HOME</h1></center>
<br><br>
<a href="doctor_Home.html">HOME|:</a>
<a href="doctor_Profile.jsp">DOCTOR PROFILE|:</a>
<a href="Patient_Profile.jsp">PATIENT PROFILE|:</a>
<a href="view_appointment.jsp">APPOINTMENT DETALIS|:</a>
<a href="index.html">LOGOUT</a>
<br><br>
<%@include file="connect.jsp" %>
<table border="2" width="600" heigth="300" cellpadding="20" align="center">
<tr><td> patient_name</td><td>phone</td><td>email</td><td>gender</td><td>blood_group</td><td>specialist</td><td>date</td><td>time</td>
><td>status</td><td>doctor_name</td><td>Action</td>
</tr>
<%
ps=con.prepareStatement("select * from Appointment");
ResultSet rs=ps.executeQuery();
while(rs.next()){
	%>
<tr>
<td><%=rs.getString(2) %></td>
<td><%=rs.getInt(3) %></td>
<td><%=rs.getString(4) %></td>
<td><%=rs.getString(5) %></td>
<td><%=rs.getString(6) %></td>
<td><%=rs.getString(7) %></td>
<td><%=rs.getString(8) %></td>
<td><%=rs.getString(9) %></td>
<td><%=rs.getString(10) %></td>
<td><%=rs.getString(11) %></td>
<td><a href="accept.jsp?id=<%=rs.getInt(1) %>">Accept</a>
</tr>
<%} %>
</table>
</body>
</html>