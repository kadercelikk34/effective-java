package com.effective.java.objects.performance;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author kadercelik
 */
public class ReadV2 {

  private final static int BUFFER_SIZE = 1000;

  static void copy(String src, String dst) throws IOException {

    try (InputStream in = new FileInputStream(src);
         OutputStream out = new FileOutputStream(dst)) {
      byte[] buf = new byte[BUFFER_SIZE];
      int n;
      while ((n = in.read(buf)) >= 0) {
        out.write(buf, 0, n);
      }
    } catch (Exception ex) {
      //TODO
    }
  }
}
