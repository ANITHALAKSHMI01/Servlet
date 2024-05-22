package com.chainsys.servlet.model;
public class Demo
{
	int id;
	String name;
	String email;
	long phoneNo;
	String password;
	public Demo()
	{
		
	}
	public Demo(String name,String email,long phoneNo)
	{
		this.name=name;
		this.email=email;
		this.phoneNo=phoneNo;
	}
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	public long getPhoneNo()
	{
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo)
	{
		this.phoneNo = phoneNo;
	}
	public String getPassword() 
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	@Override
	public String toString()
	{
		return "Demo [id=" + id + ", name=" + name + ", email=" + email + ", phoneNo=" + phoneNo + ", password="
				+ password + "]";
	}
}
