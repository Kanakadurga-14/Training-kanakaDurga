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

public class EmployeeRegister extends HttpServlet {
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
			String Ename=request.getParameter("Ename");
			String Epassword=request.getParameter("Epassword");
			String Esalary=request.getParameter("Esalary");
			
			String Ephoneno=request.getParameter("Ephoneno");
			long mobile=Long.parseLong(Ephoneno);
			String Eemail=request.getParameter("Eemail");
			String Eage=request.getParameter("Eage");
			
			String Eaddress=request.getParameter("Eaddress");
			PrintWriter pw=response.getWriter();
		String sql="insert into Employee(Ename,Epassword,Esalary,Ephoneno,Eemail,Eage,Eaddress) values(?,?,?,?,?,?,?)";
			try {
			ps=con.prepareStatement(sql);
				ps.setString(1,Ename);
				ps.setString(2,Epassword);
				ps.setString(3,Esalary);
				ps.setLong(4, mobile);
	 			ps.setString(5,Eemail);
				ps.setString(6,Eage);
				ps.setString(7,Eaddress);
				pw.println("<html><body bgcolor='Lavender'><center><h1>");
				int a=ps.executeUpdate();
				if(a!=0) 
					pw.println("Employee registration is succesfull");
					pw.println("</h1></center></body></html>");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
