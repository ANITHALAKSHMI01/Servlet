package com.chainsys.servlet.model;
public class Demo
{
	String name;
	String email;
	long phoneNo;
	public Demo()
	{
		
	}
	public Demo(String name,String email,long phoneNo)
	{
		this.name=name;
		this.email=email;
		this.phoneNo=phoneNo;
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
	@Override
	public String toString() 
	{
		return "Demo [name=" + name + ", email=" + email + ", phoneNo=" + phoneNo + "]";
	}
}
