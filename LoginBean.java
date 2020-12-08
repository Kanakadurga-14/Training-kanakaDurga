package com.mvc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginBean {
private String email,doctor_password;

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return doctor_password;
}

public void setPassword(String password) {
	this.doctor_password = password;
}
public boolean loginValidate(String email,String password) throws ClassNotFoundException, SQLException  {
	Connection con=ConnectionEsta.Conectivity();
	
PreparedStatement ps=con.prepareStatement("select * from Doctor where email=? and doctor_password=?");
ps.setString(1,email);
ps.setString(2, doctor_password);
ResultSet rs=ps.executeQuery();
if(rs.next())
{
	return true;
}
else
{
return true;
}
}

public boolean RegisterValidate(String doctor_name, String doctor_password2, String email2, String phoneno,
		String specilisation) {
	// TODO Auto-generated method stub
	return false;

	
}

public void setDoctor_name(String doctor_name) {
	// TODO Auto-generated method stub
	
}

public void setPhoneno(String phoneno) {
	// TODO Auto-generated method stub
	
}

public void setSpecilisation(String specilisation) {
	// TODO Auto-generated method stub
	
}

	
}

