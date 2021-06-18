package com.example.demo.Exception;

import org.springframework.cache.support.NullValue;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.reactive.function.client.WebClientResponseException;

import java.util.FormatFlagsConversionMismatchException;

@RestControllerAdvice
public class ExceptionController {
    @ExceptionHandler(value = {Exception.class})
    public String exceptionInternalServerError()
    {
        return "Entity Not Found";
    }
    @ExceptionHandler(value = {NullPointerException.class})
    public String nullvalueexception()
    {
        return "Null value not allowed";
    }

}
