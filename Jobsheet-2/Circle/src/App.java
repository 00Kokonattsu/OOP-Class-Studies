public class App {
    public static void main(String[] args) throws Exception {
        Circle crcl1 = new Circle(7);

        System.out.println("The area of a circle with a radius of " + crcl1.r + " unit is " + crcl1.calculateArea());
        System.out.println("The circumference of a circle with a radius of " + crcl1.r + " unit is " + crcl1.calculateCircumference());

        Barang brg1 = new Barang("001", "Pensil", 1000, 10);
        System.out.println("Harga " + brg1.namaBarang + " adalah " + brg1.hitungHargaJual());
        brg1.tampilData();
    }
}
