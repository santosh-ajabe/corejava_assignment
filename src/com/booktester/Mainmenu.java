package com.booktester;

import java.util.Scanner;
import com.bookapp.Book;
import com.bookapp.utils.ValidationUtils;

public class Mainmenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the bookstore: ");
        int size = sc.nextInt();
        Bookstore bookstore = new Bookstore(size);

        int choice;
        do {
            System.out.println("\n==== Bookstore Management System ====");
            System.out.println("1. Add Book");
            System.out.println("2. Find Book by ISBN");
            System.out.println("3. Sort Books by ISBN");
            System.out.println("4. Sort Books by Author");
            System.out.println("5. Display All Books");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    bookstore.addBokk(sc);
                    break;

                case 2:
                    bookstore.findbook(sc);
                    break;

                case 3:
                    bookstore.sortBookByIsbn();
                    System.out.println("Books sorted by ISBN.");
                    break;

                case 4:
                    bookstore.sortBookByauthor();
                    System.out.println("Books sorted by Author.");
                    break;

                case 5:
                    bookstore.displayboook();
                    break;

                case 6:
                    System.out.println("Exiting Bookstore Management System...");
                    break;

                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        } while (choice != 6);

        sc.close();
    }
}
