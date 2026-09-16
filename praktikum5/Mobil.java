
package praktikum5;

/**
 *
 * @author USer
 */
class Mobil extends Kendaraan {
    int jumlahPintu;
    
    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Jumlah Pintu  : " + jumlahPintu);
    }
}

