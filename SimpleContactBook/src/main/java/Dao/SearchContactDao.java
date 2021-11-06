package Dao;

import project.Contact;
import java.sql.*;

public class SearchContactDao 
{
	public Contact getContact(String searchName)
	{
		Contact c1 = new Contact();
		
		String DBurl = "jdbc:mysql://localhost:3306/SimpleContactBook";
		String DBuser = "root";
		String DBpass = "Pranik@123";
		
		//String Query ="select * from con where Name="+ searchName+"";
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(DBurl, DBuser, DBpass);
			Statement st = con.createStatement();
			
			ResultSet rs =  st.executeQuery("select * from contacts where Name=" +"'"+ searchName+"'");
			
			if(rs.next())
			{
				c1.setName(rs.getString("Name"));
				c1.setEmail(rs.getString("Email"));
				c1.setMobile(rs.getString("Mobile"));
				c1.setOccupation(rs.getString("Occupation"));
				c1.setPlace(rs.getString("Place"));
			}
			
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		
		
		return c1;
	}
}
