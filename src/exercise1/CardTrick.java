package exercise1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card.
 * To be used as starting code in Exercise
 *
 * @author Jaskiran Kaur
 * @date January 24, 2024
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] hand = new Card[7];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue(random.nextInt(10) + 1); // random value between 1 and 10
            card.setSuit(Card.SUITS[random.nextInt(4)]); // random suit index between 0 and 3
            hand[i] = card;
        }

        System.out.println("Pick a card!");
        System.out.print("Enter the card value (1-10): ");
        int userValue = scanner.nextInt();

        System.out.print("Enter the card suit (0-Hearts, 1-Diamonds, 2-Clubs, 3-Spades): ");
        int userSuit = scanner.nextInt();

        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(Card.SUITS[userSuit]);

        boolean found = false;

        for (Card card : hand) {
            if (card.equals(userCard)) {
                found = true;
                break;
            }
        }

        if (found) {
            printInfo();
        } else {
            System.out.println("Sorry, your card is not in the hand.");
        }
    }

    /**
     * A simple method to print out personal information.
     * Replace this information with your own.
     * @author JaskrianKaur
     * @date January 24, 2024
     * I am  done
     */
    private static void printInfo() {
        System.out.println("Congratulations, you guessed right!");
        System.out.println();

        System.out.println("My name is [Your Name]");
        System.out.println();
        
        System.out.println("I want to be a Successful Software Developer!!");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies include playing Basketball AND Coding");
        System.out.println("-- Investing");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Riding my motorcycle");

        System.out.println();
    }
}
