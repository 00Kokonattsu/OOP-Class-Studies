public class Cetacean extends Mammal{
    double swimmingSpeed, divingDepth;
    boolean hasBlowhole = true;

    Cetacean(double swimmingSpeed, double divingDepth){
        this.swimmingSpeed = swimmingSpeed;
        this.divingDepth = divingDepth;
    }

    void swim(int speed){
        swimmingSpeed = speed;
    }

    void dive(int depth){
        divingDepth = depth;
    }

    @Override
    void eat(String food){
        System.out.println("This animal swallows " + food);
    }

    @Override
    void showInformation() {
        breathe();
        feedYoung();
        temperature();
        System.out.println("This animal is warm blooded: " + warmBlooded);
        System.out.println("This animal has blowhole: " + hasBlowhole);
        System.out.println("Swimming speed: " + swimmingSpeed + " km/h");
        System.out.println("Diving depth: " + divingDepth + " meters deep");
        eat(food);
    }
}