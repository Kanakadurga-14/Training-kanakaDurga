package com.jnit;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DoctorRegister extends HttpServlet {
		Connection con=null;
		PreparedStatement ps=null;
		public void init(ServletConfig config)
		{
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String url="jdbc:Mysql://localhost:3306/Rainbow";
			String username="root";
			String password="Root";
			try {
				con=DriverManager.getConnection(url, username, password);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			}
		public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated   stub;
			String doctor_name=request.getParameter("doctor_name");
			String doctor_password=request.getParameter("doctor_password");
			String email=request.getParameter("email");
			String phoneno=request.getParameter("phoneno");
			long mobile=Long.parseLong(phoneno);
			String specilisation=request.getParameter("specilisation");
			PrintWriter pw=response.getWriter();
String sql="insert into Doctor(doctor_name,doctor_password,email,phoneno,specilisation) values(?,?,?,?,?)";
			try {;
			ps=con.prepareStatement(sql);
				ps.setString(1,doctor_name);
				ps.setString(2,doctor_password);
				ps.setString(3,email);
				ps.setLong(4, mobile);
				ps.setString(5,specilisation);
				pw.println("<html><body bgcolor='Lavender'><center><h1>");
				int a=ps.executeUpdate();
				if(a!=0) {
					pw.println("doctor registration is succesfull");
					pw.println("</h1></center></body></html>");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
