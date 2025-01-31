package com.assignment1;
class Cylinder {
    double radius;
    double height;

    Cylinder() {
//        radius = 0;
//        height = 0;
    }

    Cylinder(double radius, double height) {
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
        Cylinder c1 = new Cylinder();
        c1.setRadius(5);
        c1.setHeight(7);
        c1.printVolume();

        Cylinder c2 = new Cylinder();
        c2.printVolume();
    }
}
