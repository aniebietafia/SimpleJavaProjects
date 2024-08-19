package exceptions;

public class PayCalculator {
    public double calculatePay(double hours, double payRate) throws NegativeInputException {
        if (hours > 40) {
            throw new IllegalArgumentException("Hours worked must be greater than or equal to 40");
        } else if (hours < 0 || payRate < 0) {
            throw new NegativeInputException();
        }

        return hours * payRate;
    };
}
