public class CinemaTest {
    public static void main(String[] args) throws Exception {
        Ticket ticket1 = new Ticket("Avengers: Endgame", -50000);
        System.out.println("Movie: " + ticket1.getMovieTitle());
        System.out.println("Ticket price: " + ticket1.getBasePrice());
        System.out.println("Payment Status? " + ticket1.getPaymentStatus());

        System.out.println("\nProcessing Payment");
        ticket1.makePayment();
        System.out.println("Newest Payment Status? " + ticket1.getPaymentStatus());
    }
}
