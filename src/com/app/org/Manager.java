package com.app.org;

public class Manager extends Employee {

	double performancebonus;
	
	public Manager() {
		 super();
		 this.performancebonus=4648;
	}
	
	public Manager(int id, String name, String deptid,double salary) {
		
		super(id, name, deptid, salary);
		this.performancebonus=245;
		
		
	}
	
	public Manager(int id, String name, String deptid, double salary, double perfomancebonus) {
		super(id, name, deptid, salary);
		this.performancebonus=perfomancebonus;
		
	}
	public double getperfomancebonus() {
		
		return performancebonus;
	}
	
	public void setperfomancebonus(double performancebonus) {
		this.performancebonus=performancebonus;
	}

	@Override
	public String toString() {
		return "Manager [performancebonus=" + performancebonus + ", id=" + id + ", name=" + name + ", deptid=" + deptid
				+ ", salary=" + salary + "]";
	}
	
	
	
//	public String toString() {
//		 return super.toString() +"[performsncebonus=" +performancebonus +"]";
//	}
	
	@Override
	public double computenetSalary() {
		return this.getSalary()+this.performancebonus;
	}
}
