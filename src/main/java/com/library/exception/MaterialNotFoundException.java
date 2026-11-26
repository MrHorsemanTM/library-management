package com.library.exception;

public class MaterialNotFoundException extends LibraryException {
    public MaterialNotFoundException(String materialId) {
        super("Materyal bulunamadi. ID: " + materialId);
    }
}
