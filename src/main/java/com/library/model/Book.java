package com.library.model;

import com.library.exception.InvalidOperationException;

public class Book extends Material {
    private final String author;

    public Book(String id, String title, String author) {
        super(id, title);
        if (author == null || author.isBlank()) {
            throw new InvalidOperationException("Kitap yazari bos olamaz.");
        }
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public int getLoanDurationDays() {
        return 14;
    }
}