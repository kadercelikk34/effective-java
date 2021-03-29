package com.effective.java.java8.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.Collections.sort;

/**
 * @author kadercelik
 */
public class Order {

  static List<String> words = Arrays.asList("Goodby", "World");

  public static void main(String[] args) {
    //Dahili sınıflar kullanmak yerine java 8 ile gelen lambda fonk kullanmalıyız.
/*    Collections.sort(words, new Comparator<String>() {
      @Override
      public int compare(String s1, String s2) {
        return Integer.compare(s1.length(), s2.length());
      }
    });*/
    //3 de aynı işi yapar , bir işi yapmanın birden fazla yolu vardır
    sort(words, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
    System.out.println(words);
    //
    sort(words, Comparator.comparingInt(String::length));
    System.out.println(words);
    //Altdaki daha efektiftir
    words.sort(Comparator.comparingInt(String::length));
    System.out.println(words);
  }
}
