public class Lion extends Animal implements Carnivore{
    private String sound, furColor;
    
    public Lion (String name, int numberOfLegs, String sound, String furColor) {
        super(name, numberOfLegs);
        this.sound = sound;
        this.furColor = furColor;
    }

    public void displayFood () {
        System.out.println("Food: Meat");
    }

    public void displayData () {
        System.out.println("Type: Carnivore");
        displayFood();
        displayAnimal();
        System.out.println("Sound: " + sound);
        System.out.println("Fur: " + furColor);
        System.out.println();
    }
}
