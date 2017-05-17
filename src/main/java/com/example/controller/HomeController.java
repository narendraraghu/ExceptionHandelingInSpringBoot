package com.example.controller;

import com.example.exception.base.BaseException;
import com.example.exception.custom.CustomException1;
import com.example.exception.custom.CustomException2;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"","/"})
public class HomeController {

    @RequestMapping("/exception1")
    public String ex1(){
        // will be catched by global exception handler method handleBaseException
        throw new BaseException("Base Exception");
    }

    @RequestMapping("/exception2")
    public String ex2(){
        // will be catched by global exception handler method handleBaseException
        throw new CustomException1();
    }

    @RequestMapping("/exception3")
    public String ex3(){
        // will be catched by global exception handler method handleBaseException
        throw new CustomException2();
    }

    @RequestMapping("/exception4")
    public String ex4(){
        // will be catched by global exception handler method handleException
        throw new NullPointerException("null pointer exception");
    }

    @RequestMapping("/exception5")
    public String ex5(){
        // will be catched by controller exception hnadler handler method nfeHandler
        throw new NumberFormatException("number format exception");
    }

    /**
     * This method will handle all the Number Format Exceptions that arise within this controller.
     *
     * */
    @ExceptionHandler(value = NumberFormatException.class)
    public String nfeHandler(NumberFormatException e){
        return e.getMessage();
    }

    public String someMethod() {
        try {
            // do some stuff here
            return "something";
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}
