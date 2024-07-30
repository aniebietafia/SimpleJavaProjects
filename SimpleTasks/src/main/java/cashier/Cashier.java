package cashier;

import java.util.Scanner;

public class Cashier {

    public String cashier() {
        System.out.println("How many quantity would you like to enter?");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();

        double total = 0.0;

        for (int i = 0; i < quantity; ++i) {
            System.out.println("Enter the price of the item.");
            int price = scanner.nextInt();
            total += price;
        }

        scanner.close();

        return "Your total for " + quantity + " quantity is " + total;
    }
}
