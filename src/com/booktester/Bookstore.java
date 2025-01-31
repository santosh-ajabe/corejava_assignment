package com.booktester;

import java.util.Arrays;
import java.util.Scanner;

import com.bookapp.Book;
import com.bookapp.exceptions.BookStoreException;
import com.bookapp.utils.ValidationUtils;

public class Bookstore {

	Book[] books;

	int counter;

	public Bookstore(int size) {
		this.books = new Book[size];

	}

	public void addBokk(Scanner sc) {
		if (counter < books.length) {

			System.out.println("enter book details:isbn,categorey,price,publish date,author,quantity");

			Book book = null;
			try {
				book = ValidationUtils.validateBook(sc.next(), sc.next(), sc.nextDouble(), sc.next(), sc.next(),
						sc.nextInt(), books);
			} catch (BookStoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			books[counter++] = book;
		} else {
			System.out.println("array is overflow");
		}
	}

	public void findbook(Scanner sc) {

		System.out.println("enter isbn");
		String isbn = sc.next();
		Book book = null;
		for (Book b : books) {
			if (b != null)
				if (b.getIsbn().equals(isbn))

					book = b;
		}

	}

	public void sortBookByIsbn() {
		Arrays.sort(books);
	}

	public void sortBookByauthor() {
		Arrays.sort(books, (e1, e2) -> e1.getAuthorname().compareTo(e2.getAuthorname()));
	}

	public void displayboook() {

		for (Book book1 : books) {
			if (book1 != null)
				System.out.println(book1);
		}
	}
}
