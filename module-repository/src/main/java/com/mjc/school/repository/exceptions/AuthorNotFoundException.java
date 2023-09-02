package com.mjc.school.repository.exceptions;

public class AuthorNotFoundException extends Exception {
    public AuthorNotFoundException(String errorMessage) {
        super("ERROR_CODE: 02 ERROR_MESSAGE: " + errorMessage);
    }
}
