import java.util.Scanner;

public class Guesser {
    public static void main(String[] args) {
        new Guesser(); 
    }

    public Guesser() {
        Scanner input = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            System.out.println("0) Exit");
            System.out.println("1) Human Guesser");
            System.out.println("2) Computer Guesser");
            System.out.print("\nPlease enter 0-2: ");
            
            choice = input.nextInt();
            input.nextLine(); 

            if (choice == 1) {
                humanGuesser(input);
            } else if (choice == 2) {
                computerGuesser(input);
            } else if (choice == 0) {
                System.out.println("Goodbye!");
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
        input.close();
    }

    private void humanGuesser(Scanner input) {
        int numberToGuess = (int)(Math.random() * 100) + 1; 
        int guess = -1;
        int tries = 0;

        System.out.println("\nhuman guesser");

        while (guess != numberToGuess) {
            tries++;
            System.out.print(tries + ") Please enter a number: ");
            guess = input.nextInt();
            input.nextLine(); 

            if (guess < numberToGuess) {
                System.out.println("too low...");
            } else if (guess > numberToGuess) {
                System.out.println("too high...");
            } else {
                System.out.println("got it!");
                System.out.println("\nVery good!\n");

            
                if (tries <= 5) {
                    System.out.println("Wow, you’re a natural at this! ");
                } else if (tries <= 10) {
                    System.out.println("Good job! Practice makes perfect. ");
                } else {
                    System.out.println("Keep trying, you’ll get faster next time!");
                }
            }
        }
    }

    private void computerGuesser(Scanner input) {
        int low = 1;
        int high = 100;
        String response = "";
        int guess;
        int tries = 0;

        System.out.println("\ncomputer guesser");
        System.out.println("Think of a number between 1 and 100!");

        while (!response.equalsIgnoreCase("c")) {
            guess = (low + high) / 2;
            tries++;
            System.out.print(tries + ") I guess " + guess + "\nToo (H)igh, too (L)ow, or (C)orrect? ");
            response = input.nextLine().toLowerCase();

            if (response.equals("h")) {
                high = guess - 1;
            } else if (response.equals("l")) {
                low = guess + 1;
            } else if (response.equals("c")) {
                System.out.println("Yay! I guessed your number in " + tries + " tries!\n");

                // Extra credit: playful message for computer guessing
                if (tries <= 7) {
                    System.out.println("Binary search master! ");
                } else {
                    System.out.println("That took a bit, but I got it! ");
                }
            } else {
                System.out.println("Invalid response. Please enter H, L, or C.");
            }
        }
    }
}

