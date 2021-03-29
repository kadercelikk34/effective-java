package com.effective.java.objects.performance;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author kadercelik
 */
public class TelephoneDirectory implements Comparable<TelephoneDirectory> {

  private final short areaCode;

  private final short prefix;

  private final short number;

  public TelephoneDirectory(int areaCode, int prefix, int number) {
    this.areaCode = (short) areaCode;
    this.prefix = (short) prefix;
    this.number = (short) number;
  }

  //equals ezdiysek ,hashCode' du da ezmemiz gerekir
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TelephoneDirectory that = (TelephoneDirectory) o;
    return areaCode == that.areaCode &&
           prefix == that.prefix &&
           number == that.number;
  }

  @Override
  public int hashCode() {
    return Objects.hash(areaCode, prefix, number);
  }

  // toString eklemeden önce {com.effective.java.objects.performance.TelephoneDirectory@41cf1=John}
  //toString ekledikden sonra {TelephoneDirectory{areaCode=216, prefix=867, number=5309}=John}
  @Override
  public String toString() {
    return "TelephoneDirectory{" +
           "areaCode=" + areaCode +
           ", prefix=" + prefix +
           ", number=" + number +
           '}';
  }
  //areaCode küçükden büyüğe göre sıralamak için kullanıyoruz, TreeSet sıralayamazdı.
  @Override
  public int compareTo(TelephoneDirectory o) {
    int areaCodeDiff = this.areaCode - o.areaCode;
    //
    if (areaCodeDiff != 0) {
      return areaCodeDiff;
    }
    return 0;
  }

  private static final ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();

  private static TelephoneDirectory randomNumber() {
    return new TelephoneDirectory(((short) threadLocalRandom.nextInt(1000)),
                                  ((short) threadLocalRandom.nextInt(1000)),
                                  ((short) threadLocalRandom.nextInt(1000)));
  }

  public static void main(String[] args) {
    Map<TelephoneDirectory, String> telephoneDirectoryStringMap = new HashMap<>();
    telephoneDirectoryStringMap.put(new TelephoneDirectory(216, 867, 5309), "John");
    System.out.println(telephoneDirectoryStringMap.get(new TelephoneDirectory(216, 867, 5309)));
    System.out.println(telephoneDirectoryStringMap);
    //
    Set<TelephoneDirectory> telephoneDirectorySet = new TreeSet<>();
    for (int i = 0; i < 10; i++) {
      telephoneDirectorySet.add(randomNumber());
    }
    System.out.println(telephoneDirectorySet);
  }
}
