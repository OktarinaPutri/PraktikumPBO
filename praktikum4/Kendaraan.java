
package praktikum4;

/**
 *
 * @author USer
 */
public class Kendaraan {
    private String nama;
    protected int kecepatanMaks;
    public String jenisMesin;
    
    public Kendaraan(String nama, int kecepatanMaks, String jenisMesin){
        this.nama = nama;
        this.kecepatanMaks = kecepatanMaks;
        this.jenisMesin = jenisMesin;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public int getKecepatanMaks(){
        return kecepatanMaks;
    }
    public void setKecepatanMaks(){
        this.kecepatanMaks = kecepatanMaks;
    }
    public String getJenisMesin(){
        return jenisMesin;
    }
    public void setJenisMesin(){
        this.jenisMesin = jenisMesin;
    }
    public void tampilkanInfoKendaraan(){
        System.out.println("Nama Kendaraan : " + nama);
        System.out.println("Kecepatan Maksimum :" + kecepatanMaks);
        System.out.println("Jenis Mesin " + jenisMesin);
    }
}
