
package Tugas4;

/**
 *
 * @author USer
 */
public class Main {
    public static void main(String[] args){
        Kucing kucing = new Kucing("Tejo");
        Anjing anjing = new Anjing("Helli");
        
        System.out.println("====Info Kucing====");
        kucing.tampilkanInfo();
        kucing.bersuara();
        
        System.out.println("\n====Info Anjing====");
        anjing.tampilkanInfo();
        anjing.bersuara();
        
    }
}
