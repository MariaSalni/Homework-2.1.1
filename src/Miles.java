public class Miles {
    public static void main(String[] args) {
        // заполнить стоимость билета
        int ticketPrice = 10_000;
        // 1 миля равна 20 рублям
        int miles = 20;

        int accruedMiles = ticketPrice/miles;
        System.out.println(accruedMiles);
    }
}
