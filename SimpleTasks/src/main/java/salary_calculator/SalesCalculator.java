package salary_calculator;

import java.util.Scanner;

public class SalesCalculator {
    public void execute() {
        double salesPay = 1000;
        int max_sales = 10;
        double bonus = 250;

        System.out.println("How many sales did you make for the week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        if (sales > max_sales) {
            salesPay = salesPay + bonus;
        }

        System.out.println("Your sales for the week is: " + salesPay);
    }
}
