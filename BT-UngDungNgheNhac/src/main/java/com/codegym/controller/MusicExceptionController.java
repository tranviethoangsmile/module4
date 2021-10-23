package com.codegym.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class MusicExceptionController {
    @ExceptionHandler(value = {NoHandlerFoundException.class})
    public String exceptionHandler(Exception exception) {
        return "error";
    }

}
