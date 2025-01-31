package com.emptester;

import com.app.org.*;
import java.util.ArrayList;
import java.util.Scanner;

public class TestOrganization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();
        int choice;
        
        do {
            System.out.println("\n1. Hire Manager");
            System.out.println("2. Hire Worker");
            System.out.println("3. Display all employees");
            System.out.println("4. Update basic salary");
            System.out.println("5. Compute Worker Salary");
            System.out.println("6. Get Hourly Rate of Worker");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            
            switch (choice) {
                case 1: 
                    System.out.print("Enter ID, Name, Dept ID, Basic Salary, Performance Bonus: ");
                    int mId = sc.nextInt();
                    String mName = sc.next();
                    String mDeptId = sc.next();
                    double mBasic = sc.nextDouble();
                    double performanceBonus = sc.nextDouble();
                    employees.add(new Manager(mId, mName, mDeptId, mBasic, performanceBonus));
                    System.out.println("Manager hired successfully!");
                    break;
                
                case 2:
                    System.out.print("Enter ID, Name, Dept ID, Basic Salary, Hours Worked, Hourly Rate: ");
                    int wId = sc.nextInt();
                    String wName = sc.next();
                    String wDeptId = sc.next();
                    double wBasic = sc.nextDouble();
                    int hoursWorked = sc.nextInt();
                    double hourlyRate = sc.nextDouble();
                    Worker worker = new Worker(wId, wName, wDeptId, wBasic);
                    worker.setHrsofwork(hoursWorked);
                    worker.setHourlyrate(hourlyRate);
                    employees.add(worker);
                    System.out.println("Worker hired successfully!");
                    break;
                
                case 3:
                    System.out.println("\nEmployee Details:");
                    for (Employee e : employees) {
                        System.out.println(e.toString() + ", Net Salary: " + e.getSalary());
                    }
                    break;
                
                case 4:
                    System.out.print("Enter Employee ID to update basic salary: ");
                    int empId = sc.nextInt();
                    boolean found = false;
                    for (Employee e : employees) {
                        if (e.getId() == empId) {
                            System.out.print("Enter new Basic Salary: ");
                            double newBasic = sc.nextDouble();
                            e.setBasic(newBasic);
                            System.out.println("Basic salary updated successfully!");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Employee not found!");
                    }
                    break;
                
                case 5:
                    System.out.print("Enter Worker ID to compute salary: ");
                    int workerId = sc.nextInt();
                    found = false;
                    for (Employee e : employees) {
                        if (e instanceof Worker && e.getId() == workerId) {
                            System.out.println("Net Salary: " + e.computenetSalary());
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Worker not found!");
                    }
                    break;
                
                case 6:
                    System.out.print("Enter Worker ID to get hourly rate: ");
                    workerId = sc.nextInt();
                    found = false;
                    for (Employee e : employees) {
                        if (e instanceof Worker && e.getId() == workerId) {
                            System.out.println("Hourly Rate: " + ((Worker) e).getHourlyrate());
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Worker not found!");
                    }
                    break;
                
                case 7:
                    System.out.println("Exiting application...");
                    break;
                
                default:
                    System.out.println("Invalid choice, please try again!");
            }
        } while (choice != 7);
        
        sc.close();
    }
}
