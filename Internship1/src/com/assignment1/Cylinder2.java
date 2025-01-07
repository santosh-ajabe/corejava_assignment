package com.assignment1;
import java.util.Scanner;

class Cylinder2 {
    double radius;
    double height;

    Cylinder2() {
        radius = 0;
        height = 0;
    }

    Cylinder2(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    double getRadius() {
        return radius;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }

    double getHeight() {
        return height;
    }

    void setHeight(double height) {
        this.height = height;
    }

    double getVolume() {
        return 3.14 * radius * radius * height;
    }

    void printVolume() {
        System.out.println("Volume of Cylinder: " + getVolume());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius of the cylinder");
        double radius = sc.nextDouble();

        System.out.println("Enter height of the cylinder");
        double height = sc.nextDouble();

        Cylinder cylinder = new Cylinder(radius, height);
        cylinder.printVolume();

        sc.close();
    }
    
}

