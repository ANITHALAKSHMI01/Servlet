package com.chainsys.servlet.dao;
import java.sql.SQLException;
import java.util.List;
import com.chainsys.servlet.model.Demo;
public interface DemoDAO 
{
	void saveDetails(Demo demo) throws ClassNotFoundException, SQLException;
	List<Demo> retriveDetails() throws ClassNotFoundException, SQLException;
	void deleteDetails(Demo demo) throws ClassNotFoundException, SQLException;
	void updateDetails(Demo demo) throws ClassNotFoundException, SQLException;
	List<Demo> search(Demo demo) throws ClassNotFoundException, SQLException;
	List<Demo> filter(String fromDate,String toDate) throws ClassNotFoundException, SQLException;
}
