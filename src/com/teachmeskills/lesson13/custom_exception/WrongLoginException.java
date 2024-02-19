package com.teachmeskills.lesson13.custom_exception;

public class WrongLoginException extends Exception {
    public WrongLoginException() {}

    public WrongLoginException(String message) {
        super(message);
    }
}
