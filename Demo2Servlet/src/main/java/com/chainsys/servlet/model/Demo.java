package com.chainsys.servlet.model;
public class Demo
{
	int id;
	String name;
	String dateOfBirth;
	String email;
	long phoneNo;
	String password;
	public Demo()
	{
		
	}
	public Demo(int id,String name,String dateOfBirth,String email,long phoneNo)
	{
		this.id=id;
		this.name=name;
		this.dateOfBirth=dateOfBirth;
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
	public String getDateOfBirth()
	{
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth)
	{
		this.dateOfBirth = dateOfBirth;
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
		return "Demo [id=" + id + ", name=" + name + ", dateOfBirth=" + dateOfBirth + ", email=" + email + ", phoneNo="
				+ phoneNo + ", password=" + password + "]";
	}
}
