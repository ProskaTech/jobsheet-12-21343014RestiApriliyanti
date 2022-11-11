/*
 * Created By_21343014 Resti Apriliyanti
 */

package Latihan1_Inheritance;

class RodaDua extends Kendaraan {
    double NaikHargaKe = 0.20;

    void hargaAkhir() {
        hargaDasar = hargaDasar + (hargaDasar * NaikHargaKe);
        System.out.println("Setelah dimodifikasi, harga sepeda menjadi Rp." +hargaDasar);
    }
}
