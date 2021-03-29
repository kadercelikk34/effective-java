package com.effective.java.objects.performance;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author kadercelik
 */
public class Read {

  static String firstLineOfFile1(String path) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
    try {
      return bufferedReader.readLine();
    } finally {
      //açılan bir field kapatılmalıdır
      bufferedReader.close();
    }
  }

  //Dosya otomatikmen kapatılır.Bu yöntem daha efektifdir.
  static String firstLineOfFile2(String path) throws IOException {
    try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
      return bufferedReader.readLine();
    } finally {
      //bufferedReader.close();
    }
  }
}
