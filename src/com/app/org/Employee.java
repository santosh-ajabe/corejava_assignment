package com.app.org;

public class Employee {

	int id;
	String name;
	String deptid;
	double salary;
	
	public Employee() {
		
		this.id=0;
		this.name=null;
		this.deptid="id not found";
		this.salary=0;
		
	}
	
	public Employee(int id, String name, String deptid, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.deptid = deptid;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", deptid=" + deptid + ", salary=" + salary + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDeptid() {
		return deptid;
	}

	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double computenetSalary()
	{
		return 0;
		
	}

	public void setBasic(double newBasic) {
		// TODO Auto-generated method stub
		
		
	}
	

}
