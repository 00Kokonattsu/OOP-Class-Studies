class Barang {
    String kode, namaBarang;
    int hargaDasar;
    float diskon;

    Barang(String k, String nB, int hD, float d) {
        kode = k;
        namaBarang = nB;
        hargaDasar = hD;
        diskon = d;
    }

    float hitungHargaJual() {
        return hargaDasar - (hargaDasar*diskon/100);
    }

    void tampilData() {
        System.out.println("Kode: " + kode + "\nNama barang: " 
        + namaBarang + "\nHarga dasar: " + hargaDasar + "\nDiskon: " 
        + diskon);
    }
}