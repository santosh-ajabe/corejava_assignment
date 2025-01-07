package com.internship;

import java.util.Scanner;

public class Assignment2 {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println(name.toLowerCase());
        System.out.println(name.charAt(0));
        System.out.println(name.toLowerCase().contains("a"));
    }
}