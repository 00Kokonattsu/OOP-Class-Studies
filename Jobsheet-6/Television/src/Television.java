public class Television {
    public String brand;
    public int totalChannel;
    private int activeChannel = 1;

    public Television(String brand, int totalChannel) {
        this.brand = brand;
        this.totalChannel = totalChannel;
    }

    public void switchChannel(int newChannel) {
        activeChannel = newChannel;
    }

    public int getActiveChannel() {
        return activeChannel;
    }
}
