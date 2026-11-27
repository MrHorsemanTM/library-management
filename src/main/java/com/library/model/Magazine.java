package com.library.model;

import com.library.exception.InvalidOperationException;

public class Magazine extends Material {
    private final int issueNumber;

    public Magazine(String id, String title, int issueNumber) {
        super(id, title);
        if (issueNumber <= 0) {
            throw new InvalidOperationException("Dergi sayi numarasi 0'dan buyuk olmalidir.");
        }
        this.issueNumber = issueNumber;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    @Override
    public int getLoanDurationDays() {
        return 7;
    }
}