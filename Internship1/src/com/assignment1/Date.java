package com.assignment1;

import java.util.Scanner;

class Date {
    private int day;
    private int month;
    private int year;

    public void initDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void acceptDate() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter day: ");
        this.day = scanner.nextInt();
        System.out.print("Enter month: ");
        this.month = scanner.nextInt();
        System.out.print("Enter year: ");
        this.year = scanner.nextInt();
    }

    public void printDate() {
        System.out.println("Date: " + day + "/" + month + "/" + year);
    }


  
    public static void main(String[] args) {
        Date date = new Date();

        
        date.initDate(6, 1, 2025);
        date.printDate();

        
        date.acceptDate();
        date.printDate();
    }
}

