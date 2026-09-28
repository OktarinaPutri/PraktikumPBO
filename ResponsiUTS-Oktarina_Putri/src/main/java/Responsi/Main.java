
package Responsi;

/**
 *
 * @author USer
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("1. Output Produk");
        Produk produk1 = new Elektronik("Laptop", 15000000, 2);
        produk1.tampilkanInfo();

        System.out.println();
        System.out.println("2. Output Pegawai");
        Pegawai pegawai1 = new PegawaiTetap("Budi", 5000000, 1000000); // ganti "Budi" dengan namamu
        pegawai1.tampilkanInfo();

        System.out.println();
        System.out.println("3. Output Polimorfisme");
        Produk produk2 = new Makanan("Snack", 15000, "2023-12-30");
        produk2.tampilkanInfo();

        System.out.println();
        Pegawai pegawai2 = new PegawaiKontrak("Andi", 3000000, 12);
        pegawai2.tampilkanInfo();
    }
}