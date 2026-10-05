public class DomesticFlightTicket extends FlightTicket {
    protected  int airportTax;

    public DomesticFlightTicket() {

    }

    public DomesticFlightTicket(String code, String name, String origin, String destination, int price, String airline, int baggageWeight, int airportTax) {
        super(code, name, origin, destination, price, airline, baggageWeight);
        this.airportTax = airportTax;
    }

    public void showDomesticFlightTicket() {
        System.out.println("===== Domestic Flight Ticket =====");
        super.showFlightTicket();
        System.out.println("Airport Tax\t: " + airportTax);
        System.out.println("Total Price\t: " + basePrice + calculateBaggageCost() + airportTax);
    }
}
