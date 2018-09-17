package com.pojo;

import java.io.Serializable;

public class Person2  implements Serializable{
private int perid; 
private String personName;
private String personAddress;
private int personAge;
public Person2()
{
	perid=32;
	personName="dh";
	personAddress="sdfj";
	personAge=32;
}
public Person2 (int perid,String personName,String personAdderss,int personAge)
{
	this.perid=perid;
	this.personName=personName;
	this.personAddress=personAdderss;
	this.personAge=personAge;
}
public int getPerid() {
	return perid;
}
public void setPerid(int perid) {
	this.perid = perid;
}
public String getPersonName() {
	return personName;
}
public void setPersonName(String personName) {
	this.personName = personName;
}
public String getPersonAddress() {
	return personAddress;
}
public void setPersonAddress(String personAddress) {
	this.personAddress = personAddress;
}
public int getPersonAge() {
	return personAge;
}
public void setPersonAge(int personAge) {
	this.personAge = personAge;
}

}
