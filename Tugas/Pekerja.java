
package Tugas;

/**
 *
 * @author USer
 */
public class Pekerja extends Manusia {
    private double gaji;
    public Pekerja(String nama, int usia, String pekerjaan, int gaji){
        super(nama, usia, pekerjaan);
        this.gaji= gaji;
    }
    public double getGaji(){
        return gaji;
    }
    public void setGaji(){
        this.gaji = gaji;
    }
    @Override
    public String toString(){
        return "Nama     : " + getNama() +"\n" +
               "Usia     : " + usia + "tahun\n" +
               "Pekerjaan: " + pekerjaan + "\n" +
               "Gaji     : Rp" + gaji;
        
    }
}
