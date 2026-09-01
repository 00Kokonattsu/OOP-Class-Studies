public class Lagomorpha extends Mammal {
    double jumpingHeight, runningSpeed;

    Lagomorpha(double jumpingHeight, double runningSpeed){
        this.jumpingHeight = jumpingHeight;
        this.runningSpeed = runningSpeed;
    }

    void jump(int height){
        jumpingHeight = height;
    }

    void run(int speed){
        runningSpeed = speed;
    }

    @Override
    void eat(String food){
        System.out.println("This animal forages " + food);
    }

    @Override
    void showInformation(){
        breathe();
        feedYoung();
        temperature();
        System.out.println("This animal is warm blooded: " + warmBlooded);
        System.out.println("Jumping height: " + jumpingHeight + " centimeters tall");
        System.out.println("Running speed: " + runningSpeed + " km/h");
        eat(food);
    }
}
