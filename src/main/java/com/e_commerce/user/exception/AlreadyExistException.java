package com.e_commerce.user.exception;

public class AlreadyExistException extends RuntimeException{
    public AlreadyExistException(String message)
    {
        super(message);
    }
}
