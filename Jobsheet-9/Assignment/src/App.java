public class App {
    public static void main(String[] args) throws Exception {
        Donkey don = new Donkey("Keledai", 4, "Hehehehe", "Grey");
        don.displayData();
        Gorilla gor = new Gorilla("Gulali", 4, "Haaum Hauum", "Black");
        gor.displayData();
        Lion lio = new Lion("CingaCing", 4, "Roaar Roaaar", "Brown");
        lio.displayData();
    }
}
