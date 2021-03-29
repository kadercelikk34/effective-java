package com.effective.java.java8.optional;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * @author kadercelik
 */
public class Search {

  /**
   * Eğer optional kullanmazsak if içinde exception fırlatıp main içindede try-catch ile yakalamamız gerekirdi Oprional
   * kullanarak degerleri istediğpimiz gibi yönetip , try-catch kullankmakdan kurtuluyoruz Çok sık kullanılan bir metod
   * ise optional kullanmak biraz maliyetli olur.
   */
  public static Optional<Integer> max(List<Integer> numbers) {
    if (numbers == null || numbers.size() == 0) {
      return Optional.empty();
    }
    return Optional.of(Collections.max(numbers));
  }

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(10, 20, 100, 30);
    Optional<Integer> maxNumber = max(numbers);
    System.out.println(maxNumber.orElse(0));
  }
}
