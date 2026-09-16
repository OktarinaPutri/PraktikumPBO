
package praktikum5;

/**
 *
 * @author USer
 */
class SepedaMotor extends Kendaraan {
    String jenisMesin;
    
    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Jenis Mesin   : " + jenisMesin);
    }
}
