import java.util.Random;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean continueRolling;

        do {
            continueRolling = false;
            int rollCount = 0;

            // Print table header
            System.out.printf("%-5s %-5s %-5s %-5s %-5s%n", "Roll", "Die1", "Die2", "Die3", "Sum");
            System.out.println("----------------------------------------------------------");

            while (true) {
                rollCount++;
                int die1 = random.nextInt(6) + 1; // Generate random number between 1 and 6
                int die2 = random.nextInt(6) + 1;
                int die3 = random.nextInt(6) + 1;
                int sum = die1 + die2 + die3;

                // Print the results of the roll
                System.out.printf("%-5d %-5d %-5d %-5d %-5d%n", rollCount, die1, die2, die3, sum);

                // Check for a triple
                if (die1 == die2 && die2 == die3) {
                    System.out.println("You rolled a triple! Game over.");
                    break;
                }
            }

            // Ask user if they want to continue
            System.out.print("Do you want to roll again? (yes/no): ");
            String response = scanner.nextLine().trim().toLowerCase();
            if (response.equals("yes")) {
                continueRolling = true;
            }

        } while (continueRolling);

        System.out.println("Thank you for playing!");
        scanner.close();
    }
}

