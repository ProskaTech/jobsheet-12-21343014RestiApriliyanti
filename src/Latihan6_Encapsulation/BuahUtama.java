/*
 * Created By_21343014 Resti Apriliyanti
 */

package Latihan6_Encapsulation;

public class BuahUtama {
    public static void main(String[] args) {
        EncapsulationBuah apel = new EncapsulationBuah("Apel", "Rp.3000", "Merah");
        System.out.println("Nama Buah" +apel.getName() + "\nHarga : " +apel.getPrice() + "\nWarna : " +apel.getColor());

        apel.setColor("Hijau");
        apel.setprice("Rp.7000");

        System.out.println("\nInformasi terkait Apel setelah diupdate");
        System.out.println("Nama Buah" +apel.getName() + "\nHarga : " +apel.getPrice() + "\nWarna : " +apel.getColor());
    }
}
