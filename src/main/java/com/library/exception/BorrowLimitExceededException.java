package com.library.exception;

public class MaterialNotAvailableException extends LibraryException {
    public MaterialNotAvailableException(String materialId) {
        super("Materyal su an odunc verilemez (musait degil). ID: " + materialId);
    }
}