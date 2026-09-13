
package Tugas;

/**
 *
 * @author USer
 */
public class Main {
    public static void main(String[] args) {
        
        // 1. Membuat objek Pekerja
        System.out.println("INFORMASI PEKERJA");
        Pekerja pekerja1 = new Pekerja("Buminian", 25, "Hr",8000000);
        System.out.println(pekerja1.toString());
        
        // 2. Ubah nama menggunakan setter
        System.out.println("\n=== SETELAH NAMA DIUBAH ===");
        pekerja1.setNama("Buminiora");
        System.out.println(pekerja1.toString());
        
        // 3. Uji akses langsung dengan atribut
        System.out.println("\nUJI AKSES LANGSUNG");
        
        // Akses public (pekerjaan) seharusnya bisa
        System.out.println("Pekerjaan (public): " + pekerja1.pekerjaan);
        
        // Akses protected (usia) seharusnya bisa karena package sama
        System.out.println("Usia (protected)  : " + pekerja1.usia + "tahun");
        System.out.println("Nama (via getter) : " + pekerja1.getNama());
        System.out.println("Gaji (via getter) : " + pekerja1.getGaji());
    }
}