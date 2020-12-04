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
	String doctor_name=request.getParameter("doctor_name");
	String email=request.getParameter("email");
	long phoneno=Long.parseLong(request.getParameter("phoneno"));
	String specilisation=request.getParameter("specilisation");
ps=con.prepareStatement("update Doctor set doctor_name=?,email=?,phoneno=?,specilisation=? where doctor_id=?");
	ps.setString(1,doctor_name);
	ps.setString(2,email);
	ps.setLong(3,phoneno);
	ps.setString(4, specilisation);
	ps.setInt(5,doctor_id);
	int x=ps.executeUpdate();
	if(x!=0)
		response.sendRedirect("doctor_profile.jsp?msg=updated");
		%>