package com.mvc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RegisterBean {
private String doctor_name,doctor_password,email,phoneno,specilisation;


public String getDoctor_name() {
	return doctor_name;
}


public void setDoctor_name(String doctor_name) {
	this.doctor_name = doctor_name;
}


public String getDoctor_password() {
	return doctor_password;
}


public void setDoctor_password(String doctor_password) {
	this.doctor_password = doctor_password;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


public String getPhoneno() {
	return phoneno;
}


public void setPhoneno(String phoneno) {
	this.phoneno = phoneno;
}


public String getSpecilisation() {
	return specilisation;
}


public void setSpecilisation(String specilisation) {
	this.specilisation = specilisation;
}


public boolean RegisterValidate(String doctor_name,String doctor_password,String email,String phoneno,String specilisation ) throws ClassNotFoundException, SQLException  {
	Connection con=ConnectionEsta.Conectivity();
	
PreparedStatement ps=con.prepareStatement("insert into Doctor(doctor_name,doctor_password,email,phoneno,specilisation) values(?,?,?,?,?)");

ps.setString(1,doctor_name);
ps.setString(2,doctor_password);
ps.setString(3,email);
ps.setString(4,phoneno);
ps.setString(5,specilisation);

int a=ps.executeUpdate();
if(a!=0) {
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
return false;
}
}