
package Tugas4;

/**
 *
 * @author USer
 */
public class Hewan {
    String nama;
    String jenis;
    
    public Hewan(String nama, String jenis){
        this.nama = nama;
        this.jenis = jenis;
    }
    
    public void tampilkanInfo(){
        System.out.println("Nama Hewan  : " +nama);
        System.out.println("Jenis       : " +jenis);
    }
    public void bersuara(){
        System.out.println(nama + "mengeluarkan suara");
    }
}
