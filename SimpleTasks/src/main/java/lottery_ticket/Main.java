package lottery_ticket;

public class Main {
    public static void main(String[] args) {
        LotteryTicket ticket = new LotteryTicket();
        int[] ticketArray = ticket.generateTicket();
        ticket.printTicket(ticketArray);
    }
}
