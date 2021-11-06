package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import project.Contact;

///jdbc
public class AddContactDao 
{
	public boolean AddContact(Contact obj) 
	{
		String DBurl = "jdbc:mysql://localhost:3306/SimpleContactBook";
		String DBuser = "root";
		String DBpass = "Pranik@123";
		String sql = "insert into Contacts values(?,?,?,?,?)";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(DBurl, DBuser, DBpass);
			PreparedStatement pst = con.prepareStatement(sql);

			pst.setString(1, obj.getName());
			pst.setString(2, obj.getEmail());
			pst.setString(3, obj.getMobile());
			pst.setString(4, obj.getOccupation());
			pst.setString(5, obj.getPlace());

			pst.executeUpdate();

			return true;

		} catch (Exception e) 
		{
			e.printStackTrace();
			return false;
		}

	}
}
