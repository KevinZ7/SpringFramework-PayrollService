package com.KevinZ7.Payroll.exceptions;

public class EmployeeNotFoundException extends RuntimeException {

  public EmployeeNotFoundException(Long id) {
    super("Could not find employee " + id);
  }
}