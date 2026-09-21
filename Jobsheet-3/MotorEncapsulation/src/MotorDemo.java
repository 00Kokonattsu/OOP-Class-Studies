public class MotorDemo {
    public static void main(String[] args) throws Exception {
        Motor motor = new Motor();
        motor.printStatus();
        motor.addSpeed();

        motor.turnOnEngine();
        motor.printStatus();

        motor.addSpeed();
        motor.printStatus();

        motor.addSpeed();
        motor.printStatus();

        motor.addSpeed();
        motor.printStatus();

        motor.turnOffEngine();
        motor.printStatus();
    }
}
