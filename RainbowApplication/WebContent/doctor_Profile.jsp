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
<%@include file="connect.jsp" %>"
<table border="2" align="center" widtg="300" heigth="400" cellpadding="20">
<tr><td>doctor_id</td>
<td>doctor_name</td>
<td>doctor_password</td>
<td>email</td>
<td>phoneno</td>
<td>specilisation</td></tr>


<% 

	int doctor_id=(Integer)session.getAttribute("doctor_id");
	ps=con.prepareStatement("select * from Doctor where doctor_id=?");
	ps.setInt(1, doctor_id);
	//ps.setString(1,"email");
	ResultSet rs=ps.executeQuery();
	while(rs.next()){
%>
<tr> <td> <%=rs.getInt("doctor_id") %></td>
<td> <%=rs.getString("doctor_name") %></td>
<td> <%=rs.getString("doctor_password") %></td>
<td> <%=rs.getString("email") %></td>
<td><%=rs.getInt("phoneno") %></td>
<td> <%=rs.getString("specilisation") %></td>
<td> <a href="update_doctor_profile.jsp?doctor_id=<%=rs.getInt(1) %>">update</a></td>
</tr>
<%}%>
</table>
</body>
</html>

