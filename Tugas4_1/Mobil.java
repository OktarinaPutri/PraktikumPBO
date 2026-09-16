
package Tugas4_1;

/**
 *
 * @author USer
 */
class Mobil extends KendaraanDarat {
    int jumlahPintu;

    public Mobil(String nama, int kecepatan, int jumlahPintu) {
        super(nama, kecepatan, 4); 
        this.jumlahPintu = jumlahPintu;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Pintu   : " + jumlahPintu);
    }
}