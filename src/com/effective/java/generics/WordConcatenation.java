package com.effective.java.generics;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author kadercelik
 */
public class WordConcatenation {

  //Metod parametrelerini generic kullanmayı unutmayın, böylece hataları çalışma anında değil derleme anında alırız.
  public static <E> Set concatenation(Set<E> s1, Set<E> s2) {
    Set<E> result = new HashSet(s1);
    result.addAll(s2);
    return result;
  }

  public static void main(String[] args) {
    Set<String> eastRegion = new HashSet<>(Arrays.asList("Edirne", "Edirne", "Tekirdağ", "Kocaeli"));
    Set<String> westRegion = new HashSet<>(Arrays.asList("İzmir", "Aydın", "Muğla"));
    Set<String> region = concatenation(eastRegion, westRegion);
    System.out.println(region);
    //
    //Set<Integer> numbers = new HashSet<>(Arrays.asList(12, 13, 14));
    //Set<String> concatenationList = concatenation(eastRegion, numbers);
    //concatenationList.forEach(i -> System.out.println(i));
  }
}
