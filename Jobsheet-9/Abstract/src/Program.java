public class Program {
    public static void main(String[] args) throws Exception {
        Cat villageCat = new Cat();
        Fish dolphin = new Fish();
        Bird chicken = new Bird();

        Person ani = new Person("Ani");
        Person budi = new Person("Budi");
        Person andi = new Person("Andi");

        ani.adoptedAnimal(villageCat);
        budi.adoptedAnimal(dolphin);
        andi.adoptedAnimal(chicken);


        ani.takePetForWalk();
        budi.takePetForWalk();
        andi.takePetForWalk();
    }
}
