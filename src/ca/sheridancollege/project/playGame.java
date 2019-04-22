/**
 * SYST 17796 Project Winter 2019 Base code.
 * The Main Class that plays the game
 * Names: Ryan Hill, Nainesh Prajapati, Tavin Bousfield, Kevin Ly
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 *
 * @author Ryan
 */
public class playGame {
    
    //Gobal variables
    public static GroupOfCards fullDeck;
    private static ArrayList<Card> playerOneHalf;
    private static ArrayList<Card> playerTwoHalf;
    private static ArrayList<Card> cardsInPlay;
    
    //The main method
    public static void main(String[] args) {
        startGame();

    }
    
    //The starting game method
    public static void startGame() {

        fullDeck = new GroupOfCards();
        fullDeck.splitDeck();
        playerOneHalf = fullDeck.getFirstHalf();
        playerTwoHalf = fullDeck.getSecondHalf();
        cardsInPlay = new ArrayList<>();
        System.out.print(cardsInPlay.isEmpty());
        while (playerOneHalf.size() > 0 && playerTwoHalf.size() > 0) {
            nextFlip();
        }
    }
    
    //The end game
    public static void endGame() {

    }
    
    //The restart game
    public static void restartGame() {

    }
    
    //The methodfor flipping the cards
    public static void nextFlip() {
        if (playerOneHalf.get(0).getRank().getNum()
                < playerTwoHalf.get(0).getRank().getNum()) {
            cardsInPlay.add(playerOneHalf.get(0));
            cardsInPlay.add(playerTwoHalf.get(0));
            System.out.print("\nPlayer 1 flips" + playerOneHalf.get(0).
                toShortString());
            System.out.print("\nPlayer 2 flips" + playerTwoHalf.get(0).
                toShortString());
            playerOneHalf.remove(0);
            playerTwoHalf.remove(0);
            for (Card card : cardsInPlay) {
                System.out.print("\nAdding " + card.toShortString() + "to P2");
                playerTwoHalf.add(card);
            }
            cardsInPlay.clear();
            declareWinner(2);

        }
        if (playerOneHalf.get(0).getRank().getNum()
                == playerTwoHalf.get(0).getRank().getNum()) {
            warFlip();

        }
        if (playerOneHalf.get(0).getRank().getNum()
                > playerTwoHalf.get(0).getRank().getNum()) {
            cardsInPlay.add(playerOneHalf.get(0));
            cardsInPlay.add(playerTwoHalf.get(0));
            System.out.print("\nPlayer 1 flips" + playerOneHalf.get(0).
                toShortString());
            System.out.print("\nPlayer 2 flips" + playerTwoHalf.get(0).
                toShortString());
            playerOneHalf.remove(0);
            playerTwoHalf.remove(0);
            for (Card card : cardsInPlay) {
                System.out.print("\nAdding " + card.toShortString() + "to P1");
                playerOneHalf.add(card);
            }
            cardsInPlay.clear();
            declareWinner(1);

        }
    }
    
    //The method for flipping the cards if there is war 
    public static void warFlip() {
        cardsInPlay.add(playerOneHalf.get(0));
        cardsInPlay.add(playerOneHalf.get(1));
        cardsInPlay.add(playerTwoHalf.get(0));
        cardsInPlay.add(playerTwoHalf.get(1));
        System.out.print("\nPlayer 1 flips" + playerOneHalf.get(0).
            toShortString());
        playerOneHalf.remove(0);
        System.out.print("\nPlayer 2 flips" + playerTwoHalf.get(0).
            toShortString());
        playerTwoHalf.remove(0);
        System.out.print("\nPlayer 1 flips" + playerOneHalf.get(0).
            toShortString());
        playerOneHalf.remove(0);
        System.out.print("\nPlayer 2 flips" + playerTwoHalf.get(0).
            toShortString());
        playerTwoHalf.remove(0);
        nextFlip();

    }
    
    //Method for declaring a winner
    public static void declareWinner(int playerID) {
        if (playerID == 1) {
            System.out.print("\nPlayer" + playerID + " Won the cards"
                    + " and now has " + playerOneHalf.size());
        }

        if (playerID == 2) {
            System.out.print("\nPlayer" + playerID + " Won the cards"
                    + " and now has " + playerTwoHalf.size());
        }
    }

}
