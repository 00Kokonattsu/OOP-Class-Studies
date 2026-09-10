public class StoreMain {
    public static void main(String[] args) throws Exception {
        RentTransaction game1 = new RentTransaction();
        game1.id = 001;
        game1.memberName = "Ali";
        game1.gameName = "Call of Duty";
        game1.pricePerDay = 1;
        game1.showInformation();
        game1.showTotalCost(7);
    }
}
