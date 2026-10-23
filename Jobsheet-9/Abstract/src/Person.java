public class Person {
    private String name;
    private Animal petAnimal;

    public Person(String name) {
        this.name = name;
    }

    public void adoptedAnimal (Animal animal) {
        this.petAnimal = animal;
    }

    
    public void takePetForWalk () {
        System.out.println("My name is: " + this.name);
        System.out.println("My pet moves by: ");
        this.petAnimal.moving();
        System.out.println("-----------------------------------");
    }
}
