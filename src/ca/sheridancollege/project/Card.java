/**
 * SYST 17796 Project Winter 2019 Base code.
 * This class models what a Card object is made of. Incorperating both Rank
 * and Suits.
 * Names: Ryan Hill, Nainesh Prajapati, Tavin Bousfield, Kevin Ly
 */
package ca.sheridancollege.project;

public class Card {
    
    //the rank an suit from the Enums will be the datamembers
    private Rank rank;
    private Suit suit;
    
    //Default Constructor
    public Card() {
    }
    
    //Main Constructor
    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }
    
    //Getter for the rank
    public Rank getRank() {
        return rank;
    }
    
    //Setter for the Rank
    public void setRank(Rank rank) {
        this.rank = rank;
    }
    
    //Getting for the Suit
    public Suit getSuit() {
        return suit;
    }   

    //Setter for the Suit
    public void setSuit(Suit suit) {
        this.suit = suit;
    }
    
    /**
     * toString to print off the Card objects
     * @return String card info
     */
    @Override
    public String toString() {
        return rank.getLongName() + " of " + suit.getSuitName() +"\n";
    }
   
    /**
     * Another toString to print off the short name and symbol of the Card
     * @return String card info
     */
    public String toShortString(){
        return rank.getShortName() + suit.getSymbol();
    }
}
