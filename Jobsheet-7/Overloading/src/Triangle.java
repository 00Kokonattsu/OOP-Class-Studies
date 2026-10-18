public class Triangle {
    private int angle;

    public int totalAngle (int angleA) {
        return angle = 180 - angleA;
    }

    public int totalAngle (int angleA, int angleB) {
        return angle = 180 - (angleA + angleB);
    }

    public int perimeter (int sideA, int sideB, int sideC) {
        return sideA + sideB + sideC;
    }

    public double perimeter (int sideA, int sideB) {
        return Math.sqrt(((sideA * sideA) + (sideB * sideB)));
    }
}