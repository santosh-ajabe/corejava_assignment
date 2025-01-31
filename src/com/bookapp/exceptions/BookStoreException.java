package com.bookapp.exceptions;

public class BookStoreException extends Exception {
    private static final long serialVersionUID = 1L;

    public BookStoreException(String message) {
        super(message);
    }
}
