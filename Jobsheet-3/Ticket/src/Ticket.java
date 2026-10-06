public class Ticket {
    private String movieTitle;
    private double basePrice;
    private boolean paymentStatus;

    public Ticket(String title, double price) {
        movieTitle = title;
        if (price < 0) price = 35000;
        basePrice = price;
        paymentStatus = false;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void makePayment() {
        paymentStatus = true;
    }

    public boolean getPaymentStatus() {
        return paymentStatus;
    }
}
