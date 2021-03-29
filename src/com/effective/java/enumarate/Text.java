package com.effective.java.enumarate;

import java.util.EnumSet;
import java.util.Set;

import static com.effective.java.enumarate.Text.Style.BOLD;
import static com.effective.java.enumarate.Text.Style.ITALIC;

/**
 * @author kadercelik
 */
public class Text {

  public enum Style {
    BOLD, ITALIC, UNDERLINE
  }

  public void doStyle(Set<Style> styles) {
    // Body
  }

  public static void main(String[] args) {
    Text text = new Text();
    text.doStyle(EnumSet.of(BOLD, ITALIC));
  }
}
