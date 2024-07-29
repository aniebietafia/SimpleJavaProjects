package quota_calculator;

import java.util.Scanner;

public class QuotaCalculator {
    private double avg_sales = 10.0;
    private String message;
    //private StringBuilder message = new StringBuilder();

    public void quotaCalculator() {
        System.out.println("How many sales did you make for the week?");
        Scanner scanner = new Scanner(System.in);
        int no_of_sales = scanner.nextInt();
        scanner.close();

        if (no_of_sales < avg_sales) {
            double sales_short = avg_sales - no_of_sales;
            message = sales_short == 1 ? "You are " + sales_short + " sale short" : "You are " + sales_short + " sales short";
        } else {
            message = "Congratulations! You met your target for the week.";
        }

        System.out.println(message);
    }
}
