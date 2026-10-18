public class MyMultiplication {
    void multiplication (int a, int b) {
        System.out.println(a * b);
    }

    void multiplication (double a, double b) {
        System.out.println(a * b);
    }

    void multiplication (int a, int b, int c) {
        System.out.println(a * b * c);
    }

    public static void main(String[] args) throws Exception {
        MyMultiplication object = new MyMultiplication();

        object.multiplication(25, 43);
        object.multiplication(34, 23, 56);
        object.multiplication(34.56, 23.7);
    }
}
