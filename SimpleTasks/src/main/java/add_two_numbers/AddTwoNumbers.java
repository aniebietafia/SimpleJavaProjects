package add_two_numbers;

import java.util.Objects;
import java.util.Scanner;

public class AddTwoNumbers {
    public void addTwoNumbers() {
        String commands = """
                p - begin
                h - help
                q - quit
                """;

        System.out.println("Welcome to add two numbers.");
        System.out.println(commands);

        Scanner scanner = new Scanner(System.in);
        String entry = scanner.next();
        boolean playAgain = true;

        if (Objects.equals(entry, "q")) {
            System.out.println("You exited the program. Goodbye|");
            scanner.close();
            return;
        }

        if (Objects.equals(entry, "p")) {
            while (playAgain) {
                System.out.println("Enter your first number:");
                double num1 = scanner.nextDouble();
                System.out.println("Enter your second number");
                double num2 = scanner.nextDouble();

                double total = num1 + num2;
                System.out.println("Your total is: " + total);

                System.out.println("Would you like to play again?");
                playAgain = scanner.nextBoolean();
            }
        } else if (Objects.equals(entry, "h")) {
            System.out.println(commands);
        }
    }
}
