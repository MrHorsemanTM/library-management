package com.library.model;

import com.library.exception.InvalidOperationException;
import java.util.Objects;

public abstract class Member {
    private final String id;
    private final String name;
    private double unpaidFine;

    protected Member(String id, String name) {
        if (id == null || id.isBlank()) {
            throw new InvalidOperationException("Uye ID bos olamaz.");
        }
        if (name == null || name.isBlank()) {
            throw new InvalidOperationException("Uye adi bos olamaz.");
        }
        this.id = id;
        this.name = name;
        this.unpaidFine = 0.0;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getUnpaidFine() {
        return unpaidFine;
    }

    public void addFine(double amount) {
        if (amount < 0) {
            throw new InvalidOperationException("Ceza tutari negatif olamaz.");
        }
        this.unpaidFine += amount;
    }

    public void payFine(double amount) {
        if (amount <= 0) {
            throw new InvalidOperationException("Odeme tutari 0'dan buyuk olmalidir.");
        }
        if (amount > this.unpaidFine) {
            throw new InvalidOperationException("Odeme tutari mevcut cezadan fazla olamaz.");
        }
        this.unpaidFine -= amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Member member)) return false;
        return Objects.equals(id, member.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}