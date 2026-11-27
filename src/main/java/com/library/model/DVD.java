package com.library.model;

import com.library.exception.InvalidOperationException;

public class DVD extends Material {
    private final int durationMinutes;

    public DVD(String id, String title, int durationMinutes) {
        super(id, title);
        if (durationMinutes <= 0) {
            throw new InvalidOperationException("DVD suresi 0'dan buyuk olmalidir.");
        }
        this.durationMinutes = durationMinutes;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    @Override
    public int getLoanDurationDays() {
        return 3;
    }
}