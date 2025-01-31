package com.bookapp;

import java.util.Date;

public abstract class Book implements Comparable<Book>{

	String isbn;
	double price;
	String authorname;
	int quantity;
	Date publishdate;
	
	
	public Book(Date publishdate) {
		super();
		this.publishdate = publishdate;
	}

	public Book(String isbn, double price, String authorname, int quantity,Date publishdate) {
		super();
		this.isbn = isbn;
		this.price = price;
		this.authorname = authorname;
		this.quantity = quantity;
		this.publishdate=publishdate;
	}

	public Book() {
		super();
		
	}

	
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthorname() {
		return authorname;
	}

	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Date getPublishdate() {
		return publishdate;
	}

	public void setPublishdate(Date publishdate) {
		this.publishdate = publishdate;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", price=" + price + ", authorname=" + authorname + ", quantity=" + quantity
				+ ", publishdate=" + publishdate + "]";
	}

	
	public int compareto(Book o) {
		 
		return this.isbn.compareTo(o.isbn);
	}
	
}
