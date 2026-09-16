
package Tugas4_1;

/**
 *
 * @author USer
 */
class KendaraanDarat extends Kendaraan {
    int jumlahRoda;

    public KendaraanDarat(String nama, int kecepatan, int jumlahRoda) {
        super(nama, kecepatan);
        this.jumlahRoda = jumlahRoda;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Roda    : " + jumlahRoda);
    }
}
