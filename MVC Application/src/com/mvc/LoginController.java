package com.mvc;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class LoginController extends HttpServlet {
public void dopost(HttpServletRequest request,HttpServletResponse response) throws IOException {
	String email=request.getParameter("email");
	String  doctor_password=request.getParameter("doctor_password");
	LoginBean lb=new LoginBean();
	lb.setEmail(email);  
	lb.setPassword(doctor_password);
	HttpSession hs=request.getSession();
	hs.setAttribute("bean", lb);
	boolean status=false;
		try {
			status=lb.loginValidate(email, doctor_password);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(status)
		{
		 response.sendRedirect("./doctor_Home.html");
		}
		else
		{
			 response.sendRedirect("./doctor_Login.html");
		}
	}
}