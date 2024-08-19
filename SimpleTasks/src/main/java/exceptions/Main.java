package exceptions;

public class Main {
    public static void main(String[] args) throws NegativeInputException {
        //MultipleExceptionHandling fileHandler = new MultipleExceptionHandling();
        //fileHandler.readFile();
        PayCalculator payCalculator = new PayCalculator();
        System.out.println(payCalculator.calculatePay(40, 15));
    }
}
