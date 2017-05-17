package com.example.controller;

/**
 * Created by Raghu on 17-May-17.
 */


import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//In case u dont like spring boot default error page :P

@Controller
public class CustomErrorController implements ErrorController {

    private static final String PATH = "/error";

    @RequestMapping(value = PATH)
    public String error() {
        return "404";
    }

    @Override
    public String getErrorPath() {
        return PATH;
    }
}


