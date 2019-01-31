package edu.cnm.deepdive;

/**
 * This ENUM implements suits of standard playing cards. Each enumerated value uses the standard
 * symbol for that suit (take from Unicode) as its string representation.
 *
 * @author Nicholas Bennett &amp; Deep Dive Coding Java + Android Bootcamp cohort 6
 * @version 1.0
 */
public enum Suit {

  CLUBS("C"),
  DIAMONDS("D"),
  HEARTS("H"),
  SPADES("S");

  private final String symbol;

  Suit(String symbol){
    this.symbol = symbol;
  }


  @Override
  public String toString() {
    return symbol;
  }
}
