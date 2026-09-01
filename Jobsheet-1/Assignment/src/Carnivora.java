public class Carnivora extends Mammal {
    double runningSpeed, bitingForce;
    boolean hasSharpClaws = true;

    Carnivora(double runningSpeed, double bitingForce){
        this.runningSpeed = runningSpeed;
        this.bitingForce = bitingForce;
    }

    void chase(int speed){
        runningSpeed = speed;
    }

    void maul(int force){
        bitingForce = force;
    }

    void eat(String food){
        System.out.println("This animal hunts and bite " + food);
    }

    @Override
    void showInformation(){
        breathe();
        feedYoung();
        temperature();
        System.out.println("This animal is warm blooded: " + warmBlooded);
        System.out.println("Running speed: " + runningSpeed + " km/h");
        System.out.println("Biting force: " + bitingForce + " kg");
        eat(food);
    }
}
