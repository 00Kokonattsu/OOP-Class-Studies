public class InternationalFlightTicket extends FlightTicket {
    protected String passportNumber;
    protected int insurance;

    public InternationalFlightTicket() {
        
    }

    public InternationalFlightTicket(String code, String name, String origin, String destination, int price, String airline, int baggageWeight, String passportNumber, int insurance) {
        super(code, name, origin, destination, price, airline, baggageWeight);
        this.passportNumber = passportNumber;
        this.insurance = insurance;
    }

    public void showInternationalFlightTicket() {
        System.out.println("===== International Flight Ticket =====");
        super.showFlightTicket();
        System.out.println("Passport Number\t: " + passportNumber);
        System.out.println("Insurance cost\t: " + insurance);
        System.out.println("Total Price\t: " + basePrice + calculateBaggageCost() + insurance);
    }
}
