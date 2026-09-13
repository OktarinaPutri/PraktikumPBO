
package praktikum4;

/**
 *
 * @author USer
 */
public class Mobil extends Kendaraan {
    private int jumlahPintu;
    public Mobil (String nama, int kecepatanMaks, String jenisMesin, int jumlahPintu){
        super(nama, kecepatanMaks, jenisMesin);
        this.jumlahPintu = jumlahPintu;
    }
    
    public void tampilkanInfoMobil(){
        System.out.println("Kecepatan Maksimal mobil : " + kecepatanMaks + " km/h");
        System.out.println("Jumlah pintu : " + jumlahPintu);
    }
}
