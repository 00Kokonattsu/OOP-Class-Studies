public class ClassB extends ClassA {
    public int z;

    public void getValueZ() {
        System.out.println("value z: " + z);
    }

    public void getTotal() {
        System.out.println("total: " + (x + y + z));
    }
}
