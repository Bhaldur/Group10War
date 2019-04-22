/**
 * SYST 17796 Project Winter 2019 Base code.
 * The GroupOfCards class that models a deck of cards
 * Names: Ryan Hill, Nainesh Prajapati, Tavin Bousfield, Kevin Ly
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you
 * might want to subclass this more than once. The group of cards has a maximum
 * size attribute which is flexible for reuse.
 *
 * @author dancye
 */
public final class GroupOfCards extends ArrayList<Card>{
    
    //Initializing ArrayLists
    ArrayList<Card> firstHalf = new ArrayList<>();
    ArrayList<Card> secondHalf = new ArrayList<>();
    
    //Constructor for the GroupOfCards
    public GroupOfCards() {
        init();
    }

    /**
     * A method that will get the group of cards as an ArrayList
     *
     * @return the group of cards.
     */
    public ArrayList<Card> showCards() {
        return this;
    }
    
    //Methodto shuffle the group of cards
    public void shuffle() {
        Collections.shuffle(this);
    }
    
    //Method to make the group of cards
    public void init() {
        for (Rank r : Rank.values()) {
            for (Suit s : Suit.values()) {
                this.add(new Card(r,s));
            }
        }
        shuffle();
    }

    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return this.size();
    }
    
    //Method to splitthe deck in half
    public void splitDeck() {
        int index = 0;
        for (Card card : this) {
                if(index < (this.size()/2)){
                firstHalf.add(this.get(index));
                } else {
                secondHalf.add(this.get(index));
                }
            index++;
        }
    }
    
    public ArrayList<Card> getFirstHalf() {
        return firstHalf;
    }

    public ArrayList<Card> getSecondHalf() {
        return secondHalf;
    }
    
}//end class
