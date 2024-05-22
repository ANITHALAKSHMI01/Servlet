package com.chainsys.servlet.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.chainsys.servlet.model.Demo;
import com.chainsys.util.ConnectionUtil;
public class DemoImplementation implements DemoDAO
{
	@Override
	public void saveDetails(Demo demo) throws ClassNotFoundException, SQLException 
	{
		Connection connection=ConnectionUtil.getConnection();
		String addDetails="insert into demo(name,email,phone_no,password)values(?,?,?,?)";
		PreparedStatement prepareStatement=connection.prepareStatement(addDetails);
		prepareStatement.setString(1,demo.getName());
		prepareStatement.setString(2, demo.getEmail());
		prepareStatement.setLong(3, demo.getPhoneNo());
		prepareStatement.setString(4, demo.getPassword());
		int row=prepareStatement.executeUpdate();
		connection.close();
	}
	@Override
	public List<Demo> retriveDetails() throws ClassNotFoundException, SQLException 
	{
		ArrayList<Demo> list=new ArrayList<>();
		Connection connection=ConnectionUtil.getConnection();
		String select="select id,name,email,phone_no from demo";
		PreparedStatement prepareStatement=connection.prepareStatement(select);
		ResultSet resultSet=prepareStatement.executeQuery();
		while(resultSet.next())
		{
			String id=resultSet.getString(1);
			String name=resultSet.getString(2);
			String email=resultSet.getString(3);
			String phoneNo=resultSet.getString(4);
			int id1=Integer.parseInt(id);
			long phoneNumber=Long.parseLong(phoneNo);
			Demo demo=new Demo();
			demo.setId(id1);
			demo.setName(name);
			demo.setEmail(email);
			demo.setPhoneNo(phoneNumber);
			list.add(demo);
		}
		connection.close();
		return list;
	}
	@Override
	public void updateDetails(Demo demo) throws ClassNotFoundException, SQLException 
	{
		Connection connection=ConnectionUtil.getConnection();
		String update="update demo set password=? where id=? ";
		PreparedStatement prepareStatement=connection.prepareStatement(update);
		prepareStatement.setString(1, demo.getPassword());
		prepareStatement.setInt(2, demo.getId());
		prepareStatement.executeUpdate();
		connection.close();
	}
	@Override
	public void deleteDetails(Demo demo) throws ClassNotFoundException, SQLException 
	{
		Connection connection=ConnectionUtil.getConnection();
		String delete="delete from demo where id=? ";
		PreparedStatement prepareStatement=connection.prepareStatement(delete);
		prepareStatement.setInt(1, demo.getId());
		prepareStatement.executeUpdate();	
		connection.close();
	}

}
