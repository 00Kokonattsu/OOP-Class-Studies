public class AirConditioner {
    private String brand;
    private int productionYear;
    private Compressor mainCompressor;
    private Remote mainRemote;

    public AirConditioner (String brand, int productionYear, Compressor cmprssr, Remote rmt) {
        this.brand = brand;
        this.productionYear = productionYear;
        mainCompressor = cmprssr;
        mainRemote = rmt;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public Compressor getMainCompressor() {
        return mainCompressor;
    }

    public void setMainCompressor(Compressor comp) {
        mainCompressor = comp;
    }

    public Remote getMainRemote() {
        return mainRemote;
    }

    public void setMainRemote(Remote rmt) {
        mainRemote = rmt;
    }
}
