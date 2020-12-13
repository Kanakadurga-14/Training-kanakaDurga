package com.mvc;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class RegisterController extends HttpServlet {
public void doget(HttpServletRequest request,HttpServletResponse response) throws IOException, ClassNotFoundException, SQLException {
	String doctor_name=request.getParameter("doctor_name");
	String doctor_password=request.getParameter("doctor_password");
	String email=request.getParameter("email");
	String phoneno=request.getParameter("phoneno"); 
	long mobile=Long.parseLong(phoneno);
	String specilisation=request.getParameter("specilisation");
	LoginBean lb=new LoginBean();
	 lb.setDoctor_name(doctor_name);
	lb.setPassword(doctor_password);
	lb.setEmail(email); 
	lb.setPhoneno(phoneno);
	lb.setSpecilisation(specilisation);
	HttpSession hs=request.getSession();
	hs.setAttribute("bean", lb);
	boolean status=false;
		status=lb.RegisterValidate(doctor_name, doctor_password,email,phoneno,specilisation);
		if(status)
		{
		 response.sendRedirect("./doctor_Home.html");
		}
		else
		{
			 response.sendRedirect("./doctor_register.html");
		}
	}
}