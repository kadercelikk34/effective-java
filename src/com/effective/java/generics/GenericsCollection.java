package com.effective.java.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kadercelik
 */
public class GenericsCollection {

  public static void main(String args[]) {
    //Array yerine Collection yapılarını kullanmakda fayda vardır.
    //Object[] objectsArrays = new Long[1];
    //objectsArrays[0]="hello";

    List<Long> objectsList = new ArrayList<>();
    objectsList.add(1L);
  }
}
