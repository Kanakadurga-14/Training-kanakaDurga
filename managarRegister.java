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

public class managarRegister extends HttpServlet {
		private static final String Int = null;
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
			String Mname=request.getParameter("Mname");
		
			String Msalary=request.getParameter("Msalary");
			
			String Mphoneno=request.getParameter("Mphoneno");
			long mobile=Long.parseLong(Mphoneno);
			String Memail=request.getParameter("Memail");
			String Mage=request.getParameter("Eage");
			
			String Maddress=request.getParameter("Maddress");
			PrintWriter pw=response.getWriter();
		String sql="insert into manager(Mname,Msalary,Mphoneno,Memail,Mage,Maddress) values(?,?,?,?,?,?)";
			try {
			ps=con.prepareStatement(sql);
				ps.setString(1,Mname);
		
				ps.setString(2,Msalary);
				ps.setLong(3, mobile);
	 			ps.setString(4,Memail);
				ps.setString(5,Mage);
				ps.setString(6,Maddress);
				pw.println("<html><body bgcolor='Lavender'><center><h1>");
				int a=ps.executeUpdate();
				if(a!=0) 
					pw.println("manager registration is succesfull");
					pw.println("</h1></center></body></html>");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
