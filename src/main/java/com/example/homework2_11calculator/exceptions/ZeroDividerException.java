package com.example.homework2_11calculator.exceptions;

public class ZeroDividerException extends RuntimeException{
    public ZeroDividerException(String message) {
        super(message);
    }

    public ZeroDividerException(String message, Throwable cause) {
        super(message, cause);
    }
}