package com.wipro.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/EmployeManagement")
public class EmployeManagement extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fno = request.getParameter("t1");
		String sno = request.getParameter("t2");
		
		//converting string type data to integer type data
		int x = Integer.parseInt(fno);
		int y = Integer.parseInt(sno);
		
		int z = x+y;
		
		PrintWriter pw = response.getWriter();
		pw.println("<h1> the sum is: " + z + "</h1>");
		
		pw.close();
	}

}
