package com.chainsys.servlet.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.chainsys.servlet.model.Demo;
import com.chainsys.util.ConnectionUtil;
public class DemoImplementation implements DemoDAO
{
	public void saveDetails(Demo demo) throws ClassNotFoundException, SQLException 
	{
		Connection connection=ConnectionUtil.getConnection();
//		System.out.println(connection);
		String addDetails="insert into demo(name,email,phone_no)values(?,?,?)";
		PreparedStatement prepareStatement=connection.prepareStatement(addDetails);
		prepareStatement.setString(1,demo.getName());
		prepareStatement.setString(2, demo.getEmail());
		prepareStatement.setLong(3, demo.getPhoneNo());
		int row=prepareStatement.executeUpdate();
//		System.out.println(row+" inserted");
	}
}
