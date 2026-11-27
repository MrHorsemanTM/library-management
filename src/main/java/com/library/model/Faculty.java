package com.library.model;

import com.library.exception.InvalidOperationException;

public class Faculty extends Member {
    private final String department;

    public Faculty(String id, String name, String department) {
        super(id, name);
        if (department == null || department.isBlank()) {
            throw new InvalidOperationException("Bolum bilgisi bos olamaz.");
        }
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}