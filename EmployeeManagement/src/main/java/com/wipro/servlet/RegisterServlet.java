package com.wipro.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private static final String query="INSERT INTO EMPLOYEE(EMPLOYEENAME,CODE,EMPLOYEESALARY) VALUES(?,?,?)";
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String employeeName=req.getParameter("employeeName");
		String employeeCode= req.getParameter("employeeCode");
		float employeeSalary=Float.parseFloat(req.getParameter("employeeSalary"));
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException cnf) {
			cnf.printStackTrace();
		}
		try(Connection con=DriverManager.getConnection("jdbc:mysql:///employee","root","Zeba@123");
				PreparedStatement ps=con.prepareStatement(query);){
			ps.setString(1, employeeName);
			ps.setString(2,employeeCode);
			ps.setFloat(3,employeeSalary);
			int count=ps.executeUpdate();
			if(count==1) {
				pw.println("<h2> Record is registered sucessfully</h2>");
			}else {
				pw.println("<h2> Record not registered sucessfully</h2>");
			}
		}catch(SQLException se) {
			se.printStackTrace();
			pw.println("<h1>"+se.getMessage()+"</h2>");
		}catch(Exception e) {
			e.printStackTrace();
			pw.println("<h1>"+e.getMessage()+"</h2>");
		}
		pw.println("<a href='home.html'> Home </a>");
		pw.println("<br>");
		pw.println("<a href='employeeList'> Employee List </a>");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req,res);
	}

}
