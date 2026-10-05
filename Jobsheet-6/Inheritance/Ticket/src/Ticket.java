public class Ticket {
    protected String ticketCode, passengerName, origin, destination; 
    protected int basePrice;

    public Ticket(){

    }

    public Ticket(String code, String name, String origin, String destination, int price) {
        ticketCode = code;
        passengerName = name;
        this.origin = origin;
        this.destination = destination;
        basePrice = price;
    }

    public void showTicket() {
        System.out.println("Ticket Code\t: " + ticketCode);
        System.out.println("Passenger Name\t: " + passengerName);
        System.out.println("Route\t\t: " + origin + " - " + destination);
        System.out.println("Base Price\t: " + basePrice);
    }
}
