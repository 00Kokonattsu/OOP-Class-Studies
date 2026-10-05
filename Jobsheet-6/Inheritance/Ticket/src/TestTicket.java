public class TestTicket {
    public static void main(String[] args) throws Exception {
        TrainTicket train = new TrainTicket("KA-001", "Andi", "Malang", "Jakarta", 350000, 3, "12A");
        train.showTrainTicket();
        DomesticFlightTicket domestic = new DomesticFlightTicket("GA-102", "Sinta", "Surabaya", "Denpasar", 900000, "Garuda Indonesia", 25, 75000);
        domestic.showDomesticFlightTicket();
        InternationalFlightTicket international = new InternationalFlightTicket("SQ-205", "Budi", "Jakarta", "Singapura", 2500000, "Singapore Airlines", 20, "C1234567", 150000);
        international.showInternationalFlightTicket();
    }
}
