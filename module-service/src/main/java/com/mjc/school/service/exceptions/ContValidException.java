package com.mjc.school.service.exceptions;

public class ContValidException extends Exception {
    public ContValidException(String errorMessage) {
        super("ERROR_CODE: 000012 ERROR_MESSAGE: " + errorMessage);
    }
}
