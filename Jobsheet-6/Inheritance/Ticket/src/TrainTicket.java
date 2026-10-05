public class TrainTicket extends Ticket {
    protected int carriageNumber;
    protected String seatNumber;

    public TrainTicket() {

    }

    public TrainTicket(String code, String name, 
        String origin, String destination, int price, 
        int carriageNumber, String seatNumber) {
        super(code, name, origin, destination, price);
        this.carriageNumber = carriageNumber;
        this.seatNumber = seatNumber;
    }

    public void showTrainTicket() {
        System.out.println("===== Train Ticket =====");
        super.showTicket();
        System.out.println("Carriage Number\t: " + carriageNumber);
        System.out.println("Seat Number\t: " + seatNumber);
        System.out.println("Total Price\t: " + basePrice);
    }
}
