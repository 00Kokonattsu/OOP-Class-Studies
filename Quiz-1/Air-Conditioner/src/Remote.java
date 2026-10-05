public class Remote {
    private String language;
    private int batteryNumber;

    public Remote(String lang, int battNum) {
        language = lang;
        batteryNumber = battNum;
    }

    public String getLanguage () {
        return language;
    }

    public void setLanguage(String lang) {
        language = lang;
    }

    public int getBatteryNumber () {
        return batteryNumber;
    }

    public void setBatteryNumber(int battNum) {
        batteryNumber = battNum;
    }
}
