package credit_check;

import java.util.Scanner;

public class InstantCreditCheck {
    private int minimumPayCheck = 25000;
    private int minimumCreditScore = 700;
    private String message;

    public InstantCreditCheck() {}

    public String instantCreditCheck() {
        System.out.println("What is your monthly Pay Check?");
        Scanner scanner = new Scanner(System.in);
        int payCheck = scanner.nextInt();

        System.out.println("What is your credit score for the month?");
        int creditScore = scanner.nextInt();

        if (payCheck >= minimumPayCheck && creditScore >= minimumCreditScore) {
            message = "Your credit is approved.";
        } else {
            message = "You do not qualify for a credit.";
        }

        return message;
    }
}
