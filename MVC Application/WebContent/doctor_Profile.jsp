<!DOCTYPE html>
<html>
<head>
<title>DOCTOR HOME PAGE</title>
</head>
<body bgcolor="Lavender">
<br><br>
<center><h1>WELCOME TO THE DOCTOR HOME</h1></center>
<br><br>
<a href="doctor_Home.html">HOME|:</a>
<a href="doctor_Profile.jsp">DOCTOR PROFILE|:</a>
<a href="Patient_Profile.jsp">PATIENT PROFILE|:</a>
<a href="view_appointment.jsp">APPOINTMENT DETALIS|:</a>
<a href="index.html">LOGOUT</a>
<br><br>
<%@page import="com.mvc.LoginBean" %>
<%
LoginBean lb=(LoginBean)session.getAttribute("bean");
%>
<%=lb.getEmail() %>
</body>
</html>