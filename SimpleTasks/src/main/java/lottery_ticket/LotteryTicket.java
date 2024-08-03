package lottery_ticket;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {
    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;

    public int[] generateTicket() {
        int[] ticket = new int[LENGTH];
        Random random = new Random();
        for (int i = 0; i < LENGTH; i++) {
            int randomNumber = random.nextInt(MAX_TICKET_NUMBER);
            while (searchArray(ticket, randomNumber)) {
                randomNumber = random.nextInt(MAX_TICKET_NUMBER);
            }
            ticket[i] = randomNumber;
        }
        return ticket;
    }

    public boolean searchArray(int[] ticket, int number) {
        for (int value : ticket) {
            if (value == number) {
                return true;
            }
        }
        return false;
    }

    public void printTicket(int[] ticket) {
        Arrays.sort(ticket);
        for (int j : ticket) {
            System.out.print(j + " | ");
        }
    }
}
