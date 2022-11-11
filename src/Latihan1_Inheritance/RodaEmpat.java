/*
 * Created By_21343014 Resti Apriliyanti
 */

package Latihan1_Inheritance;

public class RodaEmpat extends Kendaraan {
    double NaikHargaKe = 8;

    void hargaAkhir() {
        hargaDasar = hargaDasar + (hargaDasar * NaikHargaKe);
        System.out.println("Setelah dimodifikasi, harga mobil menjadi Rp." +hargaDasar);
    }
}
