package Tugas;

/**
 *
 * @author USer
 */
public class Main {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Rolls Royce", "Ghost", 2022, 12);
        Mobil mobil2 = new Mobil("Bugatti", "Veyron", 2021, 29);
        System.out.println("\nMenguji menyalakan mesin");
        mobil1.startEngine();
        mobil2.startEngine();
        mobil1.display();
        mobil2.display();

        System.out.println("\nMengubah tipe");
        mobil2.gantiTipe( 20);

        System.out.println("\nInformasi mobil setelah pengubahan");
        mobil2.display();
    }
}