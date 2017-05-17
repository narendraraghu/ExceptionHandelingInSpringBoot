package com.example.exception.global;

import com.example.exception.base.BaseException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@ControllerAdvice
@RestController
public class GlobalExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(value = BaseException.class)
    public String handleBaseException(BaseException e){
        return e.getMessage();
    }

    //here in handeling itself we are saying if value = BaseException.class then handle it :)

    @ExceptionHandler(value = Exception.class)
    public String handleException(Exception e){return e.getMessage();}


}
