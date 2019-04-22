/**
 * SYST 17796 Project Winter 2019 Base code.
 * The Rank class that focuses on making the Rank of a card
 * Names: Ryan Hill, Nainesh Prajapati, Tavin Bousfield, Kevin Ly
 */
package ca.sheridancollege.project;

/**
 *
 * @author Ryan
 */
public enum Rank {
    
    //Initiate Enum constatnts using the private constructor
    TWO (1, "Two", "2"),
    THREE (2, "Three", "3"),
    FOUR (3, "Four", "4"),
    FIVE (4, "Five", "5"),
    SIX (5, "Six", "6"),
    SEVEN (6, "Seven", "7"),
    EIGHT (7, "Eight", "8"),
    NINE (8, "Nine", "9"),
    TEN (9, "Ten", "10"),
    JACK (10, "Jack", "J"),
    QUEEN (11, "Queen", "Q"),
    KING (12, "King", "K"),
    ACE (13, "Ace", "A");
    
    //tha data members for this Enum
    private int num;
    private String longName;
    private String shortName;

    //the constructor of the Enum has to be private
    private Rank(int num, String longName, String shortName) {
        this.num = num;
        this.longName = longName;
        this.shortName = shortName;
    }

     /**
     * Accessor for getting the number of a card. It will be different from
     * ordinal(), because it will start from 1
     * @return the number of a card
     */
    public int getNum() {
        return num;
    }

     /**
     * Accessor for getting the long name of a card
     * @return the long name of a card
     */
    public String getLongName() {
        return longName;
    }

     /**
     * Accessor for getting the short name of a card
     * @return the short name of a card
     */
    public String getShortName() {
        return shortName;
    }
}
