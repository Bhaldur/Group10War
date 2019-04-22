/**
 * SYST 17796 Project Winter 2019 Base code.
 * The Suit class that focuses on making the Suit of a card
 * Names: Ryan Hill, Nainesh Prajapati, Tavin Bousfield, Kevin Ly
 */
package ca.sheridancollege.project;

/**
 *
 * @author Ryan
 */
public enum Suit {
    
    CLUBS (1, "Clubs", (char)('\u2663')),
    DIAMONDS (2, "Diamonds", (char)('\u2666')),
    HEARTS (3, "Hearts", (char)('\u2665')),
    SPADES (4, "Spades", (char)('\u2660'));
    
    //tha data members for this Enum
    private int number;
    private String suitName;
    private char symbol;
    
    private Suit(int num, String face, char ucode){
        number = num;
        suitName = face;
        symbol = ucode;
    }

    public int getNumber() {
        return number;
    }

    public String getSuitName() {
        return suitName;
    }

    public char getSymbol() {
        return symbol;
    }

}
