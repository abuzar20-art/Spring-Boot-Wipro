package com.wipro;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {
	
	int eid;
	String name;
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + "]";
	}
	
	public Employee(int eid, String name) {
		super();
		this.eid = eid;
		this.name = name;
	}
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

}
