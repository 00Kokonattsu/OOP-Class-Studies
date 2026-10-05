public class ModernTelevision extends Television {
    private String displayMode = "Antenna";
    private String dvd;

    public ModernTelevision(String mrk, int channelCount) {
        super(mrk, channelCount);
    }

    public void changeDisplayMode(String mode) {
        displayMode = mode;
    }

    public void playDVD() {
        System.out.println("Currently playing DVD: " + (dvd == null ? "Empty" : dvd));
    }

    public void insertDVD(String dvdTitle) {
        dvd = dvdTitle;
    }
}
