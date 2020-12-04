package com.jnit;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class DoctorLogin extends HttpServlet {
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
		public void dopost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated   stub;
			String email=request.getParameter("email");
			String doctor_password=request.getParameter("doctor_password");
			PrintWriter pw=response.getWriter();
			String sql="select * from Doctor where email=? and doctor_password=?";
			try {
			ps=con.prepareStatement(sql);
			ps.setString(1,email);
				ps.setString(2,doctor_password);
				HttpSession hs=request.getSession();
				
	      
				ResultSet x=ps.executeQuery();
				if(x.next()) {
					hs.setAttribute("semail",email);
					hs.setAttribute("doctor_id",x.getInt(1));
					hs.setAttribute("specilisation",x.getString("specilisation"));
					response.sendRedirect("doctor_Home.html?msg=loggedin");
				}
					else 
						response.sendRedirect("doctor_Login.html?msg=failed");
					
					pw.println("</h1></center></body></html>");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
		}
	}
