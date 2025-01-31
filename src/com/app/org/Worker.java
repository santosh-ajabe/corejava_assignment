package com.app.org;

public class Worker extends Employee {

	int hrsofwork;
	
	double hourlyrate;
	
	public Worker() {
		
		 super();
		 this.hrsofwork=0;
		 this.hourlyrate=0;
		 
		 
	}
		
	public Worker( int id, String name, String deptid, double salary) {
		super(id, name,deptid,salary);
		this.hourlyrate=0;
		this.hrsofwork=0;
		
	}

	@Override
	public String toString() {
		return "Worker [hrsofwork=" + hrsofwork + ", hourlyrate=" + hourlyrate + "]";
	}

	public int getHrsofwork() {
		return hrsofwork;
	}

	public void setHrsofwork(int hrsofwork) {
		this.hrsofwork = hrsofwork;
	}

	public double getHourlyrate() {
		return hourlyrate;
	}

	public void setHourlyrate(double hourlyrate) {
		this.hourlyrate = hourlyrate;
	}
	
	
	@Override
	
	public double computenetSalary()
	{
		return this.getSalary()+this.hrsofwork*hourlyrate;
	}
	
}
