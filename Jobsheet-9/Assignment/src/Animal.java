public abstract class Animal {
    protected String name;
    protected int numberOfLegs;

    public Animal (String name, int numberOfLegs) {
        this.name = name;
        this.numberOfLegs = numberOfLegs;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getName () {
        return name;
    }

    public void setNumberOfLegs (int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public int getNumberOfLegs () {
        return numberOfLegs;
    }

    public void displayAnimal () {
        System.out.println("Name: " + name);
        System.out.println("Number of Legs: " + numberOfLegs);
    }
}
