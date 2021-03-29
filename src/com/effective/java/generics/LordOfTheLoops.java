package com.effective.java.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @author kadercelik
 */
public class LordOfTheLoops {

  enum Suit {CLUP, DIAMOND, HEART}

  ;

  enum Rank {ACE, DEUCE, THREE, FOUR, FIVE}

  ;

  public static void main(String[] args) {
    Collection<Suit> suits = Arrays.asList(Suit.values());
    Collection<Rank> ranks = Arrays.asList(Rank.values());
    List<Card> cards = new ArrayList<>();
    //bu for okunaklı değildir ve runtime da hata alabiliriz.
/*    for (Iterator<Suit> i = suits.iterator(); i.hasNext(); ) {
      for (Iterator<Rank> j = ranks.iterator(); j.hasNext(); ) {
        cards.add(new Card(i.next(), j.next()));
      }
    }*/
    // forEach daha okunaklıdır.Hata ile karşılaşma ihtimali azalır.
    suits.forEach(s -> ranks.forEach(r -> cards.add(new Card(s, r))));
  }

  static class Card {

    Suit suit;

    Rank rank;

    public Card(Suit suit, Rank rank) {
      this.suit = suit;
      this.rank = rank;
    }

    @Override
    public String toString() {
      return "Card{" +
             "suit=" + suit +
             ", rank=" + rank +
             '}';
    }
  }
}
