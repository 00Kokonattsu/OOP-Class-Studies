public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("\nMammal");
        Mammal placeholder = new Mammal();
        placeholder.showInformation();

        System.out.println("\nDolphin");
        Cetacean dolphin = new Cetacean(20, 50);
        dolphin.dive(70);
        dolphin.swim(25);
        dolphin.eat("fish");
        dolphin.bodyTemperature = 37;
        dolphin.showInformation();

        System.out.println("\nRabbit");
        Lagomorpha rabbit = new Lagomorpha(30, 10);
        rabbit.run(15);
        rabbit.jump(40);
        rabbit.eat("grass");
        rabbit.bodyTemperature = 39;
        rabbit.showInformation();

        System.out.println("\nTiger");
        Carnivora tiger = new Carnivora(30, 50);
        tiger.chase(50);
        tiger.maul(70);
        tiger.eat("deer");
        tiger.bodyTemperature = 38;
        tiger.showInformation();
    }
}
