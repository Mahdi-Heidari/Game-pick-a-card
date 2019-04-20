package playingcard;

import java.util.Random;

public class PlayingCard {

    public static void main(String[] args) {

        Random random = new Random();
        int rank, suit;

        rank = random.nextInt(14);
        suit = random.nextInt(4);

        switch (rank) {

            case 0:
                System.out.print("The card you picked is Ace of ");
                break;
            case 1:
                System.out.print("The card you picked is 1 of ");
                break;
            case 2:
                System.out.print("The card you picked is 2 of ");
                break;
            case 3:
                System.out.print("The card you picked is 3 of ");
                break;
            case 4:
                System.out.print("The card you picked is 4 of ");
                break;
            case 5:
                System.out.print("The card you picked is 5 of ");
                break;
            case 6:
                System.out.print("The card you picked is 6 of ");
                break;
            case 7:
                System.out.print("The card you picked is 7 of ");
                break;
            case 8:
                System.out.print("The card you picked is 8 of ");
                break;
            case 9:
                System.out.print("The card you picked is 9 of ");
                break;
            case 10:
                System.out.print("The card you picked is 10 of ");
                break;
            case 11:
                System.out.print("The card you picked is Jack of ");
                break;
            case 12:
                System.out.print("The card you picked is Queen of ");
                break;
            case 13:
                System.out.print("The card you picked is King of ");
                break;

            default:

                System.out.println("Something went wrong!");

        }

        switch (suit) {

            case 0:
                System.out.print("Clubs!\n\n");
                break;
            case 1:
                System.out.print("Diamonds!\n\n");
                break;
            case 2:
                System.out.print("Hearts!\n\n");
                break;
            case 3:
                System.out.print("Spades!\n\n");
                break;

            default:

                System.out.println("Something went wrong!");

        }
    }

}
