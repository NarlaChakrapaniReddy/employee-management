package com.employee.management.exceptions;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
@ResponseStatus (value = HttpStatus.NOT_FOUND)
public class EmployeeNotFoundException extends RuntimeException {
public EmployeeNotFoundException(String msg)
{
super(msg);
}
}
