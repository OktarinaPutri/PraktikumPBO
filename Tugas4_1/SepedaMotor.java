
package Tugas4_1;

/**
 *
 * @author USer
 */
class SepedaMotor extends KendaraanDarat {
    String jenisMesin;

    public SepedaMotor(String nama, int kecepatan, String jenisMesin) {
        super(nama, kecepatan, 2); // motor selalu 2 roda
        this.jenisMesin = jenisMesin;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis Mesin    : " + jenisMesin);
    }
}
