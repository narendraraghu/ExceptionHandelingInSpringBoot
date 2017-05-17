package com.example.exception.custom;

import com.example.errorCodes.ErrorCodes;
import com.example.exception.base.BaseException;

public class CustomException1 extends BaseException {

    public CustomException1() {
        super(ErrorCodes.CUSTOM_EXCEPTION_1);
    }
}
