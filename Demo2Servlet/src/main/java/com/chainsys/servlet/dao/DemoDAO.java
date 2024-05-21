package com.chainsys.servlet.dao;
import java.sql.SQLException;
import com.chainsys.servlet.model.Demo;
public interface DemoDAO 
{
	void saveDetails(Demo demo) throws ClassNotFoundException, SQLException;
}
