
package Tugas4;

/**
 *
 * @author USer
 */
class Anjing extends Hewan {
    public Anjing (String nama){
        super(nama, "Anjing");
    }
    
    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Anjing "+nama+ " suka berjaga");
    }
    @Override
    public void bersuara(){
        System.out.println(nama + " bersuara GUK");
    }
}
