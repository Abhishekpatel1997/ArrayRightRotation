package com.abhi.demo;
import javax.persistence.*;
@Entity
public class Person
{
	@Id@GeneratedValue
  private int personid;
  private String name;
  public int getPersonid()
  {
	return personid;
  }
  public void setPersonid(int personid)
  {
	this.personid=personid;
  }
  public String getName()
  {
	return name;
  }
  public void setName(String name)
  {
	this.name=name;	
  }
}