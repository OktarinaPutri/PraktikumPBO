
package Tugas4_1;

/**
 *
 * @author USer
 */
public class Main {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Toyota Avanza", 160, 4);
        SepedaMotor motor = new SepedaMotor("Yamaha NMAX", 110, "4-tak");

        System.out.println("=== Info Mobil ===");
        mobil.tampilkanInfo();

        System.out.println("\n=== Info Sepeda Motor ===");
        motor.tampilkanInfo();

    }
}
