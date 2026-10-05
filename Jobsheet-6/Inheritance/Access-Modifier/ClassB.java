public class ClassB extends ClassA {
    private int z;

    public void setZ(int z) {
        this.z = z;
    }

    public void getValueZ() {
        System.out.println("value z: " + z);
    }

    public void getTotal() {
        System.out.println("Total: " + (x + y + z));
    }
}