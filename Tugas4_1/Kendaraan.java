
package Tugas4_1;

/**
 *
 * @author USer
 */
class Kendaraan {
    String nama;
    int kecepatan;
    public Kendaraan(String nama, int kecepatan){
        this.nama = nama;
        this.kecepatan = kecepatan;
    }
    public void tampilkanInfo(){
        System.out.println("Nama Kendaraan : " +nama);
        System.out.println("Kecepatan      : " +kecepatan+ " km/jam");
    }
}
