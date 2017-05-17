package com.example.exception.custom;

import com.example.errorCodes.ErrorCodes;
import com.example.exception.base.BaseException;

public class CustomException2 extends BaseException {

    public CustomException2() {
        super(ErrorCodes.CUSTOM_EXCEPTION_2);
    }
}
