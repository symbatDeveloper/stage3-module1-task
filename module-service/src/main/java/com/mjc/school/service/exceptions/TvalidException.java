package com.mjc.school.service.exceptions;

public class TvalidException extends Exception {
    public TvalidException(String errorMessage) {
        super("ERROR_CODE: 000012 ERROR_MESSAGE: " + errorMessage);
    }
}
