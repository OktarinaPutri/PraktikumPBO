
package Tugas4;

/**
 *
 * @author USer
 */
class Kucing extends Hewan{
    public Kucing(String nama){
        super(nama, "Kucing");
    }
    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Kucing "+nama+" suka makan");
    }
    @Override
    public void bersuara(){
        System.out.println(nama + " bersuara Meong");
    }
}
