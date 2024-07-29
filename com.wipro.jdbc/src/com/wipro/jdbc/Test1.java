package com.wipro.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test1 {
	public static void main(String[] args) throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system","system");
	
		con.setAutoCommit(false);
		Statement st = con.createStatement();
		st.addBatch("update rama set bal=bal-2000 where accno=1000");
		st.addBatch("update sitha set bal=bal+2000 where accno=1001");
	
	
		int x[]=st.executeBatch();
	
		if(x[0]>0&x[1]>0)
		{
			con.commit();
			System.out.println("funds transffered successfully, have a nice day");
		}
		else
		{
			con.rollback();
			System.out.println("something went wrong, kindly check your account numbers");
		}

	}
}