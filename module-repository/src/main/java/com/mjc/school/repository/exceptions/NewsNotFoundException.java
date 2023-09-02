package com.mjc.school.repository.exceptions;

public class NewsNotFoundException extends Exception {
    public NewsNotFoundException(String errorMessage) {
        super("ERROR_CODE: 01 ERROR_MESSAGE: " + errorMessage);
    }
}
