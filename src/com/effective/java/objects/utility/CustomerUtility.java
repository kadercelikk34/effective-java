package com.effective.java.objects.utility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author kadercelik
 */
public class CustomerUtility {

  private CustomerUtility() {
    throw new IllegalStateException("cannot be called constructor");
  }

  public static String getDummyEmail() {
    return "test@gmail.com";
  }

  public static String phoneNumberRegex(String phoneNumber) {
    Pattern pattern = Pattern.compile("^(\\d{3}[- .]?){2}\\d{4}$");
    Matcher newPhoneNumber = pattern.matcher(phoneNumber);
    return newPhoneNumber.toString();
  }

  public static void main(String[] args) {
    CustomerUtility.getDummyEmail();
    CustomerUtility.phoneNumberRegex("202 555 0125");
  }
}
