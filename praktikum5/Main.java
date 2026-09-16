
package praktikum5;

/**
 *
 * @author USer
 */
public class Main {
    public static void main(String[] args){
        Mobil mobil = new Mobil();
        mobil.nama = "RollsRoyce";
        mobil.kecepatan = 240;
        mobil.jumlahPintu = 2;
        mobil.tampilkanInfo();
        
        SepedaMotor motor = new SepedaMotor();
        motor.nama = "Honda";
        motor.kecepatan = 125;
        motor.jenisMesin = "2-tak";
        motor.tampilkanInfo();
    }
}