package com.assignment1;

import java.util.Scanner;

public class Student {
	
	private int rollno;
	private String name;
	private double marks;
	

	public Student(int rollno, String name, double marks) {
		
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	
	public Student() {
		rollno=1;
		name="akshay";
		marks=34;
		
	}


	public void displaydata(int rollno, String name, double marks) {
		
	}
	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}
	
	public void show() {
        System.out.println("Roll No, " + rollno + ", Name, " + name + ", Marks, " + marks);
    }

	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		s1.displaydata(12, "akash", 70);
		
		System.out.println(s1);
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter your rollno");
		sc.nextInt();
		
		System.out.println("enter your name");
		sc.next();
		
		System.out.println("enter your marks");
		sc.nextDouble();
		System.out.println("your details");
		s1.show();
		
		
	}
}

