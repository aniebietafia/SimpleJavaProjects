package quota_calculator;

import java.util.Scanner;

public class QuotaCalculator {
    private int avg_sales = 10;
    private String message;
    //private StringBuilder message = new StringBuilder();

    public void quotaCalculator() {
        System.out.println("How many sales did you make for the week?");
        Scanner scanner = new Scanner(System.in);
        int no_of_sales = scanner.nextInt();
        scanner.close();

        if (no_of_sales < 0) {
            System.out.println("Sales cannot be less than 0");
            return;
        }

        if (no_of_sales == 0) {
            message = "You didn't make any sales this week.";
        } else if (no_of_sales < avg_sales) {
            int sales_short = avg_sales - no_of_sales;
            message = sales_short == 1 ? "You are " + sales_short + " sale short" : "You are " + sales_short + " sales short";
        }  else {
            message = "Congratulations! You met your target for the week.";
        }

        System.out.println(message);
    }
}
