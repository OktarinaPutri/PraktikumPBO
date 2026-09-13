
package praktikum4;

public class Main {
    public static void main(String[] args) {
        Kendaraan mobil = new Kendaraan("RollRoyces", 250, "GTR");

        System.out.println("DATA KENDARAAN");
        System.out.println("Nama: " + mobil.getNama());
        System.out.println("Kecepatan maks: " + mobil.getKecepatanMaks());
        System.out.println("Jenis Mesin: " + mobil.getJenisMesin());
        
        System.out.println("\nDATA MOBIL (SUBCLASS)");
        Mobil RollRoyces = new Mobil("Ghost RollRoyces", 290, "bensin V12", 2);
        RollRoyces.tampilkanInfoMobil();
        System.out.println("Jenis Mesin: " + RollRoyces.jenisMesin);
    }
}