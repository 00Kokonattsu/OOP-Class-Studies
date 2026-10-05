public class TestTelevision {
    public static void main(String[] args) throws Exception {
        ModernTelevision tv = new ModernTelevision("Samsong", 100);
        System.out.println("Active channel: " + tv.getActiveChannel());
        tv.switchChannel(20);
        System.out.println("Current active channel: " + tv.getActiveChannel());
        tv.changeDisplayMode("HDMI");
        tv.playDVD();
        tv.insertDVD("The Matrix");
        tv.playDVD();
    }
}
