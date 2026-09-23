
package Tugas5;

/**
 *
 * @author USer
 */
public class Main {
    public static void main(String[] args) {
        KeranjangBelanja keranjang = new KeranjangBelanja();

        keranjang.tambahProduk(new Buku("Bumi - Tere Liye", 118000));
        keranjang.tambahProduk(new Elektronik("TWS", 350000));
        keranjang.tambahProduk(new Pakaian("Jeans", 1500000));

        keranjang.tampilkanProduk();
    }
}
