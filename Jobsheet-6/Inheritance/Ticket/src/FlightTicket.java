public class FlightTicket extends Ticket {
    protected String airline;
    protected int baggageWeight;

    public FlightTicket () {

    }

    public FlightTicket(String code, String name, String origin, String destination, int price, String airline, int baggageWeight) {
        super(code, name, origin, destination, price);
        this.airline = airline;
        this.baggageWeight = baggageWeight;
    }

    public int calculateBaggageCost() {
        return (baggageWeight <= 20 ? 0 : (baggageWeight - 20) * 50000);
    }

    public void showFlightTicket() {
        super.showTicket();
        System.out.println("Airline\t\t: " + airline);
        System.out.println("Baggage Weight\t: " + baggageWeight);
        System.out.println("Baggage Cost\t: " + calculateBaggageCost());
    }
}
