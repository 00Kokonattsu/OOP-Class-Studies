public class Motor {
    private int speed = 0;
    private boolean ignitionOn = false;

    public void turnOnEngine(){
        ignitionOn = true;
    }

    public void turnOffEngine(){
        ignitionOn = false;
        speed = 0;
    }

    public void addSpeed(){
        if(ignitionOn == true){
            speed += 5;
        } else {
            System.out.println("Speed can't increase because engine is off!\n");
        }
    }

    public void substractSpeed(){
        if (ignitionOn == true) {
            speed -= 5;
        } else {
            System.out.println("Speed can't be decreased because engine is off!\n");
        }
    }

    public void printStatus() {
        if (ignitionOn == true) {
            System.out.println("Ignition On");
        } else {
            System.out.println("Ignition Off");
        }
        System.out.println("Speed " + speed + "\n");
    }
}