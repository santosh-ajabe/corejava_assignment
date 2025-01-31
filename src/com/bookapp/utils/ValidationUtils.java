package com.bookapp.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.bookapp.Book;
import com.bookapp.Category;
import com.bookapp.exceptions.BookStoreException;

public class ValidationUtils {

    public static Book validateBook(String isbn, String category, double price, String publishDate, String author, int quantity, Book[] books) throws BookStoreException {
        String validatedIsbn = validateIsbn(isbn, books);
        Category validatedCategory = validateCategory(category);
        Date validatedPublishDate = validatePublishDate(publishDate);
        return new Book(validatedIsbn, validatedCategory, price, validatedPublishDate, author, quantity);
    }

    public static String validateIsbn(String isbn, Book[] books) throws BookStoreException {
        for (Book book : books) {
            if (book != null && book.getIsbn().equals(isbn)) {
                throw new BookStoreException("Duplicate ISBN! The book with ISBN " + isbn + " already exists.");
            }
        }
        return isbn;
    }

    public static Category validateCategory(String category) throws BookStoreException {
        try {
            return Category.valueOf(category.toUpperCase());
        } catch (IllegalArgumentException ex) {
            StringBuilder sb = new StringBuilder("Invalid category! Available categories: ");
            for (Category c : Category.values()) {
                sb.append(c.name()).append(" ");
            }
            throw new BookStoreException(sb.toString().trim());
        }
    }

    public static Date validatePublishDate(String date) throws BookStoreException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        sdf.setLenient(false); // Ensures strict date validation
        try {
            return sdf.parse(date);
        } catch (ParseException e) {
            throw new BookStoreException("Invalid publish date format! Use dd-MM-yyyy format.");
        }
    }
}
