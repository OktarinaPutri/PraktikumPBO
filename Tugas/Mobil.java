
package Tugas;

/**
 *
 * @author USer
 */    

public class Mobil {
    private String merek;
    private String model;
    private int tahun;
    private int tipe;

    public Mobil(String merk, String model, int tahun, int tipe) {
        this.merek = merk;
        this.model = model;
        this.tahun = tahun;
        this.tipe = tipe;
    }
    public String getMerek() {
        return merek;
    }
    public void setMerek(String merek) {
        this.merek = merek;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getTahun() {
        return tahun;
    }
    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
    public int getTipe(){
        return tipe;
    }
    public void setTipe(){
        this.tipe = tipe;
    }
    public void startEngine(){
        System.out.println("Mesin mobil " + merek + " menyala");
    }
    public void gantiTipe(int tipeBaru){
        this.tipe = tipeBaru;
        System.out.println("Tipe mobil " + merek +" berhasil diubah menjadi tipe "+ tipeBaru + "." );
    }
    public void display() {
        System.out.println("\nMerek : " + merek);
        System.out.println("Model : " + model);
        System.out.println("Tahun : " + tahun);
        System.out.println("Tipe  : " + tipe);
    }
}