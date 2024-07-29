package input_validation;

import java.util.Scanner;

public class InputValidation {
    public String input_validation() {
        int hourlyPay = 15;
        int maxHours = 40;
        int grossPay = 0;

        System.out.println("How many hours have you worked this week?");
        Scanner scanner = new Scanner(System.in);
        int hoursWorked = scanner.nextInt();

        while (hoursWorked > maxHours || hoursWorked < 0) {
            System.out.println("Invalid entry.");
            System.out.println("How many hours have you worked this week?");
            hoursWorked = scanner.nextInt();

        }

        scanner.close();

        grossPay = hourlyPay * hoursWorked;
        return "Your gross pay for the week is " + grossPay;
    }
}
