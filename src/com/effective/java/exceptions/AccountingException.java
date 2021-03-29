package com.effective.java.exceptions;

/**
 * @author kadercelik Eğer kendi hata sınıflarımızı yapacaksak,
 * Öncelikle RuntimeException dan türetmeyi düşünmeliyiz.
 * Exception sınıfından türetmek ancak zorunlu koşullarda olmalı
 * Error dan türetmeyi düşünmeyelim
 */
public class AccountingException extends RuntimeException {

  private int errorCode;

  private String errorMessage;

  public AccountingException(String errorMessage, int errorCode) {
    super(errorMessage);
    this.errorCode = errorCode;
    this.errorMessage = errorMessage;
  }

  @Override
  public String getMessage() {
    return super.getMessage();
  }

  @Override
  public String getLocalizedMessage() {
    if (errorCode == 3911) {
      return "Invalid balanced " + errorMessage;
    } else if (errorCode == 6282) {
      return "over balanced " + errorMessage;
    } else {
      return "Contact with order " + errorMessage;
    }
  }
}
