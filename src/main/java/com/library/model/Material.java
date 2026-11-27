package com.library.model;

import com.library.exception.InvalidOperationException;
import java.util.Objects;

public abstract class Material {
    private final String id;
    private final String title;
    private boolean available;

    protected Material(String id, String title) {
        if (id == null || id.isBlank()) {
            throw new InvalidOperationException("Materyal ID bos olamaz.");
        }
        if (title == null || title.isBlank()) {
            throw new InvalidOperationException("Materyal basligi bos olamaz.");
        }
        this.id = id;
        this.title = title;
        this.available = true;
    }

    public abstract int getLoanDurationDays();

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return available;
    }

    public void markAsBorrowed() {
        this.available = false;
    }

    public void markAsReturned() {
        this.available = true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Material material)) return false;
        return Objects.equals(id, material.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}