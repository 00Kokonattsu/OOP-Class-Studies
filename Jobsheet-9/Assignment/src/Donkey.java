public class Donkey extends Animal implements Herbivore {
    private String sound, furColor;
    
    public Donkey (String name, int numberOfLegs, String sound, String furColor) {
        super(name, numberOfLegs);
        this.sound = sound;
        this.furColor = furColor;
    }

    public void displayFood () {
        System.out.println("Food: Plants");
    }

    public void displayData () {
        System.out.println("Type: Herbivore");
        displayFood();
        displayAnimal();
        System.out.println("Sound: " + sound);
        System.out.println("Fur: " + furColor);
        System.out.println();
    }
}
