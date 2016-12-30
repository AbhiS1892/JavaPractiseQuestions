package com.abhi.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import static java.lang.System.*;

public class JdbcExample {

	public static void main(String[] args) {
		try {
			String url="jdbc:mysql://localhost:3306/abhi";
			String user="root";
			String password="test@123";
		    Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, password);
			con.setAutoCommit(false);
			PreparedStatement stmt=con.prepareStatement("insert into employee values (?,?,?)");
			stmt.setInt(1,9);
			stmt.setString(2, "ABHI");
			stmt.setInt(3, 16);
			int out2=stmt.executeUpdate();
			
			out.println(out2+" records inserted");
			
			ResultSet rs=stmt.executeQuery("select * from employee");
			
			while(rs.next()){
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			}
			con.commit();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
