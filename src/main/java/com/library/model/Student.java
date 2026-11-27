package com.library.model;

import com.library.exception.InvalidOperationException;

public class Student extends Member {
    private final String studentNumber;

    public Student(String id, String name, String studentNumber) {
        super(id, name);
        if (studentNumber == null || studentNumber.isBlank()) {
            throw new InvalidOperationException("Ogrenci numarasi bos olamaz.");
        }
        this.studentNumber = studentNumber;
    }

    public String getStudentNumber() {
        return studentNumber;
    }
}