package com.ipaye.emscproject.Exception;


import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.Serial;

@ResponseStatus(value= HttpStatus.NOT_FOUND)
public class EmployeeNotFoundException extends RuntimeException{

    @Serial
    private static final long serialVersionUID = 5088656726691794786L;

    public EmployeeNotFoundException(String message){
        super(message);
    }

}
