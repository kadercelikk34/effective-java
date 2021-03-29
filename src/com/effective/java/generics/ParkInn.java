package com.effective.java.generics;

import java.util.HashSet;
import java.util.Set;

/**
 * @author kadercelik
 */
public class ParkInn {
  public static <E> Set concatenation(Set<? extends E> s1, Set<? extends E> s2) {
    Set<E> result = new HashSet(s1);
    result.addAll(s2);
    return result;
  }
  public static void main(String[] args) {
    Set<Integer> integers = new HashSet<>();
    integers.add(1);
    integers.add(3);
    integers.add(5);
    //
    Set<Double> doubles = new HashSet<>();
    doubles.add(2.0);
    doubles.add(4.0);
    doubles.add(6.0);
    //
    Set<Number> numbers = ParkInn.concatenation(integers, doubles);
    numbers.forEach(i -> System.out.println(i));

  }
}
