
package Tugas5;

/**
 *
 * @author USer
 */
import java.util.ArrayList;
import java.util.List;

public class KeranjangBelanja {
    private List<Produk> daftarProduk;

    public KeranjangBelanja() {
        daftarProduk = new ArrayList<>();
    }

    public void tambahProduk(Produk produk) {
        daftarProduk.add(produk);
    }

    public double hitungTotalHargaSetelahDiskon() {
        double total = 0;
        for (Produk p : daftarProduk) {
            total += p.getHargaSetelahDiskon();
        }
        return total;
    }

    public void tampilkanProduk() {
        for (Produk product : daftarProduk) {
            System.out.println("Nama: " + product.getNama());
            System.out.println("Harga: " + product.getHarga());
            System.out.println("Diskon: " + product.hitungDiskon());
            System.out.println("Harga Setelah Diskon: " + product.getHargaSetelahDiskon());
            System.out.println();
        }
    }
}