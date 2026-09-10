public class TestBarang {
    public static void main(String[] args) throws Exception {
        Barang brg1 = new Barang();
        brg1.namaBrg = "Pensil";
        brg1.jenisBrg = "ATK";
        brg1.stok = 10;
        brg1.tampilBarang();
        // Do both print and fill parameter for adding item stock
        System.out.println("Stok Baru adalah " + brg1.tambahStok(20));
    }
}
