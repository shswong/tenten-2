package com.dvliman.tenten.exception;

public class InvalidValueException extends Exception {

  private static final long serialVersionUID = 1L;

  public InvalidValueException() {
    super();
  }
  
  public InvalidValueException(String message) {
    super(message);
  }
}