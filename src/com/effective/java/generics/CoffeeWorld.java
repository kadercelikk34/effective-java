package com.effective.java.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @author kadercelik
 */
public class CoffeeWorld {

  public static void main(String args[]) {
    List<String> strings = new ArrayList<>();
    coffeeAdd(strings, new String("134"));
    List<Long> objectsList = new ArrayList<>();
  }

  /**
   * listenin tipi neyse içine atılacak olan nesnede aynı olsun, böylece çalışma anında alınan hataların önüne gecilir.
   * T herhangi bir tipde olabilir. Generic yapı ile derleme anında hatalar yakalanır
   */
  private static <T> void coffeeAdd(List<T> list, T o) {
    list.add(o);
  }

  // Gelen tip belli değil anlamına gelir
  static int sayWilCard(Set<?> s1, Set<?> s2) {
    //s1.add(new Object());
    int result = 0;
    for (Object o : s1)
      if (s2.contains(o)) {
        result++;
      }
    return result;
  }
}
