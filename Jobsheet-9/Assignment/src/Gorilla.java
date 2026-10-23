public class Gorilla extends Animal implements Carnivore, Herbivore {
    private String sound, furColor;

    public Gorilla (String name, int numberOfLegs, String sound, String furColor) {
        super(name, numberOfLegs);
        this.sound = sound;
        this.furColor = furColor;
    }

    @Override
    public void displayFood () {
        System.out.println("Food: Meat + Plants");
    }

    public void displayData () {
        System.out.println("Type: Carnivore + Herbivore");
        displayFood();
        displayAnimal();
        System.out.println("Sound: " + sound);
        System.out.println("Fur: " + furColor);
        System.out.println();
    }
}
