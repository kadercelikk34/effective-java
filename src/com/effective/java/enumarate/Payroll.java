package com.effective.java.enumarate;

/**
 * @author kadercelik
 */
public enum Payroll {
  MONDAY(PaymentType.WEEKDAYS),
  TUESDAY(PaymentType.WEEKDAYS),
  WEDNESDAY(PaymentType.WEEKDAYS),
  THURSDAY(PaymentType.WEEKDAYS),
  FRIDAY(PaymentType.WEEKDAYS),
  SATURDAY(PaymentType.WEEKEND),
  MARKET(PaymentType.WEEKEND);

  private final PaymentType paymentType;

  Payroll(PaymentType paymentType) {
    this.paymentType = paymentType;
  }

  double pay(double workingHour, double rate) {
    return paymentType.calculate(workingHour, rate);
  }

  private enum PaymentType {
    WEEKDAYS {
      double calculate(double hour, double rate) {
        return hour * rate * 2;
      }
    },
    WEEKEND {
      double calculate(double hour, double rate) {
        return hour * rate / 2;
      }
    };

    abstract double calculate(double hour, double rate);

    double doPayment(double workingHour, double rate) {
      double total = workingHour * rate;
      return total + calculate(workingHour, rate);
    }
  }
  public static void main(String[] args) {
    double price = Payroll.MONDAY.pay(4,100);
    System.out.println(price);
  }
}
